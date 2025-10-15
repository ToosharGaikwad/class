package model;

import controler.BankAccount;

public class LoanAccount extends BankAccount {
    double loanAmount;
    int tenureMonths;

    public LoanAccount(int accNo, String name, String accType,double loanAmount, int tenureMonths) {
        super(accNo, name, -loanAmount,accType);
        this.loanAmount = loanAmount;
        this.tenureMonths = tenureMonths;
    }

    @Override
    public boolean withdraw(double amount) {
        return false;
    }

    @Override
    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void  display() {
		System.out.println("\n[accountNumber=" + accountNumber + ", holderName=" + holderName + ", Loan Amount=" + loanAmount
				+ ", accType=" + accType + ", openDate=" + openDate + ", frozen=" + frozen +" , Tenure Months=" + tenureMonths +"]");
	}
}
