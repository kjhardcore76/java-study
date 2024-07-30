package main;

import java.util.*;

public class Ex5 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		Iterator<Integer> iterator = set.iterator();
		try {
			iterator.next();
			iterator.next();
			iterator.next();
			iterator.next();
		} catch (NoSuchElementException e) {
			System.out.println(e);
		}
		System.out.println("정상종료");
	}	
}
