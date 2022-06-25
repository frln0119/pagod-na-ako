import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class labs extends JFrame {
  public void labsInterface() {
    JLabel avail = new JLabel("Available Labs");
    avail.setBounds(0,0, 0, 0);

    JLabel hema = new JLabel("Hematology");
    hema.setBounds(0, 0, 0, 0);
    JLabel hemaPrice = new JLabel("PHP 250.00");
    hemaPrice.setBounds(0, 0, 0, 0);
    hemaPrice.setForeground(Color.green);

    JLabel cliMic = new JLabel("Clinical Microscopy");
    cliMic.setBounds(0, 0. 0. 0);
    JLabel cliMicPrice = new JLabel("PHP 150-400");
    cliMicPrice.setBounds(0, 0. 0. 0);
    cliMicPrice.setForeground(Color.green);

    JLabel microBio = new JLabel("Microbiology");
    microBio.setBounds(0, 0, 0, 0);
    JLabel microBioPrice = new JLabel("Microbiology");
    microBioPrice.setBounds(0, 0, 0, 0);
    microBioPrice.setForeground(Color.green);

    JLabel immuSero = new JLabel("Immunology/Serology");
    immuSero.setBounds(0, 0, 0, 0);
    JLabel immuSeroPrice = new JLabel("PHP 1,000.00");
    immuSeroPrice.setBounds(0, 0, 0, 0);
    immuSeroPrice.setForeground(Color.green);

    JLabel hispa = new JLabel("Histopathology");
    hispa.setBounds(0, 0, 0, 0);
    JLabel hispaPrice = new JLabel("PHP 630.00 - 2,000.00");
    hispaPrice.setBounds(0, 0, 0, 0);
    hispaPrice.setForeground(Color.green);

    JLabel uri = new JLabel("Urinalysis");
    uri.setBounds(0, 0, 0, 0);
    JLabel uriPrice = new ("PHP 300.00");
    uriPrice.setBounds(0, 0, 0, 0);
    uriPrice.setForeground(Color.green);

    JLabel plat = new JLabel("Platelet Test");
    plat.setBounds(0, 0, 0, 0);
    JLabel platPrice = new JLabel("PHP 150.00");
    platPrice.setBounds(0, 0, 0, 0);
    platPice.setForeground(Color.green);

    JLabel proTi = new JLabel("Prothrombin Time");
    proTi.setBounds(0, 0, 0, 0);
    JLabel proTiPrice = new JLabel("PHP 240.00");
    proTiPrice.setBounds(0,0, 0, 0);
    proTiPrice.setForeground(Color.green);

    JLabel cult = new JLabel("Cultures");
    cult.setBounds(0, 0, 0, 0);
    JLabel cultPrice = new JLabel("PHP 25.00 - 1,650.00");
    cultPrice.setBounds(0, 0, 0, 0);
    cultPrice.setForeground(Color.green);

    JLabel bact = new JLabel("Bacteriology");
    bact.setBounds(0, 0, 0, 0);
    JLabel bactPrice = new JLabel("PHP 200.00 - 1,500.00");
    batPrice.setBounds(0, 0, 0, 0);
    bactPrice.setForeground(Color.green);

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