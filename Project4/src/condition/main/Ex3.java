package condition.main;

public class Ex3 {

	public static void main(String[] args) {
		int age = 5;
		if(age < 8) {
			System.out.println("미취학아동");
		}else if(age < 14) {
			System.out.println("초등학생");
		}else if(age < 20) {
			System.out.println("중고등학생");
		}else {
			System.out.println("성인");
		}
	}

}
