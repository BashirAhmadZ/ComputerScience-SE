package com;

public class CommissionEmpTest {

	public static void main(String[] args) {
		
		BasePlus_CoEmp emp1 = new BasePlus_CoEmp(
				"Ali", "Ayobi", "1399-0003-12000", 64560, .05, 500);
		
		System.out.println(emp1);
		
		System.out.println("Employee Salary: "+emp1.earnings());
		
		
		
		
		
		/*
		 * CommissionEmployee empolyee = new CommissionEmployee(
		 * "Ahmad","Mohammadi","1402-0944-43432",5000, 0.15);
		 * System.out.println(empolyee);
		 * System.out.println("Empolyee Salary: "+empolyee.earnings()+"\n");
		 * 
		 * empolyee.setGrossSales(100000); empolyee.setCommissionRate(.18);
		 * System.out.println("Gross sales increse "+empolyee.getGrossSales());
		 * System.out.println("Commisson rate increased :"+empolyee.getCommissionRate())
		 * ; System.out.println("Empolyee Salary: "+empolyee.earnings()+"\n");
		 */

	}

}
