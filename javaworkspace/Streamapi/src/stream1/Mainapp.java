package stream1;

import java.util.ArrayList;
import java.util.List;
	


public class Mainapp {

	public static void main(String[] args) {
		List<Student> allStudent = new ArrayList();
		
		allStudent.add(new Student(1, "soham", "f",52.2f));
		allStudent.add(new Student(1, "tushar", "m",75.2f));
		allStudent.add(new Student(1, "priya", "f",90.2f));
		allStudent.add(new Student(1, "aujaswi", "f",85.2f));
		    
		
		
		
//		allStudent.stream().forEach(ref->System.out.println(ref.getName()));
		
		allStudent.stream().filter(merimarzi->merimarzi.getMarks()>78).forEach(ref->System.out.println(ref.getName()+" "+ref.gender));
		
//		double avgMarks = allStudent.stream().filter(ref->ref.getGender().equals("m")).mapToDouble(ref->ref.getMarks()).average().getAsDouble();
//		System.out.println(avgMarks);
	}
}
