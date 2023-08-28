package datetst;

import java.util.Date;

public class Datetst {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		Datetst test = new Datetst();
		System.out.println(test.toString()+"\n");
		System.out.println(date.toString());
		System.out.println(date.getDay()+"\t"+ date.getHours()+"\t" 
				+date.getMinutes()+"\t"+date.getSeconds());
		System.out.println(date.getTime());

	}

}
