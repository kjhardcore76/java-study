package main;

import java.io.FileOutputStream;
import java.util.Arrays;

public class Quiz1 {
  public static void main(String[] args) throws Exception{
    FileOutputStream fos = new FileOutputStream("quiz1.txt");
    String str = "abcdefghizklmn";
    for(int i=0;i < str.length(); i++){
      fos.write(str.charAt(i));
      
    }
  }
}
