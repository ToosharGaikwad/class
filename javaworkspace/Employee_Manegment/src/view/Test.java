package view;

import model.Admin;
import model.Hr;
import model.Sellsman;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sellsman s = new Sellsman();
		
		System.out.println(s.toString());
		 Admin A  = new Admin();
		 System.out.println(A.toString());
		 Hr h = new Hr();
		System.out.println("salary of "+ h.toString());
	}

}
