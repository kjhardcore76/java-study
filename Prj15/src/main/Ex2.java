package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex2 {
  public static void main(String[] args) throws Exception {
    /*
     * // 텍스트 파일과 연결된 입력 스트림 생성
     * FileInputStream fis = new FileInputStream("input.txt");
     * System.out.println(fis.read());
     * System.out.println(fis.read());
     * System.out.println(fis.read());
     */
    /*
     * // 텍스트 파일과 연결된 입력 스트림 생성
     * FileInputStream fis = new FileInputStream("input.txt");
     * System.out.println((char)fis.read());
     * System.out.println((char)fis.read());
     * System.out.println((char)fis.read());
     */
    /*
     * FileInputStream fis = new FileInputStream("input.txt");
     * while(true) {
     * int i = fis.read();
     * if(i == -1) {break;}
     * System.out.print((char)i);
     * }
     */

    /*
     * FileInputStream fis = new FileInputStream("input2.txt");
     * byte[] arr = new byte[5];
     * int size;
     * while (true) {
     * size = fis.read(arr);//배열을 파라메터로 받으면 반복해서 읽은 횟수를 반환한다
     * if (size == -1) {
     * break;
     * }
     * for (int i = 0; i < size; i++) {
     * System.out.print((char) arr[i]);
     * }
     * 
     * System.out.println(": " + size + "바이트 읽음");
     * }
     */
    /*
     * FileOutputStream fos = new FileOutputStream("output.txt");
     * byte a = 65;//(byte)'a'
     * byte b = 66;//(byte)'b'
     * 
     * fos.write(a);
     * fos.write(b);
     * fos.write('c');
     */

  }
}
