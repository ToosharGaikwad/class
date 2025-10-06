package model;

import mainApp.Employee;

public class Sellsman extends Employee{
		double incentive;
		int target;
		
		
		
		 public Sellsman() {
			super();
			this.incentive = 20;
			this.target = 30;
		}



		public Sellsman(double incentive, int target,int id ,String name, double salary) {
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
			return this.getsalary()+this.incentive;
		}



		 @Override
		 public String toString(){
			return "Sellsman [incentive=" + incentive + ", id=" + id + ", salary=" + (salary  + incentive) + ", name=" + name + "]";
		 }
		 
		

}