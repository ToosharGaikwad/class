package p1;

public abstract class Employee {

	
		
		
			int id;
			Double salary;
			String name;
		
			public void setid(int id) {
				this.id = id;
			}
		
			public int getid(int id) {
				return this.id;
			}
		
			public void setsalary(double salary) {
				this.salary = salary;
			}
		
			public double getsalary() {
				return this.salary;
			}
		
			void setname(String name) {
				this.name = name;
			}
		
			public String getname() {
				return this.name;
			}
		
			public Employee() {
				this.id = 88;
				this.name = "yuvraj";
				this.salary = 8878.22;
			}
		//
			public Employee(int i, String n, double sal){
				this.id = i;
				this.name = n;
				this.salary = sal;
			}
		//
			public void display() {
				System.out.println("id = " + id);
				System.out.println("name = " + name);
				System.out.println("salary = " + salary);
			}
			public double calsal() {
				return salary;
			}
	
		//
		
	}


