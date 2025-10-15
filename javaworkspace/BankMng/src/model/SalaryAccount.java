package model;
import java.util.*;

public class SalaryAccount extends BankAccount {
    Date lastTransactionDate;

    public SalaryAccount(int accNo, String name, double balance) {
        super(accNo, name, balance, "Salary");
        this.lastTransactionDate = new Date();
    }

    @Override
    public boolean withdraw(double amount) {
    	if(frozen) {
    		if (balance >= amount) {
                balance = balance - amount;
                lastTransactionDate = new Date();
                return true;
            }
    	}
    	return false;
        
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
        lastTransactionDate = new Date();
    }

    @Override
    public void  display() {
		System.out.println("\n[accountNumber=" + accountNumber + ", holderName=" + holderName + ", balance=" + balance
				+ ", accType=" + accType + ", openDate=" + openDate + ", frozen=" + frozen +" ,last Transactiobn date=" + lastTransactionDate +"]");
	}

    public boolean checkFreezeStatus() {
        Date now = new Date();
        long diff = now.getTime() - lastTransactionDate.getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        if (days > 60) {
            frozen = true;
            return true;
            
        }
        return false;
    }

	
}
