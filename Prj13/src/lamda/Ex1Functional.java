package lamda;

public class Ex1Functional {
  public static void main(String[] args) {
    StringConcatImp stringConcatImp = new StringConcatImp();
    stringConcatImp.makeString("aaa", "bbb");

    StringConcat stringConcatLamda = (str1, str2)-> str1+" "+str2;
    String result = stringConcatLamda.makeString("aaa","bbb");
    System.out.println(result);
  }

}

interface StringConcat{
  String makeString(String str1, String str2);
}

class StringConcatImp implements StringConcat{
  @Override
  public String makeString(String str1, String str2){
    return (str1+" "+str2);
  }
}

