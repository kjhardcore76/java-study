package method;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShowFilteredOrder {
  // 전체 주문 정보에서 이름에 해당하는 주문 정보를 출력
  void showFilteredOrder(String fieldName) {
    if (fieldName == "name") {
      System.out.println("주문자 이름을 입력하세요");
      System.out.print("이름: ");
    } else {
      System.out.println("주문일자를 입력하세요 (yy-mm-dd)");
      System.out.print("일자: ");
    }

    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    ReadAllRow readAllRow = new ReadAllRow();
    ArrayList<Row> rows = readAllRow.readAllRow();//전체 주문 목록 반환

    ArrayList<Row> filteredRows = (fieldName == "name")
        ? (ArrayList<Row>) rows.stream().filter(row -> row.name.equals(input)).collect(Collectors.toList()) //이름으로 검색된 배열 반환 
        : (ArrayList<Row>) rows.stream().filter(row -> row.date.equals(input)).collect(Collectors.toList()); //일자로 검색된 배열 반환
    
    
    if (filteredRows.size() == 0) {
      System.out.println("주문내역이 존재하지 않습니다");
    } else {
      ShowAllRow showAllRow =new  ShowAllRow();
      System.out.println(filteredRows.size()+"건의 주문내역이 존재합니다");
      showAllRow.showAllRow(filteredRows);
    }
    ChoiceMenu choiceMenu = new ChoiceMenu();
    choiceMenu.choiceMenu();
  }
}
