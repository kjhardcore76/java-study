package ramda;

public class Ex1Functional {
  public static void main(String[] args) {
    StringConcatImp stringConcatImp = new StringConcatImp();
    stringConcatImp.makeString("aaa", "bbb");
    StringConcat stringConcatRamda = (str1, str2)-> str1+" "+str2;
    //StringConcat stringConcatRamda = (str1, str2)-> System.out.println(str1+str2);
    //stringConcatRamda.makeString("aaa","bbb");
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

