
abstract class emp{
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
	abstract double calsal();
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
	double calsal() {
		return salary+incentive;
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
	
	public double getCommition() {
		return commition;
	}
	public void setCommition(double commition) {
		this.commition = commition;
	}
	double calsal() {
		return salary+commition;
	}
}// hr end here 

class TestEmployee {

	public static void main(String[] args) {
//		selsManager s = new selsManager(666,"sonali",83324,33,66);
	//		s.display();
//		e.display();
		
//		emp e1 = new emp(666,"sonali",8332);
//		e1.display();
		//		h.display();
//		
//		Areamanger A = new Areamanger();
//		emp e =  new selsManager(666,"sonali",83324,33,66);
//		System.out.println(e.calsal());
////		A.display();
//		e = new Hr(33);
//		System.out.println("hr salry"+e.calsal());
//		
		
		
		emp e1 = new selsManager(666,"sonali",83324,33,66);
		
		TestEmployee.myfunc(e1);
		
		e1 = new Hr(33);
		TestEmployee.myfunc1(e1);
	}

	  static void myfunc1(emp e1) {
		// TODO Auto-generated method stub
		  System.out.println(e1.getname());
			System.out.println(e1.calsal());
			if(e1 instanceof  selsManager) {
				Hr h1 = (Hr)e1;
				System.out.println(h1.getCommition());
		
			}
	 }

	 static void myfunc(emp e1) {
		// TODO Auto-generated method stub
		System.out.println(e1.getname());
		System.out.println(e1.calsal());
		if(e1 instanceof  selsManager) {
			selsManager s1 = (selsManager)e1;
			System.out.println(s1.getIncentive());
		}
		
	}

}


