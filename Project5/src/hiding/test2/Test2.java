package hiding.test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		person.name = "hong";
		person.height = 170;
		//person.weight = 50;
		
	}

}

class Person{
	public String name;
	int height;
	private double weight;
	
	public void main() {
		System.out.println(name + " " + height + " " + weight);

	}
}