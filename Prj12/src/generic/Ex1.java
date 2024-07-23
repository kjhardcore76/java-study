package generic;

public class Ex1 {

}

class Powder {
	public void doPrint() {
		System.out.println("Powder 재료로 출력");
	}
	public String toString() {
		return "재료는 powder";
	}
}

class Plastic {
	public void doPrint() {
		System.out.println("plastic 재료로 출력");
	}
	public String toString() {
		return "재료는 plastic";
	}
}

class Printer{
	private Object material;
	
}
