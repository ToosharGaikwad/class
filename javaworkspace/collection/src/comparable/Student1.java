package comparable;
import java.util.ArrayList;
import java.util.TreeSet;

 class Student1 implements Comparable<Student1>{

			int roll;
			double marks;
			String name;

			
			public int compareTo(Student1 o) {
				 Student1 s1= (Student1)o;
//				 return (int) (s1.marks - this.marks);
				 return s1.name.compareTo(this.name);
			}


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


			public boolean equals(Object obj){
				System.out.println("inside equals");
				Student1 s1 = (Student1) obj;
				if (this.roll == s1.roll) {
					return true;
				} else {
					return false;
				}
			}

		

		

			public static void main1s(String[] args) {

				ArrayList<Student1> a1 = new ArrayList<Student1>();
				a1.add(new Student1(57, 450, "Sachin"));
				a1.add(new Student1(94, 600, "Rahul"));
				a1.add(new Student1(88, 700, "Dhoni"));

				System.out.println(a1);

				if (a1.contains(new Student1(34, 590, "Rahul")))

				{
					System.out.println("Found");
				} else {
					System.out.println("Not Found");
				}
			}

			public static void main(String[] args) {

				TreeSet<Student1> t1 = new TreeSet<Student1>();
				t1.add(new Student1(57, 450, "Sachin"));
				t1.add(new Student1(34, 590, "Rahul"));
				t1.add(new Student1(88, 700, "Dhoni"));
				t1.add(new Student1(88, 700, "Dhoni"));

				System.out.println(t1);

				if (t1.contains(new Student1(34, 590, "Rahul")))

				{
					System.out.println("Found");
				} else {
					System.out.println("Not Found");
				}

				
			}


			
		}


	