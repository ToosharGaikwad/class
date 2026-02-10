package Array;

public class Anagram {
	
	
	public static boolean isAnagram(String s1 , String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		
			
			
			byte[] a = s1.getBytes();
			byte[] b = s2.getBytes();
			
			int [] freq = new int[256];
			
			for ( int j=0;j<a.length;j++) {
				freq[a[j]]++;
				freq[b[j]]--;
				
			}
			for ( int itr=0;itr<freq.length;itr++) {
				if(freq[itr]!=0) {
					System.out.println(freq[itr]);
					return false;
				}
				
			}
		
		return true;
	}
	

	public static void main(String[] args) {
		
		String a = "kljds";
		String b = "lkdjd";
		
		if(isAnagram(a,b)){
			System.out.println("Anagram");
		} else 
		{
			System.out.println("not Anagram");
		}

	}

}
