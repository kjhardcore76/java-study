package hiding;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate mydate = new MyDate(7,8);
		mydate.setDate(12,25);
		mydate.getDate();
	}

}

class MyDate {
	private int month;
	private int day;
	public void getDate() {
		System.out.println(month+"월,"+day+"일");
	}
	public void setDate(int month, int day) {
		this.month = month;
		this.day =day;
	}
	public MyDate(int month, int day) {
		super();
		this.month = month;
		this.day = day;
	}
	
}  
