package Question.practice.com;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> no = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		 no.stream().filter(x -> x%2==0).forEach(x -> System.out.println(x*x));
		
		 List<String> str = new ArrayList(List.of("ldkjllj","slkjewj","irww"));
		
		 str.stream().map(x -> x.toUpperCase()).forEach(x-> System.out.println(x));

		

	}

}
