package string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringStudy {
	
	
	 
	 public static void main(String[] args) {
		 String [] alphabetArr = "abcdefghijklmnopqrstuvwxyz".split("");
		 Map<String, Integer> alphabetMap= new HashMap<>();
		 
		 for(String alpabet : alphabetArr) {
			 alphabetMap.put(alpabet, 0);
		 }
		 
		 String str = "hell o";
		 String [] strArr = str.split("");
		 List<String> strList = Arrays.asList(strArr);
		 
		 for(String ch : strArr) {
			 if (alphabetMap.get(ch) != null) alphabetMap.put(ch, alphabetMap.get(ch) + 1); 
		 }
		 //System.out.println(alphabetMap);
		 
		 strList.forEach(c ->{ 
			
		 	if(c.trim().length() != 0) System.out.println(c+":"+alphabetMap.get(c));
		 });
		  
	 }
	 
	 
	 
}



