package constuctor;

public class Ex1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person("hong", 170, 60);
		Person person2 = new Person("kim", 170, 60);
		person1.showPerson();
		person2.showPerson();
	}
	

}

class Person{
	String name;
	int height;
	int weight;
	//객체만 생성
	public Person() {
		
	}
	
	//이름을 받아서 초기화
	Person (String n) {
		name = n;
	}
	
	Person (String n, int h, int w) {
		name = n;
		height = h;
		weight = w;
	}
	
	void showPerson() {
		System.out.println(name+"  "+height+"  "+weight);
	}
}
