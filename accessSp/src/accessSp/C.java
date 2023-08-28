package accessSp;

class C {
	
	private int no;
	private boolean x;
	
	/*
	 * public static void main(String[] args) { C c1 = new C();
	 * System.out.println(c1.no); System.out.println(c1.x); c1.m1();
	 * System.out.println(c1.convert()); }
	 */
	protected void m1() {
		System.out.println("Hi m1()");
	}
	
	private int convert() {
		return x ? 1 : -1;
	}
}
