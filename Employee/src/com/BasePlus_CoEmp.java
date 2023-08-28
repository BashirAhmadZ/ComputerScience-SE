package com;

public class BasePlus_CoEmp extends CommissionEmployee{
	
	private double baseSalary;//Base Salary per Week

	public BasePlus_CoEmp(String firstName, String lastName, String tazkiraNo, double grossSales, double commissionRate,
			double baseSalary) {
		
		super(firstName, lastName, tazkiraNo, grossSales, commissionRate);
		
		if(baseSalary <= 0.0)
			throw new IllegalArgumentException(
					"Base Salary must be > 0.0");
		
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		if(baseSalary <= 0.0)
			throw new IllegalArgumentException(
					"Base Salary must be > 0.0");
		this.baseSalary = baseSalary;
	}
	
	@Override
	public double earnings() {
		
		return super.earnings()+baseSalary;
	}
	
	@Override
	public String toString() {
		System.out.println("Base Salary "+getBaseSalary() );
		return super.toString();
	}
	
	
}
