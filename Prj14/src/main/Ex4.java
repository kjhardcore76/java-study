package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    try{
      Book book = new Book(); // Book.class 비트 파일이 없을 경우 에러
    }catch(NoClassDefFoundError e){
      System.out.println(e);
    }

  }
}

class Book{
  
}