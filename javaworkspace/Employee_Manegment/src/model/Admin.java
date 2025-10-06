package model;

import mainApp.Employee;

public class Admin extends Employee{
	double allowance;

	public Admin() {
		super();
		this.allowance = 200;
	}

	public Admin(double allowance,int id, String name, double salary) {
		super();
		this.allowance = allowance;
		
	}

	public double getAllowance() { 
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	
	public double calsal() {
		return this.getsalary()+allowance;
	}
	@Override
	public String toString() {
		return "salary "+ (salary + allowance);
	}

	}
