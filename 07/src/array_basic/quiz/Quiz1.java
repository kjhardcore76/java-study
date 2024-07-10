package array_basic.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArr = {1,2,5,3,4};
		int big = intArr[0];
		for(int i=1; i<intArr.length; i++) {
			if(big < intArr[i]) {
				big = intArr[i];
			}
		}
		System.out.println(big);
	}

}
