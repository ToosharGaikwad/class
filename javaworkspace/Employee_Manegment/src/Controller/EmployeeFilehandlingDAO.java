package Controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import mainApp.Employee;
public class EmployeeFilehandlingDAO implements EmployeeDAO {
	static ArrayList <Employee> employees = new ArrayList<Employee>();
	
	static {
		try {
			FileInputStream fileInputStream = new FileInputStream("employeedata.txt");
		
		    ObjectInputStream objectInputStream = new  ObjectInputStream(fileInputStream);
			employees = (ArrayList<Employee>) objectInputStream.readObject();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println("file is not found ");
			e.printStackTrace();
			
		}catch(EOFException e) {
			System.out.println("file is empty");
		}catch (IOException e) {
			System.out.println("input output exception ");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("class not found ");
			e.printStackTrace();
		}
		
	}
		
	public boolean addEmployee(Employee e) {
       
      boolean status = employees.add(e);
      if(status = true) {
    	  saveRecord();
    	  return true;
      }else {
    	 return false; 
      }
    }
	
    public Employee searchEmployeeById(int id) {
        for (int i = 0; i <employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.get(i);
            }
        }
        return null;
    }

    public Employee searchByName(String newName) {
        for (int i = 0; i <employees.size(); i++) {
        	if (employees.get(i).getName().trim().equalsIgnoreCase(newName.trim())) {
        	    return employees.get(i);
        	}
        }
        return null;
    }
  
    public boolean updateEmployee(int id, double newSalary) {
        Employee emp = searchEmployeeById(id);
        if (emp != null) {
            emp.setSalary(newSalary);
            saveRecord();
            return true;
        }
        return false;
    }

    public boolean deleteEmployee(int id) {
    	Employee emp = searchEmployeeById(id);
            if (emp != null) {
               employees.remove(emp);
               saveRecord();
//                employees = null;
                return true;
            
        }
        return false;
    }
    
    
   
    
   public ArrayList <Employee> getAllEmployees(){
	   return employees;
   }

   private void  saveRecord()
	   {
//	   ObjectOutputStream objectOutputStream;

try {
	 ObjectOutputStream objectOutputStream   =new ObjectOutputStream(new FileOutputStream("employeedata.txt"));
	objectOutputStream.writeObject(employees);
} catch (FileNotFoundException e) {
	
	e.printStackTrace();
} catch (IOException e) {
	
	e.printStackTrace();
}  
  }
	
}
	



