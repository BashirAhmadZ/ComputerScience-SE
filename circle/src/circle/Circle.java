package circle;

public class Circle {
	
	double rediuse;
	String name;
	
	Circle() {
		rediuse = 1.0;
	}

	Circle(double rediuse) {
		this.rediuse = rediuse;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}


	public double getArea() {
		return rediuse * rediuse * 3.14;
	}
}
