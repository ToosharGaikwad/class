//package controler;
//
//import java.util.Date;
//import java.util.Scanner;
//
//public class Bank {
//	Scanner sc = new Scanner(System.in);
//	int count = 0;
//	int Account[];
//	
//	public Bank(int accountBal, int accountNumber, String holderName, String holderAddress, String accountType,
//			 int[] transaction, int[] bankAccount) {
//		super();
//		this.bankAccount = bankAccount;
//	}
//	
//	static String branchName;
//	static {
//		String branchName = "deogaon";
//	}
//	
//	
//	
//	public void openBankAccount(int bankAccount[]){
//		for(int i=0;i<bankAccount.length;i++) {
//			System.out.print("Holder Name: ");
//			String name = sc.nextLine();
//
//			System.out.print("Holder Address: ");
//			String address = sc.nextLine();
//
//			System.out.print("Balance: ");
//			int balance = sc.nextInt();
//			sc.nextLine(); // consume newline
//
//			int accountNumber = 1201;
//			 accountNumber++;
//			
//		}
//		bankAccount[count++];
//		
//	}
//	public void closeBankAccount(int accountNumber ,int bankAccount[], int removeAc) {
//		
//		for(int i=0;i<count;i++) {
//			if(removeAc==bankAccount[i].getAccountNumber()) {
//				for (int j = i; j < count - 1; j++) {
//                    bankAccounts[j] = bankAccounts[j + 1];
//                }
//				 bankAccounts[--count] = null;				
//			}
//		}
//		
//		
//			
//	}
//	public void searchAccount() {
//		for(int i=0;i<count;i++) {
//			if(bankAccount[i].getAccountNumber()==accountNumber)
//		}
//	}
//	public void userTransaction() {}
//	public void trannsferMoney() {}
//	public void withdrawMoney() {}
//	public void dipositeMoney() {}
//	@Override
//	void withdraw() {}
//	@Override
//	void display() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//
//
//}








package controler;

import java.util.ArrayList;
import java.util.List;

import model.Transaction;

public class bank {
    private List<BankAccount> accounts = new ArrayList<>();
    private List<Transaction> transactions = new ArrayList<>();

    // Save a new account
    public void saveAccount(BankAccount account) {
        accounts.add(account);
    }

    // Find account by account number
    public BankAccount findAccount(int accNo) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        return null;
    }

    // Remove account (for close account feature)
    public boolean removeAccount(int accNo) {
        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            accounts.remove(acc);
            return true;
        }
        return false;
    }

    // Get all accounts
    public List<BankAccount> getAllAccounts() {
        return accounts;
    }

    // Store a transaction
    public void saveTransaction(Transaction t) {
        transactions.add(t);
    }

    // Get all transactions
    public List<Transaction> getAllTransactions() {
        return transactions;
    }
    
}

