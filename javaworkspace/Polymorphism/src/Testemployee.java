import java.util.Scanner;

class emp {
	int id;
	Double salary;
	String name;

	void setid(int id) {
		this.id = id;
	}

	int getid(int id) {
		return this.id;
	}

	void setsalary(double salary) {
		this.salary = salary;
	}

	double getsalary() {
		return this.salary;
	}

	void setname(String name) {
		this.name = name;
	}

	String getname() {
		return this.name;
	}

	emp() {
		this.id = 88;
		this.name = "yuvraj";
		this.salary = 8878.22;
	}

	emp(int i, String n, double sal) {
		this.id = i;
		this.name = n;
		this.salary = sal;
	}

	void display() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("salary = " + salary);
	}
}

class selsManager extends emp{
	double incentive;
	int target;

	selsManager(int id, String name, double sal, double incentive, int target) {
		super(id, name, sal);
		this.incentive = incentive;
		this.target = target;
	}

	selsManager() {
		super();
		this.incentive = 600;
		this.target = 50;
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

	void display(){
		super.display();
		System.out.println("incentive = " + incentive);
		System.out.println("target = " + target);

	}
}

class Areamanger extends selsManager{
	String area;

	Areamanger(){
		super();
		this.area = "kotharud";
	}

	Areamanger(int id, String name, double sal, double incentive, int target, String area) {
		super(id, name, sal, incentive, target);

		this.area = area;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	void display() {
		super.display();
		System.out.println("area = " + area);
	}

}// Areamanger end here

class Hr extends emp {
double commition;

 Hr() {
	super();
	this.commition = 3332.2;
}
 Hr(double commition) {
		super();
		this.commition = commition;
	}
	void display(){
		super.display();
		System.out.println("commition = "+ commition);
	}
}// hr end here 

class Testemployee {

	public static void main(String[] args) {
//		selsManager s = new selsManager(666,"sonali",83324,33,66);
		emp e = new emp(33,"suhas", 88637);
		e.display();
		 e = new selsManager(666,"sonali",83324,33,66);
		 e.display();
//		 e = new Areamanger(22 , "ranjeet", 6653.2,552.2,45, "shivajiNagar");
//		 e.display();
		 Scanner sc = new Scanner(System.in);
		 

	}
}

