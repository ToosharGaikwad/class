package model;

import java.time.LocalDate;

public class Transaction {
    int transId;
    int accNo;
    String transType;
    double amount;
    double balanceAfter;
    LocalDate transDate;

    public Transaction(int transId, int accNo, String transType, double amount, double balanceAfter, LocalDate transDate) {
        this.transId = transId;
        this.accNo = accNo;
        this.transType = transType;
        this.amount = amount;
        this.balanceAfter = balanceAfter;
        this.transDate = transDate;
    }

	public int getTransId() {
		return transId;
	}

	public void setTransId(int transId) {
		this.transId = transId;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getBalanceAfter() {
		return balanceAfter;
	}

	public void setBalanceAfter(double balanceAfter) {
		this.balanceAfter = balanceAfter;
	}

	public LocalDate getTransDate() {
		return transDate;
	}

	public void setTransDate(LocalDate transDate) {
		this.transDate = transDate;
	}

	@Override
	public String toString() {
		return "Transaction \n[transId=" + transId + ", accNo=" + accNo + ", transType=" + transType + ", amount="
				+ amount + ", balanceAfter=" + balanceAfter + ", transDate=" + transDate + "]";
	}
    

   
}
