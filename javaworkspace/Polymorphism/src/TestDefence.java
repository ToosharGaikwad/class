class Defence{
	int noOfGuns;
	int noOfsoldier;
	int bomber;
	public Defence() {
		
		this.noOfGuns = 10;
		this.noOfsoldier = 1000000;
		this.bomber = 5000;
	}
	
	public Defence(int noOfGuns, int noOfsoldier, int bomber) {
		super();
		this.noOfGuns = noOfGuns;
		this.noOfsoldier = noOfsoldier;
		this.bomber = bomber;
	}

	public int getNoOfGuns() {
		return noOfGuns;
	}

	public void setNoOfGuns(int noOfGuns) {
		this.noOfGuns = noOfGuns;
	}

	public int getNoOfsoldier() {
		return noOfsoldier;
	}

	public void setNoOfsoldier(int noOfsoldier) {
		this.noOfsoldier = noOfsoldier;
	}

	public int getBomber() {
		return bomber;
	}

	public void setBomber(int bomber) {
		this.bomber = bomber;
	}

	void attac() {
		System.out.println("Attack on pakistan");
	}
	
}
class Army extends Defence{
	int tank;
	int truck;
	public Army() {
		super();
		this.tank = 100;
		this.truck = 1000;
	}
	public Army(int tank, int truck,int noOfGuns, int noOfsoldier, int bomber) {
		super(noOfGuns,noOfsoldier,bomber);
		this.tank = tank;
		this.truck = truck;
	}
	public int getTank() {
		return tank;
	}
	public void setTank(int tank) {
		this.tank = tank;
	}
	public int getTruck() {
		return truck;
	}
	public void setTruck(int truck) {
		this.truck = truck;
	}
	void attac() {
		System.out.println("Attack on pk area with Tank "+tank);
		
		
	}
	
}
class Nevy extends Defence{
	int submarin;
	int ships;
	public Nevy() {
		super();
		this.submarin = 500;
		this.ships = 10221;
	}
	public Nevy(int submarin, int ships,int noOfGuns, int noOfsoldier, int bomber) {
		super(noOfGuns,noOfsoldier,bomber);
		this.submarin = submarin;
		this.ships = ships;
	}
	public int getSubmarin() {
		return submarin;
	}
	public void setSubmarin(int submarin) {
		this.submarin = submarin;
	}
	public int getShips() {
		return ships;
	}
	public void setShips(int ships) {
		this.ships = ships;
	}
	
	void attac() {
		super.attac();
		System.out.println("Attack with submarin "+ submarin);
	}
}
class Airforce extends Defence{
	int helicopter;
	int aeroplane;
	int drone ;
	public Airforce() {
		super();
		this.helicopter = 100;
		this.aeroplane = 300;
		this.drone = 5000;
	}
	public Airforce(int helicopter, int aeroplane, int drone,int noOfGuns, int noOfsoldier, int bomber) {
		super(noOfGuns,noOfsoldier,bomber);
		this.helicopter = helicopter;
		this.aeroplane = aeroplane;
		this.drone = drone;
	}
	public int getHelicopter() {
		return helicopter;
	}
	public void setHelicopter(int helicopter) {
		this.helicopter = helicopter;
	}
	public int getAeroplane() {
		return aeroplane;
	}
	public void setAeroplane(int aeroplane) {
		this.aeroplane = aeroplane;
	}
	public int getDrone() {
		return drone;
	}
	public void setDrone(int drone) {
		this.drone = drone;
	}
	void attac() {
		super.attac();
		System.out.println("Attack by aeroplane drone helicopter"+drone+" "+ aeroplane);
		
	}
	
	
}
class TestDefence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defence d = new Defence();
		//d.attact();
		d = new Army();
		d.attac();
		d = new Nevy(10,200,42,422,444);
		d.attac();
		d = new Airforce(55,63,55,3,98,46);
		d.attac();
	}

}
