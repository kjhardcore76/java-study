package condition.quiz;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 3;
		String result;
		if(month <= 2 || month >= 12) {
			result = "겨울";
		}else if(month <= 5) {
			result = "봄";
		}else if(month <= 8) {
			result = "여름";
		}else if(month <= 11) {
			result = "가을";
		}else {
			result = "오류";
		}
		System.out.println(result);
	}

}
