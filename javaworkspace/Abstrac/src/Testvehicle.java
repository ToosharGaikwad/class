abstract class vehicle{
	int speed;
	String switchh;
	boolean light;
	
	 vehicle(){
		super();
		this.speed = 50;
		this.switchh = "start";
		this.light = true;
	}

	 vehicle(int speed, String switchh,boolean light){
		super();
		this.speed = speed;
		this.switchh = switchh;
		this.light = light;
	}

	 public int getSpeed() {
		 return speed;
	 }

	 public void setSpeed(int speed) {
		 this.speed = speed;
	 }

	 public String getSwitchh() {
		 return switchh;
	 }

	 public void setSwitchh(String switchh) {
		 this.switchh = switchh;
	 }

	 public boolean isLight() {
		 return light;
	 }

	 public void setLight(boolean light) {
		 this.light = light;
	 }
	void display() {
		System.out.println("speed is " + speed);
		System.out.println("switch is " + switchh);
		System.out.println("light is " + light);
	}
	abstract void brake();
	 
	
}
class car extends vehicle{
	int door;
	int noOfTyre;
	
	public car() {
		super();
		this.door = 4;
		this.noOfTyre = 5;
	}

	public car(int door, int noOfTyre) {
		super();
		this.door = door;
		this.noOfTyre = noOfTyre;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getNoOfTyre() {
		return noOfTyre;
	}

	public void setNoOfTyre(int noOfTyre) {
		this.noOfTyre = noOfTyre;
	}
	void display() {
		super.display();
		System.out.println("No of door is "+ door);
		System.out.println("No of Tyre is "+ noOfTyre);
		
	}
	void brake(){
		  System.out.println("press brake and stop bike");
	  }
}
class bike extends vehicle{
	int stand;
	int kick;
	int helmet;
	public bike() {
		super();
		this.stand = 1;
		this.kick = 1;
		this.helmet = 2;
	}
	 bike(int stand, int kick, int helmet) {
		super();
		this.stand = stand;
		this.kick = kick;
		this.helmet = helmet;
	}
	 public int getStand() {
		 return stand;
	 }
	 public void setStand(int stand) {
		 this.stand = stand;
	 }
	  int getKick() {
		 return kick;
	 }
	  void setKick(int kick) {
		 this.kick = kick;
	 }
	  int getHelmet() {
		 return helmet;
	 }
	  void setHelmet(int helmet) {
		 this.helmet = helmet;
	 }
	  void display() {
			super.display();
			System.out.println("kick is "+ kick);
			System.out.println("helmet is "+ helmet);
			System.out.println("no of stand is"+stand);
			
		}
	   void brake(){
		  System.out.println("press brake and stop bike");
	  }
	
}
class Testvehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
//		
//		vehicle v = new vehicle(45,"stop",false);
//		v.display();
//		bike b = new bike();
//		b.display();
//		
		vehicle v = new bike(1,2,3);
		Testvehicle.func(v);
		v.brake();
	}

	
	static void func(vehicle v) {
		if(v instanceof bike) {
			bike b = (bike)v;
			System.out.println(b.getHelmet());
		}
	}

}
