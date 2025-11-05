package thread;

class worker1 implements Runnable{
	public void run() {
	String number ="13246773";
	for(int i=0;i<number.length();i++) {
		System.out.println(number.charAt(i));
	}
	}
}
public class demo2 {

	public static void main(String[] args) {
		
		
		worker1 w1 = new worker1();
		Thread t1 =new Thread(w1);
		t1.start();
		String alpha ="abcdefghkliei";
		for(int i=0;i<alpha.length();i++) {
			System.out.println(alpha.charAt(i));
		}
		Thread.sleep(1000);		


	}
	
}
