package method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

public class ReadAllRow {
  //문서를 줄 단위로 읽은 뒤 배열로 반환하는 함수 (문서id생성 및 주문정보 출력시 호출)
  public ArrayList readAllRow() {
    ArrayList<Row> rows = new ArrayList<>();
    try {
      FileReader fileReader = new FileReader("data.txt");
      BufferedReader bufferedReader = new BufferedReader(fileReader);
      while (true) {
        String line = bufferedReader.readLine();
        if (line == null) break;
        String[] arr = line.split(",");
        int id = Integer.parseInt(arr[0]);
        String name = arr[1];
        String proudct = arr[2];
        int count = Integer.parseInt(arr[3]);
        int price = Integer.parseInt(arr[4]);
        String date = arr[5];
        String time = arr[6];
        Row row = new Row(id, name, proudct, count, price, date, time);
        rows.add(row);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return rows;
  }
}

