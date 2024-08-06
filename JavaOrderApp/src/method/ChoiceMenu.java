package method;

import java.util.Scanner;

public class ChoiceMenu {
  public void choiceMenu() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("---------------------------------------------");
    System.out.println("메뉴를 선택하세요");
    String menu = "";
    menu += "1. 주문하기\n";
    menu += "2. 전체 주문 목록\n";
    menu += "3. 회원별 주문 목록\n";
    menu += "4. 일자별 주문 목록\n";
    menu += "5. 주문취소\n";
    menu += "6. 주문수정\n";
    menu += "7. 종료";
    System.out.println(menu);
    System.out.println("---------------------------------------------");
    System.out.print("메뉴: ");
    int choice = 0;
    try {
      choice = scanner.nextInt();
      System.out.println("---------------------------------------------");
      if (choice == 1) {
        AddOrder addOrder = new AddOrder();
        addOrder.addOrder();
      } else if (choice == 2) {
        ShowAllOrder showAllOrder = new ShowAllOrder();
        showAllOrder.ShowAllOrder();
      } else if (choice == 3) {
        ShowFilteredOrder showFilteredOrder = new ShowFilteredOrder();
        showFilteredOrder.showFilteredOrder("name");
      } else if (choice == 4) {
        ShowFilteredOrder showFilteredOrder = new ShowFilteredOrder();
        showFilteredOrder.showFilteredOrder("date");
      } else if (choice == 5) {
        DelteOrder delteOrder = new DelteOrder();
        delteOrder.delteOrder();
      } else if (choice == 6) {
        UpdateOreder updateOreder = new UpdateOreder();
        updateOreder.updateOreder();
      } else if (choice == 7) {
        System.out.println("프로그램 종료");
      }
    } catch (Exception e) {// validating
      System.out.println("1~7번 사이의 숫자만 입력하세요");
      choiceMenu();
    }

  }
}
