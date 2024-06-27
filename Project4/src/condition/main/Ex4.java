package condition.main;

public class Ex4 {

	public static void main(String[] args) {
		//float이나 double형은 switch문에서 사용할 수 없음
		float rank = 1.0f; 
		int i = (int) rank;
		switch (i) {
		case 1:
			System.out.println("금메달");
			break;
		case 2:
			System.out.println("은메달");
			break;
		case 3:
			System.out.println("동메달");
			break;
		case 4:
			System.out.println("노메달");
			break;			
		}

	}

}
