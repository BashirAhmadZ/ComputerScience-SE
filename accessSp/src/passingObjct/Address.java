package passingObjct;

public class Address {
	
	int streetNo;
	String partName;
	
	public Address setAddress() {
		Address add1 = new Address();
		add1.streetNo = 10;
		add1.partName = "Thrid";
		System.out.println("Street no "+add1.streetNo
				+" Part Name "+add1.partName+"\n Balkh- Afghanistan");
		return add1;
	}
	
}
