package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex6 {
  public static void main(String[] args) {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("src/main/ex6.txt");
      System.out.println("a.txt 파일을 엽니다");
      int i = 10 / 0;
    
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (ArithmeticException e) {
      e.printStackTrace();
    } finally{
      try {
        fis.close();
      } catch (Exception e) {
        // TODO: handle exception
      }
    }
    System.out.println("프로그램 정상 종료");
  }
}
