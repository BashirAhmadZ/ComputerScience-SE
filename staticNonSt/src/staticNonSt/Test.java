package staticNonSt;

public class Test {

	public static void main(String[] args) {
		
		//System.out.println(Instance.number);//0
		
		Instance ins1 = new Instance();
		//ins1.m1();
		ins1.x = 100; 
		System.out.println(ins1.x);
		
		//System.out.println(ins1.number);
		//System.out.println(Instance.number);//10
	}

}
