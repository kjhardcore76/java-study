package main;

public class Ex2 {
  public static void main(String[] args) {
    /*
     * String str = "1.23f";
     * float num = Float.parseFloat(str);// float type
     */
    try {
      String str = "1.23f";
      Integer num = Integer.parseInt(str);// float type
    } catch (NumberFormatException e) {
      System.out.println(e);
    }
  }
}
