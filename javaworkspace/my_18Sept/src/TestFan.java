class fan{
	int speed;
	String colour;
	String company;
	
	  fan() {
		super();
		this.speed = 300;
		this.colour = "yellow";
		this.company = "usha";
	}

	 fan(int speed, String colour, String company) {
		super();
		this.speed = speed;
		this.colour = colour;
		this.company = company;
	}

	 public int getSpeed() {
		 return speed;
	 }

	 public void setSpeed(int speed) {
		 this.speed = speed;
	 }

	 public String getColour() {
		 return colour;
	 }

	 public void setColour(String colour) {
		 this.colour = colour;
	 }

	 public String getCompany() {
		 return company;
	 }

	 public void setCompany(String company) {
		 this.company = company;
	 }
	 void display() {
			
			System.out.println("revolution per minit (speed) is "+ speed);
			System.out.println("colour is "+ colour);
			System.out.println("name of company is "+ company);
			
		}
	
}
class cooler extends fan{
	int movingStrips;
	String waterPump;
	int collingPad ;
	
	  cooler() {
		
		this.movingStrips = 5;
		this.waterPump = "lakshmi";
		this.collingPad = 4;
	}

	 cooler(int movingStrips, String waterPump, int collingPad,int speed,String colour,String company) {
		super(speed,colour,company);
		this.movingStrips = movingStrips;
		this.waterPump = waterPump;
		this.collingPad = collingPad;
	}
	
	
}
class TestFan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan f= new fan(33,"black","bajaj");
		f.display();
		cooler c = new cooler();
		c.display();
	}

}
