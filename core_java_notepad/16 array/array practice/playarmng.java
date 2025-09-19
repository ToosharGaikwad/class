import java.util.Scanner;
class Player{

	String name;
	int id,noOfMatch,run,wicket;
	
	 Player(String name,int id,int noOfMatch, int run, int wicket) {
        this.name = name;
	this.id =id;
	this.noOfMatch = noOfMatch;
        this.run = run;

        this.wicket = wicket;
    }
	
	void display(){
	System.out.println("player name is "+ name);
	System.out.println("player Run is "+ run);
	System.out.println("the no of match played is "+ noOfMatch);	
	System.out.println("wicket take by player is "+ wicket);
	}


}




class TestPlayer{

public static void main(String[] args){
	Player[] pl = new Player [4] ;
	Player p = new Player("ss",3,23,55,422);
	Scanner sc = new Scanner(System.in);
	
	for(int i=0;i<4;i++){
	System.out.println("enter name");
	String name = sc.next();

	System.out.println("enter id");
	int id = sc.nextInt();
	
	System.out.println("enter no of matches played");
	int noOfMatch = sc.nextInt();

	System.out.println("enter the runs");
	int run = sc.nextInt();

	System.out.println("enter the wicket");
	int wicket = sc.nextInt();
	 pl[i] = new Player(name,id,noOfMatch ,run, wicket);
	}

	System.out.println(" Player Details");
        for (int i = 0; i < 10; i++) {
            pl[i].display();
        }
 	// Find max run scorer
        Player maxRunPlayer = pl[0];
        Player maxWicketPlayer = pl[0];

        for (int i = 1; i < 4; i++) {
            if (pl[i].run > maxRunPlayer.run) {
                maxRunPlayer = pl[i];
            }
            if (pl[i].wicket > maxWicketPlayer.wicket) {
                maxWicketPlayer = pl[i];
            }
        }
	System.out.println("player with maximum  runs");
	maxRunPlayer.disply();
	System.out.println("player with maximum  wicket");
	maxWicketPlayer.display();

}
	

}














