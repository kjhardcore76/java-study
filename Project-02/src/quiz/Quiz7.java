package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		double d = 1.2;
		float f = 0.9f;

		int i = (int) d;// 1
		System.out.println(i);
		int i2 = (int) f;// 0
		System.out.println(i2);
		int i3 = (int) d + (int) f;// 1
		System.out.println(i3);
		int i4 = (int) (d + f);// 2
		System.out.println(Math.ceil(d));
	}

}
