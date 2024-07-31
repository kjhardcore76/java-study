package main;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Ex5File {
  public static void main(String[] args) throws Exception {
    File file = new File("C:\\kjhardcore\\java-study\\Prj15\\newfile.txt");
    file.createNewFile();
  /* 
    File dir = new File("C:\\kjhardcore");
    File[] files = dir.listFiles();
    Arrays.stream(files).forEach(v->System.out.println(v.isDirectory()));
    */

    /*
     * file.delete();
     * System.out.println(file.isFile());
     * System.out.println(file.isDirectory());
     * System.out.println(file.getName());
     * System.out.println(file.getAbsolutePath());
     * System.out.println(file.getPath());
     * System.out.println(file.canRead());
     * System.out.println(file.canWrite());
     */
  }
}
