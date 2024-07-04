package quiz;

public class Quiz7 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "james";
		person.age=22;
		person.isMarried=true;
		person.childrens = 2;
		person.showPerson();		
	}
}

class Person {
	String name;
	int age;
	boolean isMarried;
	int childrens;
	void showPerson() {
		System.out.println("이름"+name+"나이"+age+"결혼여부"+isMarried+"자녀수"+childrens);
	}
}