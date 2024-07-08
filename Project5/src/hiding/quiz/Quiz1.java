package hiding.quiz;

public class Quiz1 {
	static Book book1 = new Book();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book1.setTitle("자바프로그램");
	}


}

class Book{
	private String title;
	private int price;
	private String publisher;
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	public String getTitle () {
		return this.title;
	}
	
	public int getPrice () {
		return this.price;
	}
	
	public String getPublisher () {
		return this.publisher;
	}
}
