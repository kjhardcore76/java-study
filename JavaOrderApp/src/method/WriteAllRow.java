package method;

import java.io.FileWriter;
import java.util.ArrayList;

public class WriteAllRow {
  public void writeAllRow(ArrayList<Row> rows) {
    try {
      FileWriter fileClear = new FileWriter("data.txt");
      fileClear.write("");
      fileClear.flush();
      fileClear.close();
      FileWriter fileWriter = new FileWriter("data.txt", true);
      for(Row row:rows){
        String str = "";
        str += row.id + ",";
        str += row.name + ",";
        str += row.proudct + ",";
        str += row.count + ",";
        str += row.price + ",";
        str += row.date + ",";
        str += row.time + "\n";
        fileWriter.write(str);
      }//for end
      fileWriter.flush();
      fileWriter.close();
    } catch (Exception e) {
      e.printStackTrace();
    }//catach end
  }// mainFunc end
}// class end
