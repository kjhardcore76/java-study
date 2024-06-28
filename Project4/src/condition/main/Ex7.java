package condition.main;

public class Ex7 {
	public static void main(String[] args) {
		int time = 9;
		
		switch(time){
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		default:
			System.out.println("외근");		
		}
	}
}
