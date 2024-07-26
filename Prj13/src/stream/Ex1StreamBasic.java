package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ex1StreamBasic {
  public static void main(String[] args) {
    List<Integer> listInteger = Arrays.asList(3, 2, 1, 4, 5);
    //Stream<Integer> streamList = listInteger.stream();
    
    /* 최종연산의 주의사항과 stream 생성방법
    streamList.forEach((t) -> {
      System.out.println(t);
    });
    streamList.forEach((t) -> { //최종연산이므로 실행되지 않음
      System.out.println(t);
    });

    listInteger.stream().forEach((t) -> {
      System.out.println(t);
    });
    listInteger.stream().forEach((t) -> {
      System.out.println(t);
    });
    */

    /*  중간연산자와 최종연산 문법 주의사항
    //List<Integer> list1 = listInteger.stream().sorted(); //sorted 는 중간연산자로 stream을 리턴하므로 에러
    //Stream<Integer> list2 = listInteger.sorted(); // sotred는 stream만 적용가능하므로 에러
    Stream<Integer> list3 = listInteger.stream().sorted();
    list3.forEach(t->System.out.println(t));
    String[] strArr = { "a", "b", "c" };
    Stream<String> streamArr = Stream.of(strArr);
    // Stream<String> streamArr = Arrays.stream(strArr);
    */

    /*forEach 람다식표현을 추상클래스로 전환 예시
    //Stream<Integer> stream = listInteger.stream().filter(t -> t % 2==0);
    Stream<Integer> stream = listInteger.stream().filter(new Predicate<Integer>() {
      @Override
      public boolean test(Integer t) {
        return t % 2==0;
      }
    });
    stream.forEach(t -> System.out.println(t));
    */
    
  
    listInteger.stream()
    .sorted(Comparator.reverseOrder())
    .forEach(t -> System.out.println(t));
  }
}
