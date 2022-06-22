import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.GraphicsEnvironment.*;

public class Main extends JFrame {
	public void logInFrame() {

    Font googleFont = Font.createFont(Font.TRUETYPE_FONT, new File("GoogleSans-Medium.ttf"));

    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
ge.registerFont(googleFont);

Font googleSans = new Font("Google-Sans", Font.PLAIN, 20);
		
    JTextField userField = new JTextField();
		JTextField pwField = new JTextField();
    JButton logInBTN = new JButton("Login");
		logInBTN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dashBoard.main(null);
			}
		});
		JButton registerBTN = new JButton("Sign Up");
		registerBTN.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				signUp.main(null); //added//
			}
		});
    JButton clear = new JButton("Clear");
		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				userField.setText("");
			}
		});
		setLayout(null);
    add(userField);
    add(pwField);
	  add(registerBTN);
	  add(logInBTN);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
  public static void main(String[] args) {
    Main Main = new Main();

		Main.logInFrame();
  }
}