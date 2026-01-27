package arraylist;

public class PalindromeString {

	
	
	public static String reverseString(String s1) {
		 char[] ch = s1.toCharArray();
		 int start = 0;
		int end = ch.length -1;
		
		for(int itr =start; itr<end;itr++) {
//		while(start<end) {   
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		return new String(ch);
	}
	
	
	public static boolean checkPalindrome(String s1) {
		int  start = 0;
		int  end = s1.length()-1;
		
		for (int i=start;i<end;i++) {
			if(s1.charAt(start)!=s1.charAt(end)){
				return false;
				
			}
			start++;
			end--;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		String s1 = "Tushar";
		String s3 = "sikj";
		String s2 = "baaaab";
		
		boolean ss = checkPalindrome(s1);
		System.out.println(ss);
		System.out.println( checkPalindrome(s2));
		
		System.out.println(reverseString(s1));
	}
	
	
	
	
	
}
