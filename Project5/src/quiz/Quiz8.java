package quiz;

import java.util.Calendar;

public class Quiz8 {

	

	public static void main(String[] args) {
		Order order = new Order();
		order.no = 1;
		order.cal = Calendar.getInstance();
		order.cal.set(2024,6,4);
		System.out.println(order.cal.get(Calendar.MONTH)+1);
		System.out.println(order.cal);
		
	}
}
