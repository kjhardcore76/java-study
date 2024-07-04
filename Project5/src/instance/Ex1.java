package instance;

public class Ex1 {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.studentID = 1;
		hong.studentName ="hong kil dong";
		hong.grade = 2;
		hong.address ="incheon";
		/*
		System.out.println(hong.studentID);
		System.out.println(hong.studentName);
		System.out.println(hong.grade);
		System.out.println(hong.address);
		*/
		hong.showStudentInfo();
		
		Student kim = new Student();
		kim.studentID = 2;
		kim.studentName ="kim jin hyung";
		kim.grade = 3;
		kim.address ="seoul";
		/*
		System.out.println(hong.studentID);
		System.out.println(hong.studentName);
		System.out.println(hong.grade);
		System.out.println(hong.address);
		*/
		kim.showStudentInfo();
		
	}

}
