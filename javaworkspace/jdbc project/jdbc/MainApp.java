package jdbc;


import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;




public class MainApp {

	public static void main(String[] args) {
		
		// step 1 load the driver
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Tusha@1998");
			
				String query = "insert into booking( ticket_id,issue_date)values(?,?)";
				
				PreparedStatement ps = con.prepareStatement(query);
				
				ps.setInt(1, 202);
				ps.setDate(2, java.sql.Date.valueOf("2025-11-06"));
				
				int rows = ps.executeUpdate();
				System.out.println(rows + " record(s) inserted.");		
				
			} 
			
			
			
//			
//			try {
//				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","Tusha@1998");
//				String query="select * from booking";
//				
//				Statement stmt=con.createStatement();
//				ResultSet rs = stmt.executeQuery(query);
//				
//							while(rs.next()) {
//				System.out.println(rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));
//				
//
//				}
//				con.close();
//			
//				
//			} 
			
			catch (SQLException e) {
				System.out.println("sql error");
				e.printStackTrace();
			}

			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			System.out.println("class not found ");
		}
			}

}