package innerClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex2QuizFocusEvent {
  public static void main(String[] args) {
    Frame frame = new Frame();
    frame.setLayout(new FlowLayout());
    frame.setBounds(500,300,500,300);

    TextArea textArea = new TextArea("입력상자", 10, 50);
    frame.add(textArea);

    //textArea.addFocusListener(null);
    frame.setVisible(true);
    textArea.addFocusListener(new addFocusHandler());
  }
}

class addFocusHandler implements FocusListener{
  @Override
  public void focusGained(FocusEvent e) {
    System.out.println("get focusing");
  }

  @Override
  public void focusLost(FocusEvent e) {
    System.out.println("loose focusing");
  }
}