package controller;

import java.util.ArrayList;

import model.Admin;
import model.Employee;
import model.HR;
import model.SalesManager;

public class EmployeeDAO {
	
	
	static ArrayList<Employee> employees=new ArrayList<Employee>();
	static {
		
		employees.add( new HR(101, "Ranjit", 50000, 5000));
		employees.add( new HR(102, "Amit", 48000, 4500));
		employees.add( new HR(103, "Sneha", 47000, 4000));
		employees.add( new SalesManager(201, "Karan", 60000, 12, 8000));
		employees.add( new SalesManager(202, "Meena", 58000, 15, 7500));
		employees.add( new SalesManager(203, "Rohit", 62000, 10, 9000));
		employees.add( new Admin(301, "Pragati", 70000, 10000));
		employees.add( new Admin(302, "Isha", 68000, 9500));
		employees.add( new Admin(303, "Pooja", 72000, 11000));
		employees.add( new Admin(304, "Shubham", 75000, 12000));
	}
	public boolean addEmployee(Employee e) {
	       return employees.add(e);
    }
	
    public Employee searchEmployeeById(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

  
    public boolean updateEmployee(int id, double newSalary) {
        Employee emp = searchEmployeeById(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
    	 Employee emp = searchEmployeeById(id);
         if (emp != null) {
        	 employees.remove(emp);
             return true;
         }
         return false;
    }
 
    

    public  ArrayList<Employee> getAllEmployee() {
        
        return employees;
    }
   

	
}
