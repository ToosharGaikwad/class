package anonyms;

interface Discount{
	void discount();
}
class Mall implements Discount{

	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("30% discount");
	}
	
	
}

public class demoAnonyms {
	public static void main(String[] args) {
		Mall m1 = new Mall();
		m1.discount();
		
		new Discount() {
			
			@Override
			public void discount() {
				System.out.println("80% discount");
				
			}
		}.discount();;
		
	}

}
