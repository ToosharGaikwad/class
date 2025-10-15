package model;

import controler.BankAccount;

public class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(int accNo, String name, double balance,String accType, double overdraftLimit) {
        super(accNo, name, balance, accType);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

   
    public void  display() {
		System.out.println("\n[accountNumber=" + accountNumber + ", holderName=" + holderName + ", balance=" + balance
				+ ", accType=" + accType + ", openDate=" + openDate + ", frozen=" + frozen +" ,overDraft Limit="+ overdraftLimit + "]");
	}
}
