package array_basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex3 {

	public static void main(String[] args) {
	
		int[] intArr = {1,2,5,3,4};
		int[] copyArr = new int[3];
		
		Map<String, Object> person1 = new HashMap<String, Object>() {{
			put("name","hong");
			put("age", 12);
		}};
		Map<String, Object> person2 = new HashMap<String, Object>() {{
			put("name","park");
			put("age", 21);
		}};
		
		
		ArrayList<Map> personList = new ArrayList<Map>();
		personList.add(person1);
		personList.add(person2);
		System.out.println(personList.get(1).get("name"));
	}

}