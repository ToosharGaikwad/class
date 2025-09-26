package p2;
import p1.Employee;
public class seseManager extends Employee{

	double incentive;
	int target;
	
	
	
	public seseManager() {
		super();
		this.incentive = 20;
		this.target = 30;
	}



	public seseManager(double incentive, int target,int id ,String name, double salary) {
		super();
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
	 public double calsal() {
		return this.getsalary()+this.incentive;
	}

	public void display(){
		super.display();
		System.out.println("incentive = " + incentive);
		System.out.println("salary is = " + calsal(
				));

	}

	

	

}
