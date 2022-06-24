import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class branches extends JFrame {
	
  public void branchesInterface() {
    JLabel title = new JLabel("Available Branches");
    title.setBounds(0, 0, 0, 0);
    JLabel fistLocation = new JLabel("CALOOCAN CITY BRANCH");
    firstLocation.setBounds(0, 0, 0, 0);
    add(title);
    add(firstLocation);
    setVisible(true);
    setSize(800, 800);
  }

  public static void main(String[] args) {
    branches bc = new branches();
    bc.branchesInterface();
  }
}