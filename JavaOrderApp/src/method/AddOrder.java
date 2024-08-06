package method;

import java.util.ArrayList;

public class AddOrder {
  public void addOrder(){
    try {
      System.out.println("주문 사항을 입력하세요");
      ReadAllRow readAllRow = new ReadAllRow();
      ArrayList<Row> rows = readAllRow.readAllRow(); //전체 주문목록 반환
      AddRow addRow = new AddRow();
      Row row = addRow.addRow(rows);//주문 목록 1개 반환
      rows.add(row);//새로운 주문 목록 추가
      WriteAllRow writeAllRow = new WriteAllRow();
      writeAllRow.writeAllRow(rows);//전체 주문 내역 기록
      System.out.println("주문 상세내역");
      ShowAllRow showAllRow = new ShowAllRow();
      showAllRow.showRow(row);//주문목록 1줄 출력
      System.out.println("주문이 완료되었습니다.");
    } catch (Exception e) {
      System.out.println("주문 방법을 확인 후 다시 사용해 주세요");
    }
    ChoiceMenu choiceMenu = new ChoiceMenu();
    choiceMenu.choiceMenu();//메뉴 실행   
  }
}
