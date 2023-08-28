package com;
//CommissionEmployee class represents an employee 
//paid a percentage of gross sales.
public class CommissionEmployee extends Object{
	
	private final String name;
	private final String lastName;
	private final String tazkiraNo;
	private double grossSales; // gross weekly sales
	private double commissionRate;// commission percentage
	
	// five-argument constructor 
	public CommissionEmployee(String name, String lastName, String tazkiraNo, double grossSales,
			double commissionRate) {
		// implicit call to Object's default constructor occurs here
		super();
		
		// if grossSales is invalid throw exception
		if(grossSales < 0.0)
		 throw new IllegalArgumentException(
				 "Gross Sales must be >= 0.0");
		// if commissionRate is invalid throw exception
		if(commissionRate <= 0.0 || commissionRate >=1.0) {
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		
		this.name = name;
		this.lastName = lastName;
		this.tazkiraNo = tazkiraNo;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	}
	// end of Constructor

	//returne name
	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public String getTazkiraNo() {
		return tazkiraNo;
	}

	public void setGrossSales(double grossSales) {
		if(grossSales < 0.0)
			 throw new IllegalArgumentException(
					 "Gross Sales must be >= 0.0");
		this.grossSales = grossSales;
		}
	
	public double getGrossSales() {
		return grossSales;
	}
	
	public double eranings() {
		return commissionRate * grossSales;
	}
	
	public void setCommissionRate(double commissionRate) {
		if(commissionRate <= 0.0 || commissionRate >=1.0) {
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}
	@Override
	public String toString() {

		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",
				 "commission employee", name, lastName,
				 "social security number", tazkiraNo,
				 "gross sales", grossSales,
				 "commission rate", commissionRate);
	}
}
