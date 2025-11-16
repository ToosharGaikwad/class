package practice.Question;

import java.util.Scanner;
class withdrawException extends Exception{

	@Override
	public String toString() {
		return "withdraw Exception  !!";
	}
	
	
}

class withdraw {
	
	int challan ;
	int balance = 1000;
	
	
	void noBalance(int challan) throws withdrawException{
		
			
			if (challan > balance) {
	            throw new withdrawException();
	        }else {
	        	balance = balance - challan;
	        	System.out.println("Withdrawal successful!");
	        }
		
		
	
	}
//	public void withdrawMoney(int challan) {
//		balance = balance - challan;
//		
//		System.out.println("Withdrawal successful!");
//		
//	}
	
	
}

public class CustemATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		withdraw wd = new withdraw();
		
		
		try
		{
			

			wd.noBalance(200);
			System.out.println();
		}
		 catch 
		 (withdrawException e) {
	            System.out.println(e);
	        }
	
}
}
