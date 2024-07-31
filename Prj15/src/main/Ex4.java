package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Ex4 {
  public static void main(String[] args) throws Exception {
    /*
     * FileInputStream fis = new FileInputStream("reader.txt");
     * InputStreamReader isr1 = new InputStreamReader(fis); // 인자로 기반스트림 넣기
     * while(true){
     * int i = isr1.read(); // 내용을 문자(2byte)로 변환하여 가지고옴
     * if (i == -1) break;
     * System.out.print((char)i); //50504 45397 54616 49464 50836
     * }
     */
    
    long start = 0;
    long end = 0;
    FileInputStream fis = new FileInputStream(("a.txt"));//기반스트림
    FileOutputStream fos = new FileOutputStream("a-copy.txt");
    start = System.currentTimeMillis();
    while (true) {
      int i = fis.read();
      if(i==-1) break;
      fos.write(i);
    }
    end = System.currentTimeMillis();
    System.out.println( "1"+(end-start)/1000);

    BufferedInputStream bis = new BufferedInputStream(fis);
    BufferedOutputStream bos = new BufferedOutputStream(fos);
    start = System.currentTimeMillis();
    while (true) {
      int i = bis.read();
      if(i==-1) break;
      bos.write(i);
    }
    end = System.currentTimeMillis();
    System.out.println( "2"+(end-start)/1000);
  }
  
}
