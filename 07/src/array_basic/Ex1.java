package array_basic;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex1 {

	public static void main(String[] args) {
		// Array Copy
		int[] intArr1 = new int[3];
		int[] intArr2 = {1,2,3};
		int intArr3[] = new int[3];
		int intArr4[] = {1,2,3};
		int[] concatArr1 = new int[intArr3.length + intArr4.length];
		System.arraycopy(intArr1, 0, concatArr1, 0, intArr1.length);
		System.arraycopy(intArr2, 0, concatArr1, intArr1.length, intArr2.length);
		int[] concatArr2 = IntStream.concat(Arrays.stream(intArr1), Arrays.stream(intArr2)).toArray();
		int arrTotalLength = 0;
		
	}

}
