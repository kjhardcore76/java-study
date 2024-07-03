package quiz;

public class Quiz1 {

	public static String calc (int n1, int n2, char oper) {
		String result ;
		if(oper == '+') {
			result = Integer.toString(n1 + n2);
		}else if(oper == '-') {
			result = Integer.toString(n1 - n2);
		}else if(oper == '*') {
			result = Integer.toString(n1 * n2);
		}else if(oper == '/') {
			result = String.format("%.2f", n1 / n2);
		}else{
			result =Integer.toString(n1 % n2);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(calc(1 , 2, '-'));
		
	}

}
