package practice.Question;

public class Numformat {
	
	

	public static void main(String[] args) {
		String Num = "12344222f2";
		try {
			int no = Integer.parseInt(Num);

			System.out.println(" parse number is "+ no);

		}catch(NumberFormatException e) {
			System.out.println("exc are comes");
		}
		
	}

}
