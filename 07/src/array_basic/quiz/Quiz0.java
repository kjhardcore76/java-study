package array_basic.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Quiz0 {

public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>(Arrays.asList("AA","BB","CC"));
	//list.clear();
	//list.removeAll(list);
	int size = list.size();
	for(int i=0; i<size;i++) {
		list.remove(0);
		System.out.println(list);	
	}
	
}


	
}
