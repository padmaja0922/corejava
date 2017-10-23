/**
 *  This class creates 2 objects of Employee entity class and if monthly salary is
 *  less than zero it sets to zero and calculates yearly salary and yearly salary after 10% raise 
 */
package com.bcj.corejava.classes.medium.lab2;

/**
 * @author Boot Camp User 008
 *
 */
public class EmployeeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Employee firstEmp = new Employee("John","Wright",4456.0d);
		Employee secondEmp = new Employee("Babra","Edwin",3429.0d);
		
		if (firstEmp.getMonthlySalary()<0)
			firstEmp.setMonthlySalary(0);
			
	     if(secondEmp.getMonthlySalary()<0)
	    	 secondEmp.setMonthlySalary(0);
	     
	     System.out.println("Yearly Salary of First Employee : "+firstEmp.getMonthlySalary()*12);
	     System.out.println("Yearly Salary of Second Employee : "+secondEmp.getMonthlySalary()*12); 
	     
	     double total = (firstEmp.getMonthlySalary()*12)*0.01;
	     System.out.println(total);
	      
	     System.out.println("Yearly Salary of First Employee  after 10% raise : "+ ((firstEmp.getMonthlySalary()*12)+total));
	     total = (secondEmp.getMonthlySalary()*12)*0.01;
	     System.out.println("Yearly Salary of second Employee  after 10% raise : "+ ((secondEmp.getMonthlySalary()*12)+total));	
		

	}

}
