package empoly;

public class TestEmp {

	public static void main(String[] args) {
		Empoly emp1 = new Empoly();
		//emp1.setId();
		emp1.setName("Haroon");
		//emp1.setSalary(50000);
		
		emp1.display(emp1);
		
		System.out.println();
		Empoly emp2 = new Empoly(110, "Ali", "Abdullah", "M", 1000.5);
		Empoly emp3 = new Empoly();
		
		System.out.println();
		emp2.display(emp2);
		
		System.out.println();
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		
		emp2.display(emp3);

	}

}
