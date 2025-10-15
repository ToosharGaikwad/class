package controller;

import java.time.LocalDate;
import model.*;

public class BankController {
    BankDAO dao = new BankDAO();
    static int transCounter = 1;

    // --- Account Lifecycle ---
    public void openAccount(int choice, int accNo, String name, double balance) {
        BankAccount account;

        switch (choice) {
            case 1:
                account = new SavingAccount(accNo, name, balance, "Saving");
                break;
            case 2:
                account = new SalaryAccount(accNo, name, balance);
                break;
            case 3:
                account = new CurrentAccount(accNo, name, balance, "Current", 50000);
                break;
            case 4:
                account = new LoanAccount(accNo, name, "Loan", -balance, 12);
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        dao.saveAccount(account);
        System.out.println(account.getAccType() + " account opened successfully for " + name);
    }


    public void closeAccount(int accNo) {
        boolean removed = dao.removeAccount(accNo);
        if (removed)
            System.out.println(" Account closed successfully!");
        else
            System.out.println(" Account not found!");
    }

    // --- Over-the-counter Activities ---
    public void deposit(int accNo, double amount) {
        BankAccount acc = dao.findAccount(accNo);
        if (acc != null) {
        	
            acc.deposit(amount);
            Transaction t = new Transaction(transCounter++, accNo, "Deposit", amount, acc.getBalance(), LocalDate.now());
            dao.saveTransaction(t);
            System.out.println(" Deposit successful!");
        } else {
            System.out.println(" Account not found!");
        }
    }

    public void withdraw(int accNo, double amount) {
        BankAccount acc = dao.findAccount(accNo);
        if (acc != null) {
            boolean success = acc.withdraw(amount);
            if (success) {
                Transaction t = new Transaction(transCounter++,accNo, "Withdraw", amount, acc.getBalance(), LocalDate.now());
                dao.saveTransaction(t);
                System.out.println("Withdraw successful!");
            } else {
                System.out.println("Insufficient balance or account frozen!");
            }
        } else {
            System.out.println("Account not found!");
        }
    }

    public void transfer(int senderAccNo, int receiverAccNo, double amount) {
        BankAccount sender = dao.findAccount(senderAccNo);
        BankAccount receiver = dao.findAccount(receiverAccNo);

        if (sender == null || receiver == null) {
            System.out.println(" Sender or receiver account not found!");
            return;
        }

        if (sender.withdraw(amount)) {
            receiver.deposit(amount);
            dao.saveTransaction(new Transaction(transCounter++, senderAccNo, "Transfer Sent", amount, sender.getBalance(), LocalDate.now()));
            dao.saveTransaction(new Transaction(transCounter++, receiverAccNo, "Transfer Received", amount, receiver.getBalance(), LocalDate.now()));
            System.out.println(" Transfer successful!");
        } else {
            System.out.println(" Transfer failed — insufficient funds!");
        }
    }

    // --- Interest Calculation ---
    public void calculateInterest() {
        for (BankAccount acc : dao.getAllAccounts()) {
            double interest = acc.getBalance() * (BankAccount.getInterestRate() / 100);
            acc.deposit(interest);
            System.out.println(" Interest added for account: " + acc.getAccountNumber() + " | Amount: " + interest);
        }
    }

    // --- End of Day Report ---
    public void generateEndOfDayReport() {
        System.out.println("\n--- End of Day Transaction Report ---");
        for (Transaction t : dao.getAllTransactions()) {
            System.out.println(t);
        }
        System.out.println("----------------------------------------");
    }
    public void loadDummyData() {
        // Savings Accounts
        dao.saveAccount(new SavingAccount(101, "Aarav", 15000, "Saving"));
        dao.saveAccount(new SavingAccount(102, "Isha", 22000, "Saving"));

        // Salary Accounts
        dao.saveAccount(new SalaryAccount(201, "Rohit", 30000));
        dao.saveAccount(new SalaryAccount(202, "Priya", 28000));

        // Current Accounts
        dao.saveAccount(new CurrentAccount(301, "Rahul", 50000, "Current", 75000));
        dao.saveAccount(new CurrentAccount(302, "Sneha", 45000, "Current", 50000));

        // Loan Accounts (negative balance = loan amount)
        dao.saveAccount(new LoanAccount(401, "Kiran", "Loan", -100000, 12));
        dao.saveAccount(new LoanAccount(402, "Manoj", "Loan", -50000, 10));

        // Mixed type for extra variety
        dao.saveAccount(new SavingAccount(103, "Suman", 18000, "Saving"));
        dao.saveAccount(new SalaryAccount(203, "Deepak", 25000));

        System.out.println("✅ 10 sample accounts loaded successfully for testing!\n");
    }


	public void showAllAccounts() {
		// TODO Auto-generated method stub
		for(BankAccount acc:dao.getAllAccounts()) {
			acc.display();
		}
	}


	public void freezAccount() {
		// TODO Auto-generated method stub
		for (BankAccount acc : dao.getAllAccounts()) {
		    if (acc instanceof SalaryAccount) {
		        SalaryAccount sa = (SalaryAccount) acc;
		   
		        if(sa.isFrozen()) {
		        	sa.setFrozen(false);
		        }
		        sa.setFrozen(true);
		    }
		}

		
	}
	

}
