package method;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class UpdateOreder {
  public void updateOreder() {
    System.out.println("수정하실 주문번호를 입력하세요");
    System.out.print("주문번호: ");
    Scanner scanner = new Scanner(System.in);
    int id = scanner.nextInt();
    scanner.nextLine();
    ReadAllRow readAllRow = new ReadAllRow();
    ArrayList<Row> rows = readAllRow.readAllRow();
    ArrayList<Row> filteredRows = (ArrayList<Row>) rows.stream().filter(row -> row.id == id)
        .collect(Collectors.toList());

    ChoiceMenu choiceMenu = new ChoiceMenu();
    if (filteredRows.size() == 0) {
      System.out.println("주문번호가 존재하지 않습니다");
      choiceMenu.choiceMenu();
      return;
    }
    try {
      Row row = filteredRows.get(0);
      System.out.print("성명: ");
      String name = scanner.nextLine();
      System.out.print("상품명: ");
      String product = scanner.nextLine();
      System.out.print("수량: ");
      int count = scanner.nextInt();
      System.out.print("가격: ");
      int price = scanner.nextInt();
      row.name = name;
      row.proudct = product;
      row.count = count;
      row.price = price;
      WriteAllRow writeAllRow = new WriteAllRow();
      writeAllRow.writeAllRow(rows);
      System.out.println("수정된 주문 내역");
      ShowAllRow showAllRow = new ShowAllRow();
      showAllRow.showRow(row);
    } catch (Exception e) {
      System.out.println("주문 방법을 확인 후 다시 사용해 주세요");
    }
    choiceMenu.choiceMenu();
  }
}
