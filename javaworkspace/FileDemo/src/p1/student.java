package p1;

import java.io.Serializable;

public class student implements Serializable{
	int roll;
	String name;
	double marks;
	
	public student(int roll, String name, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	
	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public static void main(String[] args) {
		
		
		
		
	}


	@Override
	public String toString() {
		return "student [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
