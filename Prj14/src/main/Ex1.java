package main;

public class Ex1 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    try {
      arr[5] = 5;
    } catch (ClassCastException e) {
      System.out.println("error: "+e);
    }catch(Exception e){
      System.out.println("error: "+e);
    }
    System.out.println("정상 종료");
  }
}
