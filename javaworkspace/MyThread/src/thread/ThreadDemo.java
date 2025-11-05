package thread;
class worker extends Thread{
	public void run() {
	String number ="13246773";
	for(int i=0;i<number.length();i++) {
		System.out.println(number.charAt(i));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		
		
		worker w1 = new worker();
		w1.start();
		String alpha ="abcdefghkliei";
		
		
		
		for(int i=0;i<alpha.length();i++) {
			System.out.println(alpha.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		


	}
	
}
