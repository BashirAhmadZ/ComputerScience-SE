package student;

public class TestStudend {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new 
				Student(101, "Ahmad", "Zaky", "SE", "CS", "Male");
		Student s3 = new 
				Student(30, "Israfil", "Abdul Mateen", "CS", "IT", "I dont know!");
	
		s1.setId(49);
		s1.setName("Ali");
		s1.setfName("Mossa");
		s1.setCourse("BBA");
		s1.setDept("Econamic");
		s1.setGender("M");
		
		s1.activity(49);
		String result = s1.result(49, 90);
		
		System.out.println(result);
		//s1.information(s1);
		
		
		
	}

}
