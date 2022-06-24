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

		add(nameField);
		setSize(500, 500);
	}

	public static void main(String[] args) {
		prototyp p = new prototyp();
		p.intf();
	}
}