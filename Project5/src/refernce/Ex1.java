package refernce;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subject math = new Subject("math", 70);
		Subject korea = new Subject("korea", 80);
		Student student1 = new Student(1,"Hong",math,korea);
		student1.getTotalPoint();
		student1.getAvrPoint();
	}

}

class Subject {
	String subjectName;
	int scorePoint;
	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

}

class Student {
	int id;
	String name;
	Subject math;
	Subject korea;
	public Student(int id, String name, Subject math, Subject korea) {
		super();
		this.id = id;
		this.name = name;
		this.math = math;
		this.korea = korea;
	}
	void getTotalPoint () {
		System.out.println("총점은"+(math.scorePoint+korea.scorePoint));
	}
	void getAvrPoint () {
		float avr =  (math.scorePoint+korea.scorePoint) / 2;
		System.out.println("평균은"+String.format("%.2f",avr));
	}
}