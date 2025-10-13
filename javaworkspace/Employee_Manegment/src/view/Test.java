//package view;
//
//import java.util.Scanner;
//import java.util.ArrayList;
//import DAO.EmployeeDAO;
//import mainApp.Employee;
//import model.Admin;
//import model.Hr;
//import model.SalesManager;
//
//public class Test {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        EmployeeDAO dao = new EmployeeDAO();
//        ArrayList<Employee> employees=null;
//
//        int choice;
//        do {
//            System.out.println("\n===== Employee Management Menu =====");
//            System.out.println("1. Add Employee");
//            System.out.println("2. Search Employee");
//            System.out.println("3. Update Employee");
//            System.out.println("4. Delete Employee");
//            System.out.println("5. Display All Employees");
//            System.out.println("6. Calculate Salary of Each Employee");
//          
//            System.out.println("0. Exit");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter Employee Type (1-HR, 2-Admin, 3-SalesManager): ");
//                    int type = sc.nextInt();
//
//                    System.out.print("Enter ID: ");
//                    int id = sc.nextInt();
//                    sc.nextLine();
//                    System.out.print("Enter Name: ");
//                    String name = sc.nextLine();
//                    System.out.print("Enter Base Salary: ");
//                    double salary = sc.nextDouble();
//
//                    if (type == 1) {
//                        System.out.print("Enter Commission: ");
//                        double comm = sc.nextDouble();
//                        dao.addEmployee(new Hr(id, name, salary, comm));
//                        System.out.println("HR added successfully!");
//                    } else if (type == 2) {
//                        System.out.print("Enter Allowance: ");
//                        double allowance = sc.nextDouble();
//                        dao.addEmployee(new Admin(id, name, salary, allowance));
//                        System.out.println("Admin added successfully!");
//                    } else if (type == 3) {
//                        System.out.print("Enter Target: ");
//                        int target = sc.nextInt();
//                        System.out.print("Enter Incentive per Target: ");
//                        double incentive = sc.nextDouble();
//                        dao.addEmployee(new SalesManager(id, name, salary, target, incentive));
//                        System.out.println("Sales Manager added successfully!");
//                    } else {
//                        System.out.println("Invalid Type!");
//                    }
//                    break;
//                case 2:
//                    System.out.print("Enter ID to search: ");
//                    int searchId = sc.nextInt();
//                    Employee e = dao.searchEmployeeById(searchId);
//
//                    if (e != null) {
//                        System.out.println("✅ Found Employee: " + e);
//                    } else {
//                        System.out.println("❌ Employee not found.");
//                    }
//                    break;
////                case 2:   	
////                    System.out.print("Enter ID to search: ");
////                    id = sc.nextInt();
////                   
////                    Employee e = dao.searchEmployeeById(id);
////                    System.out.println("name = "+e.getName()+"id =  "+e.getId());
////                    while (e == null) {
////                        System.out.println("Employee not found. Please re-enter a valid ID:");
////                        id = sc.nextInt();
////                        e = dao.searchEmployeeById(id);
////                        System.out.println("enter 0 for exit");
////                        if(id==0) {
////                        	break;
////                        }
////                    }
////                    
////                   
////                	
////				System.out.println("Found: " + e);
////				break;
//				case 3:
//                    System.out.print("Enter ID to update: ");
//                    id = sc.nextInt();
//                    System.out.print("Enter New Salary: ");
//                    salary = sc.nextDouble();
//                    if (dao.updateEmployee(id, salary))
//                        System.out.println("Updated successfully!");
//                    else
//                        System.out.println("Employee not found.");
//                    break;
//                    
//				
//
//                case 4:
//                    System.out.print("Enter ID to delete: ");
//                    id = sc.nextInt();
//                    if (dao.deleteEmployee(id))
//                        System.out.println("Deleted successfully!");
//                    else
//                        System.out.println("Employee not found.");
//                    break;
//
//                case 5:
//                    employees = dao.getAllEmployees();
//                    if (employees.isEmpty()) {
//                        System.out.println("No employees found.");
//                    } else {
//                        System.out.println("\n= Employee List =");
//                        for (Employee emp : employees) {
//                            System.out.println(emp);
//                        }
//                    }
//                    break;
//                    
//                case 6:
//                    employees = dao.getAllEmployees();
//                    if (employees.isEmpty()) {
//                        System.out.println("No employees to calculate.");
//                    } else {
//                        System.out.println("\n= Salary Calculation ==");
//                        for (Employee emp : employees) {
//                            System.out.println(emp.getName() + " → Final Salary: " + emp.calculateSalary());
//                        }
//                    }
//                    break;
////                case 7:
////                    System.out.print("Enter name to search: ");
////                    String newName = sc.next();
////                    Employee emp = dao.searchByName(newName);
////                    
////                    if (emp != null) {
////                        System.out.println("✅ Found Employee: " + emp);
////                    } else {
////                        System.out.println("❌ No employee found with name: " + newName);
////                    }
////                    break;
////                case 7:
////                	System.out.println("enter a name for serch Employee");
////                	String newName = sc.nextLine();
////                	Employee emp = dao.searchByName(newName);
////                	 System.out.println("name = "+emp.getName()+"id =  "+emp.getName());
////                	 while(emp==null) {
////                		 System.out.println("re-enter valid  Name " );
////                		  newName = sc.nextLine();
////                		  e = dao.searchByName(newName);
////                		  System.out.println("enter 0 for exit");
////                		  if(newName == "0") {
////                          	break;
////                          }
////                	 }
//                    
//                case 0:
//                    System.out.println("Exiting... Goodbye!");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice! Try again.");
//            }
//        } while (choice != 0);
//
//        sc.close();
//    }
//}
//	

