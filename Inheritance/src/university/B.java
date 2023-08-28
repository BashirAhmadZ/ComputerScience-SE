package university;

public class B extends A {
	
	int id;//Data
	
	//Constructor
	B(){
		super();
		System.out.println("B Class Constructor!");
	}
	
	//Method
	public void methodB() {
		System.out.println("methodB() is printed from B class");
	}
}
