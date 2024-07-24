package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Quiz {
	public static void main(String[] args) {
		/*
		HashMap<Character, String> fruitSet = new HashMap<>();
		fruitSet.put('a', "사과");
		fruitSet.put('b', "바나나");
		fruitSet.put('c', "코코넛");
		
		System.out.println(fruitSet.get('b'));
		fruitSet.replace('b', "블루베리");
		fruitSet.remove('a');
		System.out.println(fruitSet);
		*/
		/*
		HashMap<String, Float> map = new HashMap<>();
		map.put("국어", 80.0f);
		map.put("수학", 90.0f);
		map.put("영어", 100.0f);
		
		Set<String> keySet = map.keySet();
		Collection<Float> values = map.values();
		
		for(String key:keySet) System.out.println(key);
		values.forEach(v -> System.out.println(v));
		*/ 
		HashMap<Integer, Student> map = new HashMap<>();
		Student student1 = new Student(1,"name1", 90, 80, 70);
		Student student2 = new Student(2,"name2", 55, 65, 75);
		Student student3 = new Student(3,"name3", 80, 50, 60);
		
		map.put(student1.id, student1);
		map.put(student2.id, student2);
		map.put(student3.id, student3);
		
		Collection<Student> students =  map.values();

		students.forEach(s->{
			System.out.println(s.name +"의 "+"총점은"+(s.kor + s.math + s.eng));
		});
		
		Integer korTotal = 0;
		Integer mathTotal = 0;
		Integer engTotal = 0;
		
		for(Student s : students) {
			korTotal += s.kor;
			mathTotal += s.math;
			engTotal += s.eng;
		}
		System.out.println("국어 총점은 "+ korTotal);
		System.out.println("수학 총점은 "+ mathTotal);
		System.out.println("영어 총점은 "+ engTotal);
		
	}
}

class Student {
	Integer id;
	String name;
	Integer kor;
	Integer math;
	Integer eng;
	public Student(Integer id, String name, Integer kor, Integer math, Integer eng) {
		super();
		this.id = id;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}
	
}
