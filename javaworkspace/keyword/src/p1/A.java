package p1;

public class A {
	
	
	
	  protected void myfunA(){
		System.out.println("A");
	}

}

class B extends A{
	
	
	public void myfunb(){
		System.out.println("b");
		A ref = new A();
		
		ref.myfunA();
	}
	
	
}

class C {
	
	
	public void myfunC(){
		System.out.println("c");
		A ref = new A();
		ref.myfunA();
	}
	
	
	
}

