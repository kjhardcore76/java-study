package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;

public class QuizRecursivefunction {
  public static void main(String[] args) throws Exception {
    String hypen = "-";
    FileWriter fw = new FileWriter("result.txt");
    printDir("C:\\Users\\G201\\Downloads", fw, hypen);
    fw.flush();
    
  }

  static void printDir(String path, FileWriter fw, String hypen) throws Exception {
    File file = new File(path);
    File[] arr = file.listFiles();
    System.out.println(Arrays.toString(arr));
    for(File f:arr){
      fw.write(hypen + f.getName()+"\n");
      if(f.isDirectory()==true){
        hypen += "-";
        printDir(f.getAbsolutePath(), fw, hypen);
      }else{
        hypen = "-";
      }
    }
  }
}
