package lamda;

public class Ex2LamdaCalc {
  public static void main(String[] args) {
    Add add = (num1, num2) -> {return num1 + num2;};
    System.out.println(add.getResult(1,2));
  }
}

class Add2 implements Add{
  public int getResult(int num1, int num2){
    return num1 + num2;
  }
}

//@FunctionalInterface
interface Add{
  int getResult(int num1, int num2);
}
