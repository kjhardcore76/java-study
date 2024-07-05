package refernce.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee head = new Employee("head", 40, 5000, 10);
		Employee senior= new Employee("senior", 30, 4000, 5);
		Employee junior= new Employee("head", 20, 3000, 2);
		Department department = new Department(head, senior, junior);
		department.head.showEmployee();
		
	}
}


class Department{
	Employee head;
	Employee senior;
	Employee junior;
	public Department(Employee head, Employee senior, Employee junior) {
		super();
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}
}

class Employee{
	String name;
	int age;
	int payment;
	int period;
	public Employee(String name, int age, int payment, int period) {
		super();
		this.name = name;
		this.age = age;
		this.payment = payment;
		this.period = period;
	}
	
	void showEmployee() {
		System.out.println("직원정보 [직위=" + name + ", age=" + age + "년, payment=" + payment + "만원, period=" + period + "년]");
	}
	
}