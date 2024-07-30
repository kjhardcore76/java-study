package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수를 입력하세요");
    try {
      int num = scanner.nextInt();
      System.out.println(num);
    } catch (InputMismatchException e) {
      System.out.println(e);
    }
    System.out.println("정상종료");
  }
}