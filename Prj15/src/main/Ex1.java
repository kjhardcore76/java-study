package main;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    /*
     * // 표준출력
     * System.out.println("모니터출력");
     */
    /*
     * // 표준입력시스템
     * try {
     * int i = System.in.read();
     * System.out.println(i);
     * } catch (IOException e) {
     * e.printStackTrace();
     * }
     */

    /*
     * // Scanner는 입력스트립이 아닌 함수이므로 표준입력스트림을 파라미터로 받는다
     * Scanner scanner = new Scanner(System.in);
     * System.out.println("이름");
     * String name = scanner.nextLine();
     * System.out.println(name+"을 입력하셨습니다");
     */

    /*
     * //글자 5개 입력받아서 숫자형 배열로 출력
     * Scanner scanner = new Scanner(System.in);
     * System.out.println("숫자5개를 입력하세요");
     * String str = scanner.nextLine();
     * String[] strArr = str.split("");
     * int[] intArr =
     * Arrays.asList(strArr).stream().mapToInt(v->Integer.parseInt(v)).toArray();
     * System.out.println(Arrays.toString(intArr));
     */

    //while문을 이용한 입력받기
    Scanner scanner = new Scanner(System.in);
    while(true){
      System.out.println("글자를 입력하세요");
      String str = scanner.nextLine();
      if(str.toLowerCase().equals("stop")) {
        System.out.println("종료");
        break;
      }
      System.out.println(str+"를입력하셨습니다");
    }
  }
}
