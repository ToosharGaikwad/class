package thread;

class test implements Runnable
{

	@Override
	public void run() {
		System.out.println("call in run 1");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public void sell() {
		System.out.println("sell");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

class test2 extends Thread
{
	public void run() {
		System.out.println("call in Threaad 2");
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("now run");
	}
	
}
public class practiceQ1 {
	

	public static void main(String[] args) {
		
		test t1 = new test();
		test2 t2 = new test2();
		
		t1.run();
		
		t2.start();
//		t1.sell();
	}

}
