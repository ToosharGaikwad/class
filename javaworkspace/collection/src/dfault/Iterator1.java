package dfault;
import java.util.ArrayList;
import java.util.Iterator;
public class Iterator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> citie = new ArrayList<String>();

		citie.add("pune");
		citie.add("mumbai");
		citie.add("sambhaji nagar");
		citie.add("kolhapur");
		
		
//		for(String city:citie) {
//			if(city.equals("mumbai")) {
//				citie.remove(city);
//			}
//			System.out.println(citie);
//		}
		
		
		Iterator<String> myit = citie.iterator();
		while(myit.hasNext()) {
			String city = (String) myit.next();
			if(city.equals("mumbai")) {
				myit.remove();
			}
			System.out.println(citie);
		}
	}

}
