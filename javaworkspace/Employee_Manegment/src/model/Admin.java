package model;

import mainApp.Employee;

public class Admin extends Employee{
	double allowance;

	public Admin() {
		super();
		this.allowance = 200;
	}

	public Admin(int id,String name, double salary,double allowance ) {
		super(id,name,salary);
		this.allowance = allowance;
		
	}

	public double getAllowance() { 
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	
	public double calsal() {
		return this.getSalary()+allowance;
	}
	@Override
	public String toString() {
		return "salary "+ (salary + allowance) +" name = "  + name + " id = " + id;
	}
	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		return getSalary()+allowance;
	}

	}
