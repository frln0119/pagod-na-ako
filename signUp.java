import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class signUp extends JFrame {

public void signUpInterface() {
		JTextField desiredUser = new JTextField("Username");
    desiredUser.setForeground(Color.GRAY);
    desiredUser.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (desiredUser.getText().equals("Username")) {
            desiredUser.setText("");
            desiredUser.setForeground(Color.BLACK);
			  }
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (desiredUser.getText().isEmpty()) {
            desiredUser.setForeground(Color.GRAY);
            desiredUser.setText("Username");
				}
			}
		});

    JTextField desiredPassword = new JTextField("Password");
    desiredPassword.setForeground(Color.GRAY);
    desiredPassword.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (desiredPassword.getText().equals("Password")) {
            desiredPassword.setText("");
            desiredPassword.setForeground(Color.BLACK);
			  }
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (desiredPassword.getText().isEmpty()) {
            desiredPassword.setForeground(Color.GRAY);
            desiredPassword.setText("Password");
				}
			}
		});
		
    JTextField passwordAgain = new JTextField("Confirm Password");
    passwordAgain.setForeground(Color.GRAY);
    passwordAgain.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (passwordAgain.getText().equals("Confirm Password")) {
			passwordAgain.setText("");
			passwordAgain.setForeground(Color.BLACK);
			}
			}
		@Override
				public void focusLost(FocusEvent e) {
					if (passwordAgain.getText().isEmpty()) {
			passwordAgain.setForeground(Color.GRAY);
			passwordAgain.setText("Confirm Password");
					}
				}
			});


	  JButton signUp = new JButton("Sign Up");
		// add setBounds
    signUp.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dashBoard.main(null);
			}
		});
		JButton bckToLogIn = new JButton("Back To LogIn");
	  // add setBounds
    bckToLogIn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Main.main(null);
			}
		});

		add(desiredUser);
		add(desiredPassword);
		add(passwordAgain);
		add(signUp);
		add(bckToLogIn);
		setSize(400, 800);
		setVisible(true);
		setLayout(null);
	}

	public static void main(String args[]) {
		signUp signUp = new signUp();
		signUp.signUpInterface();
	}
};