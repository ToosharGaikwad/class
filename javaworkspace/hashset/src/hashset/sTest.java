package hashset;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collection;

	  class Student implements Comparable <Student>{

	 			int roll;
	 			double marks;
	 			String name;

 			

	 			public Student() {
	 				this.roll = 101;
	 				this.marks = 7;
	 				this.name = "not given";

	 			}

	 			public Student(int id, double marks, String name) {
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
	 			public boolean equals(Object obj){
	 				System.out.println("inside equals");
	 				Student s1 = (Student) obj;
	 				if (this.roll == s1.roll) {
	 					return true;
	 				} else {
	 					return false;
	 				}	 				
	 				
	 				
	 			}
	 			
	 			
	 			@Override
	 			public int hashCode() {
	 				System.out.println("inside hashcode");
	 			
	 			return this.roll ;
	 			}

	 			@Override
				public int compareTo(Student o) {
				System.out.println("hh");
					return this.roll-o.roll;
				}
	 				
	  }
	 		
class sTest{
	 			public static void main1s(String[] args) {

//	 				
	 				HashSet <Student> h = new HashSet<Student>();
	 				h.add(new Student(57, 2, "Sachin"));
	 				h.add(new Student(94, 30, "Rahul"));
	 				h.add(new Student(88, 30, "Dhoni"));
	 				h.add(new Student(88, 100, "Dhoni"));
	 				h.add(new Student(88, 50, "Dhoni"));
	 				System.out.println(h);
	 				
	 				
	 				if(h.contains(new Student(3,400,"Ansh")))
	 				{
	 					System.out.println("Found");
	 				}
	 				else {
	 					System.out.println("Not Found");
	 				}

	 			
	 				
	 				
// 				
//	 			ArrayList<Student> a1 = new ArrayList<Student>();
// 				a1.add(new Student(57, 450, "Sachin"));
// 				a1.add(new Student(94, 600, "Rahul"));
// 				a1.add(new Student(88, 700, "Dhoni"));
// 				a1.add(new Student(94, 600, "Rahul"));
// 				a1.add(new Student(88, 700, "Dhoni"));
// 				
// 				System.out.println("Berfore sorting \n" +a1);
// 				Collections.sort(a1);
// 				System.out.println("After sort \n"+a1);
// 			
// 			
// 			for (Student s1:a1) {
// 				System.out.println(s1.getName());
// 			}
 				
	 				
}
}
	 			
	 			
	 			
 				

				
	 				
		
	  	
	 				
	 				
	 				
	 				
