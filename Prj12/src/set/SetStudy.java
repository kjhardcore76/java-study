package set;

import java.util.HashSet;
import java.util.Iterator;

public class SetStudy {
	public static void  main (String[] args) {
		HashSet<String> user = new HashSet<String>();
		user.add("user2");
		user.add("user2");
		user.add("user1");
		/*
		System.out.println(user.size());
		*/
		/*
		Iterator<String> ir = user.iterator();
		while(ir.hasNext()) System.out.println(ir.next());
		
		*/
		for(String name : user) System.out.println(name);
	}
}
