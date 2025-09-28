package p2;

import p1.Traveller;
import p1.product;

 public class Vehicle implements Traveller,product,Dog{
	 
	public void bark(){
		System.out.println("bark a dog");
	}
	public void sound() {
		System.out.println("meo meo");
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("buy a vehicle");
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("sell a vehicle");
	}

	@Override
	public void Travel() {
		// TODO Auto-generated method stub
		System.out.println("Travel a vehicle");
	}
	
    public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.buy();
		v.sell();
		Dog d  = new Vehicle();
		d.bark();
	}

}
