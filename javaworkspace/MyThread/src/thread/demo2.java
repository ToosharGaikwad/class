package thread;

class worker1 implements Runnable{
	public void run() {
	String number ="13246773";
	for(int i=0;i<number.length();i++) {
		System.out.println(number.charAt(i));
	}try {
		wait();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		Thread.sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	notify();
	}
	

}
public class demo2 {

	public static void main(String[] args) {
		
		
		worker1 w1 = new worker1();
		Thread t1 =new Thread(w1);
		t1.start();
//		w1.run();
		String alpha ="abcdefghkliei";
		for(int i=0;i<alpha.length();i++) {
			System.out.println(alpha.charAt(i));
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}		


	}
	
}
