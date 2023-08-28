package mywork;

public class Sample extends Object{
	
	private String id;
	private int sum, number1, number2;
	private String name;
	private String FatherName;
	private double salary;
	private boolean isMarried;

	public Sample() {
		super();
		System.out.println("From Sample()\n");
	}

	public Sample(String id) {
		super();
		this.id = id;
		System.out.println("From Sample(String id)\n");
	}

	public Sample(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		sum = number1 + number2;
		System.out.println("From Sample(int number1, int number2)n");
		System.out.println("Sum = "+sum+"\n");
	}

	public Sample(String name, String fatherName) {
		super();
		this.name = name;
		this.FatherName = fatherName;
		System.out.println("Sample(String name, String fatherName)\n");
	}

	public Sample(boolean isMarried) {
		super();
		this.isMarried = isMarried;
		System.out.println("Sample(boolean isMarried)\n");
	}

	public Sample(double salary) {
		super();
		this.salary = salary;
		System.out.println("Sample(double salary)\n");
	}

	public Sample(String id, int sum, int number1, int number2, String name, String fatherName, double salary,
			boolean isMarried) {
		super();
		this.id = id;
		this.sum = sum;
		this.number1 = number1;
		this.number2 = number2;
		this.name = name;
		FatherName = fatherName;
		this.salary = salary;
		this.isMarried = isMarried;
	}
	
	  @Override 
	  public String toString() {
	  
	  return "ID:"+id+"\nName: "+name+",Father Name: " +
			  FatherName+"\n Sum of Numbers: "+sum+"\nSalary: " +
			  salary+"\nIs Married?"+isMarried+"\n"; 
	  }
	 
	
	
	
	
	
	
	
	
	
	
	
	
}
