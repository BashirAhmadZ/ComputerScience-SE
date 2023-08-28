package mywork;

public class SampleTest {

	public static void main(String[] args) {
		
		Sample object1 = new Sample();
		System.out.println(object1);
		
		Sample object2 = new Sample(true);
		System.out.println(object2);
		
		Sample object3 = new Sample(25000); 
		System.out.println(object3);
		
		Sample object4 = new Sample(2453, 565645);
		System.out.println(object4);
		
		Sample object5 = new Sample("Ahmad","Ahadi");
		System.out.println(object5);
		
		Sample object6 = new Sample("1400-0501-11111");
		System.out.println(object6);

	}

}
