import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class labs extends JFrame {
  public void labsInterface() {
    JLabel avail = new JLabel("Available Labs");
    avail.setBounds(0,0, 0, 0);

    JLabel hema = new JLabel("Hematology");
    hema.setBounds(0, 0, 0, 0);
    JLabel cm = new JLabel("Clinical Microscopy");
    cm.setBounds(0, 0. 0. 0);
    JLabel mb = new JLabel("Microbiology");
    mb.setBounds(0, 0, 0, 0);

    add(mb);
    add(cm);
    add(hema);
    add(avail);
    
    setLayout(null);
    setSize(500, 500);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    labs l = new labs();
    l.labsInterface();
  }
}