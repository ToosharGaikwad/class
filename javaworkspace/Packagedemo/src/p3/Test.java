package p3;

import p1.Employee;
import p2.Admin;
import p2.Hr;
import p2.seseManager;

public class Test {

	public static void main(String[] args) {
		
		Employee e1;
		e1= new Admin();
		e1.calsal();
		e1.display();
		
		e1 = new Hr();
		e1.calsal();
		e1.display();
		
		e1 = new seseManager();
		e1.calsal();
		e1.display();
		
	}

}
