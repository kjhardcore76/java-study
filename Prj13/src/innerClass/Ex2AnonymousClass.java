package innerClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ex2AnonymousClass {
  public static void main(String[] args) {
    Frame frame = new Frame();
    frame.setLayout(new FlowLayout());
    frame.setBounds(500,300,500,300);
    frame.setVisible(true);
    Button button = new Button("Click");
    frame.add(button);
    //button.addActionListener(new EventHandler());
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("button clicked");
      }   
    });
  }
}

class EventHandler implements ActionListener{
  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("button clicked");
  }
}