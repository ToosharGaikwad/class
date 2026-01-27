package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimenNo {

	public static void main(String[] args) {
		
	
//	ArrayList<Integer> arr = new ArrayList(Arrays.asList(322,33,73,72,8,24));
	
	ArrayList<Integer> arr2 = new ArrayList<Integer>(List.of(3,2,5,66,22,34)) ;
	arr2.add(31);
	
	for(int i=0;i<arr2.size();i++) {
		
		int num = arr2.get(i);
		
		if(isprime(num)) {
			System.out.println("prime no is "+ num);
		}		}
	}
	
	

 	public static boolean isprime(int n) {
 		
 		for (int itr=2;itr<n;itr++) {
 			
 			if(n%itr==0) {
 				return false;
 			}
 		}
 		return true;
 	}
 	
}