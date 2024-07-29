package stream;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Quiz1 {
  public static void main(String[] args) {
    String[] arr = { "aa", "aa", "b", "b", "ccc" };
    /*
     * //1.1 문자열 목록 중에서 길이가 2보다 큰 요소의 개수를 구하세요
     * List<String> list = Arrays.asList(arr);
     * Stream<String> stream = list.stream();
     * long count = list.stream().filter(t -> t.length() > 2).count();
     * System.out.println(count);
     */
    /*
     * //list와 stream전환
     * Arrays.asList(arr).stream().collect(Collectors.toList())
     */
    /*
     * //1.2 중첩없애기
     * Arrays.asList(arr).stream().distinct().forEach(str->System.out.println(str));
     */
    /*
     * //1.3IntStream 타입의 stream
     * System.out.println(Arrays.asList(arr).stream().mapToInt(str ->
     * str.length()).min().getAsInt());
     */

    String[] arr2 = { "file1.txt.img", "file2.file2.pdf", "file3.file3.txt", "file4.img", "file5.txt", "file6.img" };
    /*
     * //2.1 txt 파일만 찾기
     * Arrays.asList(arr2).stream().filter(str->str.endsWith(".txt")).forEach(str->
     * System.out.println(str));
     */

    /*
     * //2.2 확장자별로 파일의 개수를 구하세요
     * Arrays.asList(".txt",".pdf",".img").stream().forEach(ext->{
     * Long cnt = Arrays.asList(arr2).stream().filter(filename ->
     * filename.endsWith(ext)).count();
     * System.out.println(ext+"파일갯수: "+cnt);
     * });
     */

    /*
     * // 파일의 확장자만 추출하기
     * Arrays.asList(arr2).stream().map((filename) -> {
     * Pattern pattern = Pattern.compile("\\..{3}$");
     * Matcher matcher = pattern.matcher(filename);
     * matcher.find();
     * return matcher.group(0);
     * }).distinct().forEach(ext -> System.out.println(ext));
     */
  }
};
