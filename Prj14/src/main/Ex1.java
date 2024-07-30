package main;

public class Ex1 {
  public static void main(String[] args) {
    /*
     * Integer obj = new Integer(0);
     * String str = (String) obj;
     * System.out.println(str);
     */
    try {
      Object obj = new Integer(0);
      String str = (String) obj;
      System.out.println(str);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
