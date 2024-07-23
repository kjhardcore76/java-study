package wrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class WrapperStudy {

	public static void main(String[] args) {
		/*
		Integer iNum = 123;
		String str = iNum.toString();
		System.out.println(str);
		*/
		/*
		String str = "123";
		Integer iNum = Integer.valueOf(str);
		System.out.println(iNum);
		*/
		/*
		String str = "123";
		Integer iNum = Integer.parseInt(str);
		System.out.println(iNum);
		*/
		/*
		String str = "123.4";
		Float fNum = Float.parseFloat(str);
		System.out.println(fNum);
		*/
		/*
		Float floatNum1 = 1.2345f;
		String strNum1 = String.format("%.2f", floatNum1);
		System.out.println(strNum1);
		*/
		/*
		Boolean bool = true;
		//String str = bool.toString();
		String str = String.valueOf(bool);
		System.out.println("type:"+str.getClass().getName() +", value:"+str);
		*/
		/*
		ArrayList<Character> strList = new ArrayList<Character>();
		strList.add('a'); //autoboxing strList.add(new Charater('a')) 
		strList.add('b'); //autoboxing strList.add(new Charater('b'))
		*/
		
		/*
		ArrayList<Character> strList = new ArrayList<Character>();
		strList.add('a'); //autoboxing strList.add(new Charater('a')) 
		strList.forEach(v -> {
			System.out.println(v);//언박싱: v.charValue()로 변환 
		});
		*/
	}

}
