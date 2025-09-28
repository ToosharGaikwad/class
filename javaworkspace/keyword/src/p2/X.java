package p2;

import p1.A;

class X {

	public void myfunX(){
		
		A ref = new A();
		ref.myfunA();
	}
	

}
class Y extends A{
	
	 void myfunY(){
		System.out.println("A");
		A ref = new A();
		ref.myfunA();// direct access not giving
		super.myfunA();
		this.myfunA();
	}
	
	
	
}
