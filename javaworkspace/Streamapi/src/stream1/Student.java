package stream1;

public class Student {
	int rollno;
	String name ;
	String gender;
	float marks;
	
	

	public Student(int rollno, String name, String gender) {
		
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
	}
	
	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

}
