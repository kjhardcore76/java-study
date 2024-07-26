package lamda;

public class Ex4LamdaSort {
  public static void main(String[] args) {
    //implement class
    MynumberImp  mynumberImp  = new MynumberImp();
    int result1 = mynumberImp.max(1,2);
    System.out.println(result1);

    //annoymous class
    Mynumber numberCls = new Mynumber() {
      public int max(int x, int y){
        return x>y?x:y;
      }
    };
    int result2 = numberCls.max(3,1);
    System.out.println(result2);

    //lamda function
    Mynumber numberLamda = (x, y)->x>y? x:y;
    int result3 = numberLamda.max(1,4);
    System.out.println(result3);
  }
}


@FunctionalInterface
interface Mynumber{
  int max(int x, int y);
}

class MynumberImp implements Mynumber{
  public int max(int x, int y){
    return x>y? x:y;
  }
}