package empoly;

public class Empoly{
	
	private int id;
	private String name, fName, gender;
	private double salary;
	
	public Empoly() {
		
	}
	
	public Empoly(int id, String name, String fName, String gender, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.fName = fName;
		this.gender = gender;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void display(Empoly e) {
		
		System.out.println("Empoly information");
		System.out.println("ID = "+e.getId());
		System.out.println("Name = "+e.getName());
		System.out.println("Father Name = "+e.getfName());
		System.out.println("Gender = "+e.getGender());
		System.out.println("Salary = "+e.getSalary());
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	
}
