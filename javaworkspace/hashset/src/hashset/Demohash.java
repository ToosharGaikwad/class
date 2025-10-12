package hashset;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Demohash {
	
	
	
	public static void main1(String[] args) {
		TreeSet t =new TreeSet();
		t.add("vinayak");
		t.add("swaraj");
		t.add("gauri");
		
		for(Object obj:t) {
			String s = (String)obj;
			System.out.println(s.length());

			
		}
		
	}
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		List l = new ArrayList();
		l.add("vinayak");
		l.add("swaraj");
		l.add("gauri");
		l.add("tushar ");
		
//		for (int i = 0;i< l.size(); i++) {
//			String s = (String)l.get(i);
//			System.out.println(s.length());
//		}
//		
		
		
		
		for(Object obj:l) {
			String a = (String)obj;
			System.out.println(a.length());

			
		}

	}

}
