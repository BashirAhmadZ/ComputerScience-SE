package passingObjct;

public class Student {
	
	int id;
	String name;
	
	public void info(Student st1) {
		st1.id=1;
		st1.name = "Ahmad";
		Address add = new Address();
		Address add1 = add.setAddress();
		
		
		//System.out.println(add.setAddress());
	}
}
