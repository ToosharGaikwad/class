package model;

import java.util.Scanner;
 import mainApp.Employee;
 
public class Hr extends Employee{

	

	  double commition;
	 public Hr() {
		
		this.commition = 3332.2;
	}
	 Hr(double commition,int id,double salary,String name) {
			super();
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
		return "Hr [commition=" + commition + ", salary=" + (salary +commition)+"]";
	 }
	 

	}// hr end here 

	 


