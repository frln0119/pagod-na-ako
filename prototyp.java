import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class prototyp extends JFrame {
	public void intf() {
		
		JTextField nameField = new JTextField("Name");
    nameField.setBounds(0, 0, 0, 0);
		nameField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (nameField.getText().equals("Name")) {
            nameField.setText("");
            nameField.setForeground(Color.BLACK);
				}
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (nameField.getText().isEmpty()) {
            nameField.setForeground(Color.GRAY);
            nameField.setText("Name");
				}
			}
		});

		JTextField ageField = new JTextField("Age");
    ageField.setBounds(0, 0, 0, 0);
		ageField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (ageField.getText().equals("Age")) {
            ageField.setText("");
            ageField.setForeground(Color.BLACK);
				}
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (ageField.getText().isEmpty()) {
            ageField.setForeground(Color.GRAY);
            ageField.setText("Age");
				}
			}
		});

		JTextField addressField = new JTextField("Address");
    addressField.setBounds(0, 0, 0, 0);
		addressField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (addressField.getText().equals("Address")) {
            addressField.setText("");
            addressField.setForeground(Color.BLACK);
				}
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (addressField.getText().isEmpty()) {
            addressField.setForeground(Color.GRAY);
            addressField.setText("Address");
				}
			}
		});

		JTextField contactField = new JTextField("Contact");
    contactField.setBounds(0, 0, 0, 0);
		contactField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (contactField.getText().equals("Contact")) {
            contactField.setText("");
            contactField.setForeground(Color.BLACK);
				}
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (contactField.getText().isEmpty()) {
            contactField.setForeground(Color.GRAY);
            contactField.setText("Contact");
				}
			}
		});

		JTextField sexField = new JTextField("Sex");
    sexField.setBounds(0, 0, 0, 0);
		sexField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (sexField.getText().equals("Sex")) {
            sexField.setText("");
            sexField.setForeground(Color.BLACK);
				}
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (sexField.getText().isEmpty()) {
            sexField.setForeground(Color.GRAY);
            sexField.setText("Sex");
				}
			}
		});

		JTextField emailField = new JTextField("Email");
    emailField.setBounds(0, 0, 0, 0);
		emailField.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (emailField.getText().equals("Email")) {
            emailField.setText("");
            emailField.setForeground(Color.BLACK);
				}
			}
      @Override
			public void focusLost(FocusEvent e) {
				if (emailField.getText().isEmpty()) {
            emailField.setForeground(Color.GRAY);
            emailField.setText("Email");
				}
			}
		});

		JButton submit =new JButton("Submit");
		submit.setBounds(0, 0, 0, 0,);
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dashBoard.main(null);
			}
		});

		add(ageField);
		add(addressField);
		add(emailField);
		add(contactField);
		add(nameField);
		setLayout(null);
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		prototyp p = new prototyp();
		p.intf();
	}
}