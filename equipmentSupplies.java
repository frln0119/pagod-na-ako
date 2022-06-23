import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class equipmentSupplies extends JFrame {
	   Font font = Font.createFont(Font.TRUETYPE_FONT, getClass().getResource("/GoogleSans-Medium.ttf").openStream());
     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
ge.registerFont(font);
     font = font.deriveFont(24f);
     Random rndm = new Random();
     int stretchersCount = rndm.nextInt(100);
	   int defibrillatorsCount = rndm.nextInt(10);
	   int ecgMachines = rndm.nextInt(15);
	   int wheelchairsCount = rndm.nextInt(30);
	   int hospitalBedsCount = rndm.nextInt(200);
	   int xrayStationsCount = rndm.nextInt(5);
	
     public void equipmentSuppliesInterface() {
          JLabel title = new JLabel("Equipment & Supplies");
			    // title middle part (horizontally align center) setbounds
          JLabel hospital = new JLabel("Available Hospital Stretcher(s): " + stretchersCount);
          // hospital variable setbounds here...
			    JLabel defibrillators = new JLabel("Available Hospital Defibrillator(s) : " + defibrillatorsCount);
			    // defibrillators variable setbounds here
			    JLabel ecgMach = new JLabel("Available Hospital ECGMachine(s) : " + ecgMachines);
			    // ecgMach variable setbounds here
          JLabel wheelchairs = new JLabel("Available Hospital Wheelchair(s) : " + wheelchairsCount);
			    // wheelchairs variable setbounds here
          JLabel beds = new JLabel("Available Hospital Bed(s) : " + hospitalBedsCount);
			    // beds variable setbounds here
          JLabel xray = new JLabel("Available Hospital Xray(s) : " + xrayStationsCount);
          // xray variable setbounds here
			    JButton close = new JButton("Close");
          // close variable setbounds here

			    close.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {
							dispose();
						}
					});
          add(xray);
          add(beds);
			    add(wheelchairs);
			    add(ecgMach);
			    add(defibrillators);
          add(title);
			    add(close);
			    add(hospital);
          setSize(800, 800);
          setLayout(null);
          setVisible(true);
		      setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
     }

     public static void main(String[] args) {
          equipmentSupplies equipment = new equipmentSupplies();
          equipment.equipmentSuppliesInterface();
     }
}