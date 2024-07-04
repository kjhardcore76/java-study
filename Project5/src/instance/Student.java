package instance;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public void showStudentInfo() {
		System.out.println("학번"+studentID+",이름"+studentName+",학년:"+grade+",주소"+address);
	}
}
