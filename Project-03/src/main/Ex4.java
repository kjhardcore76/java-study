package main;

public class Ex4 {

	public static void main(String[] args) {
		int math = 5;
		int eng = 5;
		int total = math + eng;
		int avg = total / 3;
		System.out.println(avg);
		double avg2 = total / 3;
		System.out.println(avg2);
		double avg3 = total / 3.0;
		System.out.println(avg3);
		int avg3ToInt = (int) avg3;
		System.out.println(avg3ToInt);
		String str = String.format("%.2f", avg3);
		System.out.println(str);
		
	}

}
