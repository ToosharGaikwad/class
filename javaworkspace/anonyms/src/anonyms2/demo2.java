package anonyms2;

interface Discount extends Runnable{
	void discount();
}
class Mall extends Thread implements Discount{

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("30% discount");
	}

	@Override
	public void run() {
		System.out.println("in mall");
		
	}
	
	
}

public class demo2 {
	public static void main(String[] args) {
		Mall m1 = new Mall();
//		m1.discount();
		m1.start();
		
		new Mall() {
			@Override
			public void discount() {
				System.out.println("50% discount");
				
			}

			@Override
			public void  run() {
				// TODO Auto-generated method stub
				System.out.println("inside run anonyms 50");
			}
		}.start();
		
		
		  new Mall() {
			
			@Override
			public void discount() {
				System.out.println("80% discount");
				
			}

			@Override
			public void  run() {
				// TODO Auto-generated method stub
				System.out.println("inside run anonyms");
			}
		}.start();
		
	}

}
