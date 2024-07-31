package main;

import java.io.FileReader;
import java.io.FileWriter;

public class Ex3 {
  public static void main(String[] args) throws Exception {
    /*
     * FileReader fr = new FileReader("reader.txt");
     * while(true){
     * int i = fr.read();
     * if(i == -1) break;
     * System.out.print((char)i);
     * }
     */
    FileWriter fw = new FileWriter("writer.txt");
    fw.write("안");
    fw.write("\n");
    fw.write("녕");
    char[] arr = {'a','b','c'};
    fw.write(arr);
    fw.flush();
  }
}
