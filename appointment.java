import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class appointment extends JFrame {

	public void setAppointment() {
		JTextField hour = new JTextField("Hour");
		hour.setForeground(Color.GRAY);
     hour.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (hour.getText().equals("Hour")) {
				hour.setText("");
          	hour.setForeground(Color.BLACK);
	          }
			}
		@Override
				public void focusLost(FocusEvent e) {
					if (hour.getText().isEmpty()) {
			hour.setForeground(Color.GRAY);
			hour.setText("Hour");
					}
				}
			});
		// setbounds here for hour...
		JTextField minutes = new JTextField("Minutes");
		minutes.setForeground(Color.GRAY);
		minutes.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (minutes.getText().equals("Minutes")) {
				minutes.setText("");
				minutes.setForeground(Color.BLACK);
				}
			}
			@Override
					public void focusLost(FocusEvent e) {
						if (minutes.getText().isEmpty()) {
				minutes.setForeground(Color.GRAY);
				minutes.setText("Hour");
						}
					}
				});
				// setbounds here for minutes...
		JTextField pmOrAm = new JTextField("PM/AM");
		pmOrAm.setForeground(Color.GRAY);
		pmOrAm.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (pmOrAm.getText().equals("PM/AM")) {
			pmOrAm.setText("");
			pmOrAm.setForeground(Color.BLACK);
				}
			}
			@Override
					public void focusLost(FocusEvent e) {
						if (pmOrAm.getText().isEmpty()) {
				pmOrAm.setForeground(Color.GRAY);
				pmOrAm.setText("PM/AM");
						}
					}
				});

		// setbounds here for pm or am...
		JTextField date = new JTextField("MM/DD/YYYY");
		date.setForeground(Color.GRAY);
		date.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (date.getText().equals("MM/DD/YYYY")) {
               date.setText("");
          	date.setForeground(Color.BLACK);
				}
			}
			@Override
					public void focusLost(FocusEvent e) {
						if (date.getText().isEmpty()) {
				date.setForeground(Color.GRAY);
				date.setText("MM/DD/YYYY");
						}
					}
				});
		// setbounds here for date...
		JButton submit = new JButton("Submit");
		// setbounds here for submit...
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appointConF.main(null);
			}
		});
		JButton cancel = new JButton("Cancel, go back");
		// setbounds here for cancel...
		cancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		add(submit);
		add(date);
		add(hour);
		add(minutes);
		add(pmOrAm);
		add(cancel);
		setSize(800, 800);
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		appointment appoint = new appointment();
		appoint.setAppointment();
	}
}