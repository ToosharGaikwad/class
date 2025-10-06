package mainApp;

public class Employee{
		public int id;
		public Double salary;
		public String name;

		public void setid(int id) {
			this.id = id;
		}

		public  int getid(int id) {
			return this.id;
		}

		public void setsalary(double salary) {
			this.salary = salary;
		}

		public double getsalary() {
			return this.salary;
		}

		public void setname(String name) {
			this.name = name;
		}

		public String getname() {
			return this.name;
		}

		public Employee() {
			this.id = 88;
			this.name = "yuvraj";
			this.salary = 8878.0;
		}

		public Employee(int i, String n, double sal) {
			this.id = i;
			this.name = n;
			this.salary = sal;
		}		
	}
