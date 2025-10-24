package Controller;

import java.util.ArrayList;

import mainApp.Employee;

public interface EmployeeDAO {
	public boolean addEmployee(Employee e) ;
		
	    public Employee searchEmployeeById(int id) ;

	    public Employee searchByName(String newName) ;
	  
	    public boolean updateEmployee(int id, double newSalary) ;

	    public boolean deleteEmployee(int id) ;
	 
	   public ArrayList <Employee> getAllEmployees();


		
	}
