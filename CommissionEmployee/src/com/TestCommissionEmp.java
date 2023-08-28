package com;

public class TestCommissionEmp {

	public static void main(String[] args) {
		CommissionEmployee emp = new CommissionEmployee(
				"Ahmad", "ahmadi", "1399-2445-43434", 432432.4, 0.1);
		System.out.println("Printing Empolyee information by get methods");
		System.out.println("Empolyee Name: "+ emp.getName());
		System.out.println("Empolyee Last Name: "+emp.getLastName());
		System.out.println("Tazkira No: "+emp.getTazkiraNo());
		System.out.println("Gross Sales per week: "+emp.getGrossSales());
		System.out.println("Commission rate: "+emp.getCommissionRate());
		System.out.println("Empolyee Salary: "+emp.eranings());
		
		emp.setGrossSales(1000000.0);
		emp.setCommissionRate(.11);
		System.out.println(emp);
		System.out.println("Emp Salary: "+emp.eranings());
		
		
	}

}
