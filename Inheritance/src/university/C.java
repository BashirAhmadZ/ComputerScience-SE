package university;

public class C extends B{
	
	int age;
	
	//Constructor
	C(int id){
		super();
		System.out.println("C Class Constructor! Wow");
		this.id = id;
		
	}
	
	//Method in C class
	public void methodC() {
		System.out.println("methodC() printed from C class.");
	}
	
}
