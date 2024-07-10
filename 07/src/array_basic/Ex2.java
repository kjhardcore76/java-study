package array_basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] intArr = {5,6,7};
		ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(intArr));
		intList.add(8);
		System.out.println(intList.size());
		
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList("apple","orange","banana"));
		strList.add(0, "tomato");
		strList.set(strList.indexOf("orange"), "kiwi");
		strList.remove(0);
		System.out.println(strList);
	}

}
