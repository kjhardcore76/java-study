package Quiz;

public class Quiz4 {
	public static void main(String[] args) {
		int eng = 90;
		int math = 70;
		int kor = 100;
		int total = eng + math + kor;
		double avg = total / 3.0;
		System.out.println("총점은 "+total+", 평균은 "+avg);
//		String avgTo3f = String.format("%.2f", avg);
//		System.out.println("총점은 "+total+", 평균은 "+avgTo3f);

	}
}
