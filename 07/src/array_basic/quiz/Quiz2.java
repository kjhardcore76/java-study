package array_basic.quiz;

import java.util.ArrayList;
import java.util.List;

public class Quiz2 {

	public static void main(String[] args) {
		Student student1 = new Student("학생1", 10);
		Student student2 = new Student("학생2", 10);
		Student student3 = new Student("학생3", 10);
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		/*
		studentList.forEach((student) -> {
			String studentInfo = student.getInfo();
			System.out.println(studentInfo);
		});
		*/
		for(Student student: studentList) {
			System.out.println("name:" + student.name +" age:"+student.age);
		}
	}

}

class Student {
	String name;
	int age;
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getInfo() {
		return this.name+" "+this.age;
	}
}