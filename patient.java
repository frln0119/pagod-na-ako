import java.awt.Event.*;
import java.awt.*;
import javax.swing.*;

public class patient extends JFrame {

	public void patientInterface() {
		JLabel title = new JLabel("Patient");
		// set bounds empty
		JLabel name = new JLabel("Hello" + title);
		
		add(title);
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		patient patient = new patient();
		patient.patientInterface();
	}
}