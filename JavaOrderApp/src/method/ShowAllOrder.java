package method;
import java.util.ArrayList;
public class ShowAllOrder {
  public void ShowAllOrder() {
    ReadAllRow readAllRow = new ReadAllRow();
    ArrayList<Row> rows = readAllRow.readAllRow();
    System.out.println("전체 주문 내역");
    ShowAllRow showAllRow = new ShowAllRow();//전제 주문 내역 반환
    showAllRow.showAllRow(rows);//전체 주문 내역 출력
    ChoiceMenu choiceMenu = new ChoiceMenu();
    choiceMenu.choiceMenu();
  }
}
