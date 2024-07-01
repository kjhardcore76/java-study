package loop.main;

public class Ex9 {

	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i =1; i<=20; i++) {
			sum += i;
			if(sum >= 100) break;
			
		}
		System.out.println("i:"+i+" sum:"+sum);
	}

}
