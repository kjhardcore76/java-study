package method;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DelteOrder {
  void delteOrder() {
    System.out.println("취소하실 주문번호를 입력하세요");
    System.out.print("주문번호: ");
    Scanner scanner = new Scanner(System.in);
    int id = scanner.nextInt();
    ReadAllRow readAllRow = new ReadAllRow();
    ArrayList<Row> rows = readAllRow.readAllRow();
    ArrayList<Row> filteredRows = (ArrayList<Row>) rows.stream().filter(row -> row.id != id).collect(Collectors.toList());
    if (filteredRows.size() == 0) {
      System.out.println("주문기록이 없습니다. 주문번호를 확인 후 다시 이용하세요");
    } else {
      WriteAllRow writeAllRow = new WriteAllRow();
      writeAllRow.writeAllRow(filteredRows);//변경된 전체 주문 목록 기록
      System.out.println("주문을 취소하였습니다\n변경된 주문 목록");
      ShowAllRow showAllRow = new ShowAllRow();
      showAllRow.showAllRow(filteredRows);//전체 주문 목록 출력
    }
    ChoiceMenu choiceMenu = new ChoiceMenu();
    choiceMenu.choiceMenu();
  }
}
