package Quiz;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		int result = (x++) + (--y);//x = 10, y = 19, result = 29
		//x = 11, y = 19, result = 11 + 19
		System.out.println(result);
	}

}
