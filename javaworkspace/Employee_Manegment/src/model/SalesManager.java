package model;

import mainApp.Employee;

public class SalesManager extends Employee{
		double incentive;
		int target;
		
		
		
		 public SalesManager(int id, String name, double salary, double target, double incentive3) {
			super();
			this.incentive = 200;
			this.target = 30;
		}



		public SalesManager(int id ,String name, double salary,double incentive, int target) {
			super(id, name,salary);
			this.incentive = incentive;
			this.target = target;
		}

		


		public double getIncentive() {
			return incentive;
		}



		public void setIncentive(double incentive) {
			this.incentive = incentive;
		}



		public int getTarget() {
			return target;
		}



		public void setTarget(int target) {
			this.target = target;
		}
		 public double calsal(){
			return this.getSalary()+this.incentive;
		}



		 @Override
		 public String toString(){
			return "Sellsman [incentive=" + incentive + ", id=" + id + ", salary=" + (getSalary()  + incentive) + ", name=" + name + "]";
		 }



		 @Override
		 public double calculateSalary() {
			 return(getSalary() + this.incentive);
			
		 }
		 
		

}