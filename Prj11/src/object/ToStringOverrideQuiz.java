package object;

public class ToStringOverrideQuiz {
	public static void main(String[] args) {
		Dog dog = new Dog("진돗개" , "멍멍이");
		System.out.println(dog.toString());
	}
}

class Dog{
	String name;
	String type;
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name + " " + this.type;
	}
}