package com.casestudy.coin;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class coinManagementDao {
	List<Coin> coins = new ArrayList<>();
	private String tcountry;
	private int tdenomination;
	private int cid;
	private double tyearOfMinting;
	private double tcurrentValue;
	private LocalDate tdate;
	static int count;
	Scanner sc = new Scanner(System.in);
//	public void loadDriver() {
//	    try {
//	        Class.forName("com.mysql.cj.jdbc.Driver");
//	    } catch (ClassNotFoundException e) {
//	        e.printStackTrace();
//	    }
//	}

	public void addDataBase(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Tusha@1998");
			Statement stmt = con.createStatement();
			String query  = "select * from coins";
			ResultSet  rs = stmt.executeQuery(query);
			while(rs.next()){
				
				cid = rs.getInt(1);
				tcountry = rs.getString(2);
				tdenomination = rs.getInt(3);
				tyearOfMinting = rs.getDouble(4);
				tcurrentValue = rs.getDouble(5);
				tdate = rs.getDate(6).toLocalDate();
				
				if (rs.next()) {
	            	count = rs.getInt(cid);

	                System.out.print("Enter country: ");
	                 tcountry = sc.nextLine();

	                System.out.print("Enter denomination: ");
	                 tdenomination = sc.nextInt();

	                System.out.print("Enter year of minting: ");
	                 tyearOfMinting = sc.nextInt();

	                System.out.print("Enter current value: ");
	                tcurrentValue = sc.nextDouble();
	                
	                 tdate = LocalDate.now();
	  
	            }
				 Coin coin = new Coin(cid, tcountry, tdenomination, tyearOfMinting, tcurrentValue, tdate);
	                coins.add(coin);
	            }

	            con.close();
		}
		
		 catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
	
    public int addCoin() {

        count = 1;

        try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/jdbc", "root", "Tusha@1998");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT MAX(cid) FROM coins")) {

           
//            if (rs.next()) {
//            	count = rs.getInt(cid);
//
//                System.out.print("Enter country: ");
//                 tcountry = sc.nextLine();
//
//                System.out.print("Enter denomination: ");
//                 tdenomination = sc.nextInt();
//
//                System.out.print("Enter year of minting: ");
//                 tyearOfMinting = sc.nextInt();
//
//                System.out.print("Enter current value: ");
//                tcurrentValue = sc.nextDouble();
//                
//                 tdate = LocalDate.now();
//  
//            }

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
    public List<Integer> addCoinBulk() {
    	
    	Scanner scanner = new  Scanner(new file("bulk.txt"));
    	
    	while(sc.hasNext()) {
    		String line = sc.nextLine();
    		String[] splitData =line.split(",");
    		
			cid = ++count;
			tcountry = splitData[0];
			tdenomination = Integer.parseInt(splitData[1]);
			tyearOfMinting = Double.parseDouble(splitData[2]);
			
			tcurrentValue = Double.parseDouble(splitData[3]);
			tdate = LocalDate.parse(splitData[4]);
			coins.add(new Coin (cid, tcountry, cid, tcurrentValue, tcurrentValue, tdate)); 
			
    	}
    	
    	
    	
    	
    	
    	
	 public  void displayallcoins() {

			for(Coin c : coins) {
				System.out.println(c);
			}
	}

	 public void insertCoin(Coin c) {

		    String query = "INSERT INTO coins(cid, country, denomination, yearOfMinting, currentValue, acquireDate) "
		                 + "VALUES(?, ?, ?, ?, ?, ?)";

		    try (Connection con = DriverManager.getConnection(
		                "jdbc:mysql://localhost:3306/CoinData", "root", "Tusha@1998");
		         PreparedStatement ps = con.prepareStatement(query)) {

		 

		        ps.executeUpdate();  // Insert into DB

		        // Also add into list for displayAllCoins
		        coins.add(c);

		        System.out.println("Coin inserted in database.");

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}

	 
	
}
