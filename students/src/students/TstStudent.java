package students;

public class TstStudent {

	int w;
	String p;
	public static void main(String[] args) {
		
		int x = 100;
		String y =  "Ahmad";
		
		TstStudent tst1 = new TstStudent();
		System.out.println("w ="+tst1.w);
		System.out.println("p = "+tst1.p);
		System.out.println();
		
		System.out.println("x is = "+x);
		System.out.println("y is = "+y);
		Student student1 = new Student();
		
		System.out.println("Name = "+student1.name);
		System.out.println("Age = "+student1.age);
		System.out.println("Gender = "+student1.gender);
		System.out.println("Is SM = "+student1.isSM);
	}

}
