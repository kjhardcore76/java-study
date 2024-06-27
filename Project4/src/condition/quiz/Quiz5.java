package condition.quiz;

public class Quiz5 {

	public static void main(String[] args) {
		int avr = 50;
		char result;
		if(avr >= 90) {
			result ='수';
		}else if(avr >= 80){
			result ='우';
		}else if(avr >= 70){
			result ='미';
		}else {
			result ='양';
		}
		System.out.println(result);
	}

}