package view;

import java.util.ArrayList;
import java.util.Scanner;

import controller.EmployeeDAO;
import model.Admin;
import model.Employee;
import model.HR;
import model.SalesManager;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDAO dao = new EmployeeDAO();
		ArrayList<Employee> employees=null;
		int choice;
		do {
			System.out.println("\n===== Employee Management Menu =====");
			System.out.println("1. Add Employee");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Display All Employees");
			System.out.println("6. Calculate Salary of Each Employee");
			System.out.println("0. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter Employee Type (1-HR, 2-Admin, 3-SalesManager): ");
				int type = sc.nextInt();

				System.out.print("Enter ID: ");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter Name: ");
				String name = sc.nextLine();
				System.out.print("Enter Base Salary: ");
				double salary = sc.nextDouble();

				if (type == 1) {
					System.out.print("Enter Commission: ");
					double comm = sc.nextDouble();
					dao.addEmployee(new HR(id, name, salary, comm));
					System.out.println("HR added successfully!");
				} else if (type == 2) {
					System.out.print("Enter Allowance: ");
					double allowance = sc.nextDouble();
					dao.addEmployee(new Admin(id, name, salary, allowance));
					System.out.println("Admin added successfully!");
				} else if (type == 3) {
					System.out.print("Enter Target: ");
					int target = sc.nextInt();
					System.out.print("Enter Incentive per Target: ");
					double incentive = sc.nextDouble();
					dao.addEmployee(new SalesManager(id, name, salary, target, incentive));
					System.out.println("Sales Manager added successfully!");
				} else {
					System.out.println("Invalid Type!");
				}
				break;

			case 2:
				System.out.print("Enter ID to search: ");
				id = sc.nextInt();
				Employee e = dao.searchEmployeeById(id);
				if (e != null)
					System.out.println("Found: " + e);
				else
					System.out.println("Employee not found.");
				break;

			case 3:
				System.out.print("Enter ID to update: ");
				id = sc.nextInt();
				System.out.print("Enter New Salary: ");
				salary = sc.nextDouble();
				if (dao.updateEmployee(id, salary))
					System.out.println("Updated successfully!");
				else
					System.out.println("Employee not found.");
				break;

			case 4:
				System.out.print("Enter ID to delete: ");
				id = sc.nextInt();
				if (dao.deleteEmployee(id))
					System.out.println("Deleted successfully!");
				else
					System.out.println("Employee not found.");
				break;

			case 5:
				employees = dao.getAllEmployee();
				break;

			case 6:
				employees = dao.getAllEmployee();
				for (int i = 0; i < employees.size(); i++) {
					System.out.println(employees.get(i).getName() + " → Final Salary: " + employees.get(i).calculateSalary());
				}
				break;

			case 0:
				System.out.println("Exiting... Goodbye!");
				break;

			default:
				System.out.println("Invalid choice! Try again.");
			}
		} while (choice != 0);

		sc.close();
	}
}
