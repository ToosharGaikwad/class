package p2;

import p1.Employee;

public class Admin extends Employee{
double allowance;

public Admin() {
	super();
	this.allowance = 200;
}

public Admin(int id,String name,double sal,double allowance) {
	super();
	this.allowance = allowance;
	
}

public double getAllowance() {
	return allowance;
}

public void setAllowance(double allowance) {
	this.allowance = allowance;
}

public  void display(){
	super.display();
	System.out.println("allowance = "+ allowance);
}
public double calsal() {
	return this.getsalary()+allowance;
}


}
