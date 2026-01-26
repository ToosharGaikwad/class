package Question.practice.com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Stream2 {
public static void main(String[] args) {
	List <Employee> emp = new ArrayList();
	emp.add(new Employee("tushar",33122,33));
	emp.add(new Employee("varun",52312,23));
	
	emp.add(new Employee("vaibhav",3352,36));
	emp.add(new Employee("rushi",84522,25));
	
	Stream<Employee>data =  emp.stream();
	
//	data.filter(n-> n.age>25)
//	.forEach(System.out:: println); //for every element print it (::) 
//	.forEach(n-> System.out.println(n.age));
	
//	System.out.println(data.findFirst());
	

//	data.sorted(Comparator.comparingInt(Employee:: getAge))
//	.forEach(n-> System.out.println(n.getAge() +" " +  n.getName()));
//	
	
	Stream<Object> mappeddata = data.map(n-> n.getAge()*3);
	mappeddata.forEach(e -> System.out.println(e));
}

}