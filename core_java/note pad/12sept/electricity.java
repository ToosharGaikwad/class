class electricityBill{
	String name;
	int unit,billId;
	static double ratePerUnit;
	double cal;
	static {
	ratePerUnit =3;
	}

	void setunit(int u){
		this.unit = u;
	}
	int getunit(){
		return this.unit;
	}
	void setbillId(int b){
		this.billId = b;
	}
	static void setratePerUnit(double r){
		ratePerUnit= r;
	}
	static double getratePerUnit(){
	return ratePerUnit;
	}
	electricityBill(){
	this.name = "sachine";
	this.billId = 665;
	this.unit = 54;
	}
	electricityBill(String name,int billId,int unit){
	this.name =name;
	this.billId = billId;
	this.unit = unit;
	}
	void calculateUnit(){
	 cal = getratePerUnit()*this.getunit();
	
	}
	void display(){
	
         System.out.println("name = "+name);
	System.out.println("unit = "+unit);
	System.out.println("bill id = "+billId);

	System.out.println("calculate =  "+cal);

	}
}
class billTest{
	public static void main(String[] args){
	electricityBill e = new electricityBill("tushar" ,555,21);
	
	electricityBill.setratePerUnit(2);
	e.calculateUnit();
	e.display();
}
}