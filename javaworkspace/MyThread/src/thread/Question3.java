package thread;

class Counter{
	
	public int count = 0;
	
	synchronized void incrementcount(){
		count++;
	}
	
	public int getCount(){
	return count;	
	}
	
}


class Threadone extends Thread{

	private Counter counter;
	
	
	public Threadone(Counter counter) {
	
		this.counter = counter;
	}


	public synchronized void run() {
		for(int i=0;i<1000;i++) {
			counter.incrementcount();
		}
		
	}
	
}



public class Question3 {

	public static void main(String[] args) {
		Counter counte = new Counter();
		Threadone t1 = new Threadone(counte);
		Threadone t2 = new Threadone(counte);
		t1.start();
		t2.start();
		
		try {
		t1.join();
		t2.join();
		
		}catch (Exception e) {
			System.out.println(" excetptin ");
		}
		
	
		System.out.println(counte.getCount());
	}

}
