package inter;

public class MainClass 
{

	public static void main(String[] args) {
//		payfees[] student = {new offlineStudent(),new OnlineStudent(),new demostudent()};
//	
//		for(payfees ref:student){
//			
//			ref.payonline();
//		}
//		offlineStudent p = new offlineStudent();
//		p.payoffline();
		
		
	// Approch 1 for implement interface 	
		
		ArithmaticOps add = new Addition();
		System.out.println(add.calculate(12,11));
		
		// Approch 2 Anonymas inner class
		
		ArithmaticOps multi = new  ArithmaticOps() {
			
			@Override
			public int calculate(int a, int b) {
				
				return a*b;
			}
		};
		System.out.println(multi.calculate(10, 3));
		
		// Approch 3 lamda expresion
		
		
		ArithmaticOps  arith =  (a, b) ->(a*b);
		System.out.println(arith.calculate(13,2));
		
		ArithmaticOps  div =  (a, b)->{
			return a/b;
		};
		System.out.println(div.calculate(10, 3));
		
	}		
}
