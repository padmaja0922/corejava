/**
 * 
 */
package com.joker.java.padmaja.lab3;

/**
 * @author Boot Camp User 008
 *
 */
public class Employee {

   int employeeId;
   char gender;
   float allowances;
   double basicSalary;
   
   
   /**
 * @param employeeId
 */
public Employee(int employeeId) {
	this.employeeId = employeeId;
}


public static void  main(String[] args){
 
      Employee emp = new Employee(123);
      emp.gender = 'F';
      emp.allowances = 2567.65f;
      emp.basicSalary = 23459.50d; 
     emp.printEmployeeDetails( emp);
       
}


/**
 * @param emp
 */
private void printEmployeeDetails(Employee emp) {
	
	System.out.println(" Employee Id : " + emp.employeeId);
	System.out.println(" Employee Gender : "+ emp.gender);
	System.out.println(" Employee Allowances : "+ emp.allowances);
	System.out.println(" Employee Basic Salary : "+emp.basicSalary);
	
}

}
