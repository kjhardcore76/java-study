package object;

public class ToStringOverride {
	public static void main(String[] args) {
		Book book = new Book(50,"개미");
		System.out.println(book.hashCode());
		
	}
}

class Book{
	int bookNumber;
	String bookTitle;
	public Book(int bookNumber, String bookTitle) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "title: "+this.bookTitle+" number: "+this.bookNumber;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	
}