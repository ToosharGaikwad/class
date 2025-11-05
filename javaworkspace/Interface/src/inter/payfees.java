package inter;

public interface payfees {
	public void payonline();
	
	
  public default void payoffline() {
		System.out.println("pay offline");
		this.payonline();
	};
	

}
