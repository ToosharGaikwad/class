package com.casestudy.coin;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class coinManagementDao {
	List<Coin> coins = new ArrayList<>();
	private String tcountry;
	private int tdemomination;
	private int cid;
	private double tyearOfMinting;
	private double tcurrentValue;
	private LocalDate tdate;
	
	
	
	public void addDataBase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CoinData","root","Tusha@1998");
			Statement stmt = con.createStatement();
			String query  = "select * from coins";
			ResultSet  rs = stmt.executeQuery(query);
			while(rs.next()) {
				
				cid = rs.getInt(1);
				tcountry = rs.getString(2);
				tdemomination = rs.getInt(3);
				tyearOfMinting = rs.getDouble(4);
				tcurrentValue = rs.getDouble(5);
				tdate = rs.getDate(6).toLocalDate();
				
				
				 Coin coin = new Coin(cid, tcountry, tdemomination, tyearOfMinting, tcurrentValue, tdate);
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
        int nextCid = 1;

        try (Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/CoinData", "root", "Tusha@1998");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT MAX(cid) FROM coins")) {
        	

           
            if (rs.next()) {
                int maxCid = rs.getInt(1);
                nextCid = maxCid + 1;
            }

        } 
        catch (Exception e) {
            e.printStackTrace();
        }

        return nextCid;
    }
	 public  void displayallcoins() {

			for(Coin c : coins) {
				System.out.println(c);
			}
	}
}
