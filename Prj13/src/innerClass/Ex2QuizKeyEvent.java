package innerClass;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex2QuizKeyEvent {
  public static void main(String[] args) {
    Frame frame = new Frame();
    frame.setLayout(new FlowLayout());
    frame.setBounds(500,300,500,300);
    frame.setVisible(true);

    //frame.addKeyListener(new KeyEventHandler());
    frame.addKeyListener(new KeyListener() {
      @Override
      public void keyPressed(KeyEvent e) {
        System.out.println("key pressed");
      }
    
      @Override
      public void keyReleased(KeyEvent e) { 
      }
    
      @Override
      public void keyTyped(KeyEvent e) {
      }
    });
  }
}

class KeyEventHandler implements KeyListener{

  @Override
  public void keyPressed(KeyEvent e) {
    System.out.println("key pressed");
  }

  @Override
  public void keyReleased(KeyEvent e) { 
  }

  @Override
  public void keyTyped(KeyEvent e) {
  }
  
}