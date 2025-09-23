class person{
	String name;
	int age;
	String city;
	String department;
	String emailId;
	
	public person() {
		
		this.name = "Tushar";
		this.age = 27;
		this.city = "SambhajiNagar";
		this.department = "developement";
		this.emailId = "tg.@gmail.com";
	}

	public person(String name, int age, String city, String department, String emailId) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
		this.department = department;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	void display() {
		
		System.out.println("name is "+ name);
		System.out.println("age is "+ age);
		System.out.println("city is"+city);
		System.out.println("emailId is "+ emailId);
		System.out.println("department is "+ department);
		
	}
	
}
class manager extends person{
	int mngId;
	String authority;
	public manager() {
		
		this.mngId = 102;
		this.authority = "managment";
	}
	public manager(int mngId, String authority) {
		super();
		this.mngId = mngId;
		this.authority = authority;
	}
	public int getMngId() {
		return mngId;
	}
	public void setMngId(int mngId) {
		this.mngId = mngId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	void display() {
		super.display();
		System.out.println("revolution per minit (speed) is "+ authority);
		System.out.println("colour is "+ mngId);
		
	}
}
class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 person p = new person();
		 p.display();
		 manager m = new manager();
		 m.display();
	}

}
