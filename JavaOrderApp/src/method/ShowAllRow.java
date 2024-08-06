package method;

import java.util.ArrayList;

public class ShowAllRow {
  
  public void showAllRow(ArrayList<Row> rows){
    rows.stream().forEach(row -> showRow(row));
  }//ShowAllRow end

  public void showRow(Row row){
    String line = "";
    line += "상품번호: " + row.id + ", ";
    line += "고객명: " + row.name + ", ";
    line += "상품명: " + row.id + ", ";
    line += "갯수: " + row.count + ", ";
    line += "가격: " + row.price + ", ";
    line += "주문일자: " + row.date + " " + row.time;
    System.out.println(line);
  }//showRow end
}//class end
