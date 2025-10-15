package model;

public class SavingAccount extends BankAccount {
    public static double minBalance = 10000;
    static {
    	interestRate = 4.0;
    }

    public SavingAccount(int accNo, String name, double balance,String accType) {
        super(accNo, name, balance,accType);
    }
    

   
    public static double getMinBalance() {
		return minBalance;
	}



	public boolean withdraw(double amount) {
        if (balance - amount >= minBalance) {
            balance = balance - amount ;
            return true;
        } 
        return false;
    }

   
    public void deposit(double amount) {
        balance += amount;
        
    }

    
    public void  display() {
		System.out.println("\n[accountNumber=" + accountNumber + ", holderName=" + holderName + ", balance=" + balance
				+ ", accType=" + accType + ", openDate=" + openDate + ", frozen=" + frozen + "]");
	}
}
