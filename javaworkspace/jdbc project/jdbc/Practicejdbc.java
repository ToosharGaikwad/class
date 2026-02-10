package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Practicejdbc {
	public static void main(String[] args) {
		
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice","root","Tusha@1998");
			
			String query = "insert into employee(emp_name,emp_id,emp_salary) values(?,?,?)";
			
			PreparedStatement ptmt = con.prepareStatement(query);
			
			ptmt.setString(1,"Tushar");
			ptmt.setInt(2,101);
			ptmt.setInt(3,364552);
			
			int row = ptmt.executeUpdate();
			
			System.out.println(row + "records inserted");
			
			con.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
