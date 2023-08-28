package pack1;
public class Sample {
	
	public int a = 100;
	public int b = 300;
	public int c = a+b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to error!");
		
		Sample s = new Sample();
		System.out.println(s.c);
		s.a = 5000;
		System.out.println(s.c);
	}
}
