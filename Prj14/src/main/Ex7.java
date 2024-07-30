package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex7 {
  public static void main(String[] args) {
    try {
      openTextFile();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void openTextFile() throws FileNotFoundException {
    FileInputStream fis = new FileInputStream("src/main/ex6.txt");

  }
}
