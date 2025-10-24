package model;

import java.util.Scanner;
 import mainApp.Employee;
 
public class Hr extends Employee{

	

	  double commition;
	 public Hr() {
		
		this.commition = 65364.2;
	}
	 public Hr(int id,String name,double salary,double commition) {
			super(id,name,salary);
			this.commition = commition;
		} 
	 
	 public double getCommition() {
		 return commition;
	 }
	 public void setCommition(double commition) {
		 this.commition = commition;
	 }
	 @Override
	 public String toString() {
		return "Hr [ name = " + getName() + " commition = " + commition + ", salary = " + (getSalary() + commition ) + "]";
	 }
	 @Override
	 public double calculateSalary() {
		 
		return  + (getSalary()+this.commition) ;
	 }
	  

	}// hr end here 

	 


