package p1;

public class Horse implements product,Cat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	public void sound() {
		System.out.println("meo meo");
	}
	

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("buy a horse !");
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("sell a horse !");
	}

}
