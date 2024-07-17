package typecascading;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Child( "korea", "hong", "lastName");
		parent.show();
		
		Child child = new Child( "korea", "hong", "lastName");
		child.show();
		
		
	}

}

class Parent {
	String national;
	String firstName;
	public Parent(String national, String firstName) {
		this.national = national;
		this.firstName = firstName;
	}

	public void show() {
		System.out.println("parent");
	}
}

class Child extends Parent{
	String lastName;

	public Child(String national, String firstName, String lastName) {
		super(national, firstName);
		this.lastName = lastName;
	}
	
	public void show() {
		System.out.println(this.national+" "+this.firstName+" "+this.lastName);
	}
	
}
