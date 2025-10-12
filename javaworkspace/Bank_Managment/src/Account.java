package controler;

import java.util.Date;

public abstract class Account {
	int accountBal;
	int accountNumber;
	String holderName;
	String holderAddress;
	String accountType;
	
	static int interestRate;
	static int ifscCode;
	Date opentDate;
	Date closeDate;
	
	
	
	
	
	
	
	
	public Account(int accountBal, int accountNumber, String holderName, String holderAddress, String accountType,
			Date closeDate, int[] transaction) {
		
		this.accountBal = accountBal;
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.holderAddress = holderAddress;
		this.accountType = accountType;
		
		this.closeDate = closeDate;
		this.transaction = transaction;
	}
	
	
	
	
	public int getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(int accountBal) {
		this.accountBal = accountBal;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getHolderAddress() {
		return holderAddress;
	}
	public void setHolderAddress(String holderAddress) {
		this.holderAddress = holderAddress;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public static int getInterestRate() {
		return interestRate;
	}
	public static void setInterestRate(int interestRate) {
		Account.interestRate = interestRate;
	}
	public static int getIfscCode() {
		return ifscCode;
	}
	public static void setIfscCode(int ifscCode) {
		Account.ifscCode = ifscCode;
	}
	public Date getOpentDate() {
		return opentDate;
	}
	public void setOpentDate(Date opentDate) {
		this.opentDate = opentDate;
	}
	public Date getCloseDate() {
		return closeDate;
	}
	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}
	public int[] getTransaction() {
		return transaction;
	}
	public void setTransaction(int[] transaction) {
		this.transaction = transaction;
	}




	int transaction[];
	
	
	abstract void withdraw();
	abstract void display();
	
	public void calculateInterest(){}
	void diposite(){}
	
	

	

}
