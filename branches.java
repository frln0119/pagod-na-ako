import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class branches extends JFrame {
	
  public void branchesInterface() {
    JLabel title = new JLabel("Available Branches");
    title.setBounds(0, 0, 0, 0);
    JLabel firstLocation = new JLabel("CALOOCAN CITY BRANCH");
    firstLocation.setBounds(0, 0, 0, 0);

    JLabel secondtLocation = new JLabel("QUEZON CITY BRANCH");
    secondLocation.setBounds(0, 0, 0, 0);
    
    JLabel thirdLocation = new JLabel("MAKATI CITY BRANCH");
    thirdLocation.setBounds(0, 0, 0, 0);
    
    JLabel fourthtLocation = new JLabel("PASIG CITY BRANCH");
    fourthLocation.setBounds(0, 0, 0, 0);
    
    JLabel fifthLocation = new JLabel("MANILA BRANCH");
    fifthLocation.setBounds(0, 0, 0, 0);
    
    JLabel sixthLocation = new JLabel("TAGUIG CITY BRANCH");
    sixthLocation.setBounds(0, 0, 0, 0);
    
    add(title);
    add(firstLocation);
    add(secondLocation);
    addd(thirdLocation);
    add(fifthLocation);
    add(sixthLocation);
    setVisible(true);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    setSize(800, 800);
  }

  public static void main(String[] args) {
    branches bc = new branches();
    bc.branchesInterface();
  }
}