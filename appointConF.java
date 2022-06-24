import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class appointConF extends JFrame {

  public void appointConfDialog() {
		JLabel confirmation = new JLabel("Your Appointment Has Been Processed!");
		// set Bounds here....
		
		JButton ok = new JButton("Ok, close this window");
		// set Bounds here....
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		setSize(100, 200);
		setLayout(null);
		setVisible(true);
		add(confirmation);
		add(ok);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		appointConF appointConF = new appointConF();
		appointConF.appointConfDialog();
	}
}