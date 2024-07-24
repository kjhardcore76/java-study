package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapStudy {

	public static void main(String[] args) {
		
		HashMap<Integer, String> memberMap = new HashMap<>();
		memberMap.put(1, "user1");
		memberMap.put(1, "user1");
		memberMap.put(2, "user2");
		memberMap.put(3, "user1");
		memberMap.replace(3, "user3");
		/*
		System.out.println(memberMap.size()+"  "+memberMap);
		System.out.println(memberMap.get(1));
		*/
		/*
		Collection<String> values = memberMap.values();
		System.out.println(values);
		*/
		/*
		String result = (memberMap.containsKey(3)) ? "3번은"+ memberMap.get(3) : "3번은 없음";
		System.out.println(result);
		*/
		/*
		Set<Integer> keySet = memberMap.keySet();
		keySet.forEach( key->System.out.println(key+" "+memberMap.get(key)) );
		*/
	}

}
