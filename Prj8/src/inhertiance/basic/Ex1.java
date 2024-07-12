package inhertiance.basic;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child1 = new Child("korea","hong","kildong");
		child1.fn();
	}

}

class Parents{
	String nationality;
	String lastName;
	public int a = 1;
	protected void fn () {
		System.out.println("fn");
	}
	public Parents(String nationality, String lastName) {
		super();
		this.nationality = nationality;
		this.lastName = lastName;
	}
}

class Child extends Parents{
	String firstName; 
	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
		// TODO Auto-generated constructor stub
	}
}