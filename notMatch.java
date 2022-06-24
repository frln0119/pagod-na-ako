import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
// error screen when password doesn't match
public class notMatch extends JFrame {
	public void notMatchScreen() {
		JLabel errorScreen = new JLabel("The Password Doesn't Match Please, Try Again.");
	  errorScreen.setBounds(0, 0, 0, 0);
		errorScreen.setForeground(Color.red);
		add(errorScreen);
		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
    ok.setBounds(0, 0, 0, 0);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
    setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		notMatch notMatch = new notMatch();
		notMatch.notMatchScreen();
	}
}