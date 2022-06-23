import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class equipmentSupplies extends JFrame {
     int stretchersCount = ThreadLocalRandom.current().nextInt();
     public void equipmentSuppliesInterface() {
          JLabel title = new JLabel("Equipemt & Supplies");
          JLabel hospital = new JLAbel(" Available Hospital Stretcher" + stretchersCoun);
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