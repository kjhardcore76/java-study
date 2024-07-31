package main;

import java.io.FileWriter;

public class Quiz2 {
  public static void main(String[] args) throws Exception{
    FileWriter fw = new FileWriter("fwQuiz2.txt");
    for(int i=2; i<=9; i++){
      for(int j=1; j<=9; j++){
        fw.write(i+"*"+j+"="+i*j);
        fw.write("\n");
      }
      fw.write("----------------\n");
    }
    fw.flush();
  }
}
