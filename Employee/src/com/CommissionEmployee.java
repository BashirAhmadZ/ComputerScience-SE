package com;
//CommissionEmployee represent an employee salary based 
//on commission
public class CommissionEmployee extends Object{
	
	private final String firstName;
	private final String lastName;
	private final String tazkiraNo;
	private double grossSales;//Sales per Week
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String tazkiraNo, double grossSales,
			double commissionRate) {
		
		super();
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0");
		
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission Rate must be between > 0.0 and < 1.0 ");
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.tazkiraNo = tazkiraNo;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTazkiraNo() {
		return tazkiraNo;
	}

	public double getGrossSales() {
		return grossSales;
	}

	public double getCommissionRate() {
		return commissionRate;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross Sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}

	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >= 1.0)
			throw new IllegalArgumentException(
					"Commission Rate must be between > 0.0 and < 1.0 ");
		
		this.commissionRate = commissionRate;
	}
	
	public double earnings() {
		return grossSales * commissionRate;
	}
	
	@Override
	public String toString() {
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				 "commission employee", firstName, lastName,
				 "social security number", tazkiraNo,
				 "gross sales", grossSales,
				 "commission rate", commissionRate) ;
	}
	
	
}
