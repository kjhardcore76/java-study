package innerClass;

class Outer{
  private int a = 1;
  private static int b = 20;
  class Inner{
    int innerA =  a;
    int innerB =  b;
  }
  static class StaticClass{
    //int innerA = a; //lifeCycle error, static이 먼저 생성된다.
    int innerB = b; //lifeCycle error 없음
  }
}

/*  기초개념 
class A {
  int num = 10;
}

class B {
  void method() {
    A a = new A();
    System.out.println(a.num);
  }
}

class C {
  int num = 1;
  D d = new D();// ?????
  class D {
    void method() {
      System.out.println(num);
    }
  }
}

class D {
  void method() {
    System.out.println("D");
  }
}
*/


