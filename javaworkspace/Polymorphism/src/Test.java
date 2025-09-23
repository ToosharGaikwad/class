class Energy{
	String source;

	 Energy(String source) {
		
		this.source = source;
	}

	 String getSource() {
		return source;
	}

	 void setSource(String s) {
		this.source = s;
	}
	void display() {
		System.out.println("create energy with sources  ");
	}
}
class solar extends Energy{
	String sunEnergy;

	

	 solar(String sunEnergy,String source) {
		super(source);
		this.sunEnergy = sunEnergy;
	}

	 String getSunEnergy() {
		return sunEnergy;
	}

	 void setSunEnergy(String sunEnergy) {
		this.sunEnergy = sunEnergy;
	}
	
	void display() {
		super.display();
		System.out.println("creating energy from sun rays "+source);
	}
	
}
class Wind extends Energy{
	double air;

	
	public Wind(double air,String source) {
		super(source);
		this.air = air;
	}


	public double getAir() {
		return air;
	}


	public void setAir(double air) {
		this.air = air;
	}
	
	void display() {
		super.display();
		System.out.println("creating energy from wind  " + air);
	}
	
}
class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Energy e = new  Energy("heat ");
       e.display();
       e = new solar("sunraysOfsun","light" );
       e.display();
       e = new Wind(320.32,"air pressure");
       e.display();
	}

}
