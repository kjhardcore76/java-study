package condition.quiz;

public class Quiz3 {

	public static void main(String[] args) {
		String gender ="F";
		char c = 'F';
		
		String str =  Character.toString('F');
		if(gender.equals(str))
			System.out.println("woman");
		else
			System.out.println("man");
		
		System.out.println(gender.equals(str));
		System.out.println(str.getClass().getName());
	}

}
