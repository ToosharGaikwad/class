package thread;

class Printer {
	boolean isOdd = true;
	synchronized void printOdd(int number) {
		while(!isOdd) {
			try {
				wait();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("odd " + number);
		isOdd = false;
		notify();
	}
	synchronized void Printeven(int number){
		
		 while (isOdd) {   // wait if it's still odd's turn
		        try {
		            wait();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
		    } 
		System.out.println( "Even "+number);
		isOdd = true;
		notify();
	}
}

class OddThread extends Thread {
	private Printer printer;

	public OddThread(Printer printer) {
		
		this.printer = printer;
	}
	
	
	public void  run() {
		for(int i=1;i<10;i+=2) {
			printer.printOdd(i);
		}
	}
	
	
}

class EvenThread extends Thread{
	public Printer printer;

	public EvenThread(Printer printer) {
		this.printer = printer;
	}
	
	
	public void run() {
		for(int i=0;i<10;i+=2) {
			printer.Printeven(i);
		}
	}
	
	
	
}

public class PracticeQ {
public static void main(String[] args) {
	Printer p = new Printer();
	
	EvenThread e = new EvenThread(p);
	OddThread o = new OddThread(p);
	
	e.start();
	o.start();
}
}
