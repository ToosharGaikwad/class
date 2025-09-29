package e;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a = 10;
		 int b = 0;
		 
		 int c ;
		 
		 try {
			 String fname = args[0];
			 String lname = args[1];
			 System.out.println("fname lname"+ fname + lname);
			c= a/b;
			
		 }
		 catch(ArithmeticException ae){
			 System.out.println("second value 0 mat do");
			
			 
		 }
		 catch(ArrayIndexOutOfBoundsException a1){
			 System.out.println("please provide atlist two arguments");
		 }
		 catch(Exception e1) {
			 System.out.println("some problem occure");
		 }
	}

}
