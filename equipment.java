import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class equipment extends JFrame {

     public void equipmentInterface() {
          JLabel title = new JLabel("Equipemt");

          add(title);
          setSize(800, 800);
          setLayout(null);
          setVisible(true);
          setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

     public static void main(String[] args) {
          equipment equipment = new equipment();
          equipment.equipmentInterface();
     }
}