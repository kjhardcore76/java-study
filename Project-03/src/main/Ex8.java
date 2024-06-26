package main;

public class Ex8 {

	public static void main(String[] args) {
		int motherAge = 47;
		int fatherAge = 50;
		
		String str = (motherAge > fatherAge) ? "엄마연상" : "아빠연상";
		System.out.println(str);
		
		char chr = (motherAge > fatherAge) ? 'm':'f';
		int i = (motherAge > fatherAge)? 1:2;
		
		boolean bool = (motherAge > fatherAge) ? true : false;
		System.out.println(bool);

	}

}
