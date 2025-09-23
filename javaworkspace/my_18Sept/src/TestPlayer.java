
class Player{
	String name;
	int age;
	String team;
	int playerId;
	public Player(String name, int age, String team, int playerId) {
		super();
		this.name = name;
		this.age = age;
		this.team = team;
		this.playerId = playerId;
	}
	 Player() {
		super();
		this.name = "vaibhav";
		this.age = 32;
		this.team = "mumbai";
		this.playerId = 101;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	void display() {
		
		System.out.println("name is "+ name);
		System.out.println("age is "+ age);
		System.out.println("player id is"+playerId);
		System.out.println("Team name is "+team);
		
	}
	
	
	
	
}
class cricketPl extends Player{
	String designation;
	String teamName;
	int jerseyNo;
	
	public cricketPl() {
		super();
		this.designation = "batsman";
		this.teamName = "mumbai Indian";
		this.jerseyNo = 102;
	}

	public cricketPl(String designation, String teamName, int jerseyNo) {
		super();
		this.designation = designation;
		this.teamName = teamName;
		this.jerseyNo = jerseyNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public int getJerseyNo() {
		return jerseyNo;
	}

	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
   void display(){
		System.out.println("designation is " + designation);
		System.out.println("Team is " + teamName);
		System.out.println("jersey no is " + jerseyNo);
	}
	
	
}



class TestPlayer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player P = new Player();
		P.display();
		
		P = new cricketPl();
		P.display();
	}

}
