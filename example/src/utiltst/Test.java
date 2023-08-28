package utiltst;

public class Test {

	public static void main(String[] args) {

		/*
		 * StaticTest st1 = new StaticTest(); StaticTest st2 = new StaticTest();
		 * StaticTest st3 = new StaticTest();
		 * 
		 * st1.i = 100; System.out.println(st1.i); System.out.println(StaticTest.i);
		 * //System.out.println(StaticTest.z); we can't access instance variable as
		 * static var System.out.println(st1.z); st1.z= 1000; System.out.println(st1.z);
		 * System.out.println(st2.z); System.out.println(st3.z);
		 * 
		 * st1.m2();//m2() called by Object Reference Var
		 * 
		 * StaticTest.m2();//m2() called by Class Name //StaticTest.m3(); We can't call
		 * instance method with class name!
		 * 
		 * System.out.println(st2.i); System.out.println(st3.i);
		 * 
		 */

		InstanceStatic ins = new InstanceStatic(10, 20); 
		InstanceStatic ins2 = new InstanceStatic(30, 40); 
		InstanceStatic ins3 = new InstanceStatic();
		
		System.out.println("i and j from ins "+ins.i+"  "+ ins.j); 
		ins.m1();
		System.out.println("i and j from ins2 "+ins2.i+"\t"+ ins2.j); 
		ins2.i=100;
		System.out.println("i and j from ins2 "+ins2.i+"\t"+ ins2.j); 
		ins2.m1();
		System.out.println("i and j from ins3   "+ins3.i+"  "+ ins3.j); 
		ins3.j=500;
		System.out.println("i and j from ins3  "+ins3.i+"  "+ ins3.j); 
		ins3.m1();
		System.out.println("i and j from ins"+ins.i+"  "+ ins.j);
		 
	}

}
