package Array;

public class LongestString {
	
	
	public static String longest(String s) {
		String[] devide = s.split(" ");
		
		String longestword = "";
		
		for(String word:devide) {
			
			if(word.length()>longestword.length()) {
				longestword = word;
			}
		}
		return longestword;
		
	}
	
public static void main(String[] args) {
	String ss = "vaibhav khup ma.....od ahe is a good boy";
	 
	System.out.println(longest(ss));
}
}
