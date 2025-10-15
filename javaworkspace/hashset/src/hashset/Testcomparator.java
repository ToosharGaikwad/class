package hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1{
	

			int roll;
			double marks;
			String name;

		

			public Student1() {
				this.roll = 101;
				this.marks = 7;
				this.name = "not given";

			}

			public Student1(int id, double marks, String name) {
				this.roll = id;
				this.marks = marks;
				this.name = name;
			}

			public int getId() {
				return roll;
			}

			public void setId(int id) {
				this.roll = id;
			}

			public double getMarks() {
				return marks;
			}

			public void setMarks(double marks) {
				this.marks = marks;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String toString() {
				return "\n Student roll=" + roll + ", marks=" + marks + ", name=" + name;
			}
			
			

//
}
	class MyMarkcompartor implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Student1 s1 = (Student1)o1;
			Student1 s2 = (Student1)o2;
			
			return (int)(s1.marks-s2.marks);
		}
		
		
	}
public class Testcomparator {

	public static void main(String[] args) {
		
		ArrayList<Student1> a1 = new ArrayList<Student1>();
			a1.add(new Student1(57, 450, "Sachin"));
			a1.add(new Student1(94, 600, "Rahul"));
			a1.add(new Student1(88, 700, "Dhoni"));
			a1.add(new Student1(94, 600, "Rahul"));
			a1.add(new Student1(94, 100, "Rahul"));
			
			 MyMarkcompartor m = new  MyMarkcompartor();
			Collections.sort(a1,m);
			System.out.println(a1);
			
		
	}

}
