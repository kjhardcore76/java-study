package method;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.Scanner;

public class AddRow {
  public Row addRow(ArrayList<Row> rows) {
    Scanner scanner = new Scanner(System.in);
    int id;
    if (rows.size() != 0) {
      OptionalInt max = rows.stream().mapToInt(row -> row.id).max();
      id = max.getAsInt() + 1;
    } else {
      id = 1;
    }
    System.out.print("성명: ");
    String name = scanner.nextLine();
    System.out.print("상품명: ");
    String product = scanner.nextLine();
    System.out.print("수량: ");
    int count = scanner.nextInt();
    System.out.print("가격: ");
    int price = scanner.nextInt();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss");
    String now = LocalDateTime.now().format(formatter);
    String[] dateStrArr = now.split(" ");
    String date = dateStrArr[0];
    String time = dateStrArr[1];
    Row row = new Row(id, name, now, count, price, date, time);
    return row;
  }
}
// class end
