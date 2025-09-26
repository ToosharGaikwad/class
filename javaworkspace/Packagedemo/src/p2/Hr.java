package p2;

import java.util.Scanner;

import p1.Employee;

public class Hr extends Employee {

	
			double commition;

			
			
			 public Hr() {
				super();
				this.commition = 3332;
			}
			 Hr(double commition,int id, String name, double salary) {
					super();
					this.commition = commition;
				}

			 public double getCommition() {
				return commition;
			}
			public void setCommition(double commition) {
				this.commition = commition;
			}
			
				public  void display(){
					super.display();
					System.out.println("commition = "+ commition+" salary is  "+ calsal());
				}
				public double calsal() {
					return this.getsalary()+commition;
				}
				
			}// hr end here 

			
	