import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// DashBoard //
public class dashBoard extends JFrame {
	public void userDashboard() {
		JButton patient = new JButton("JButton");
		patient.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				patient.main(null);
			}
		});
		JButton labs = new JButton("Labs");
		labs.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Labs");
			}
		});
		JButton branches = new JButton("Branches");
		branches.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Branches");
			}
		});

		JButton medicine = new JButton("Medicine");
		medicine.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Medicine");
			}
		});
	JButton appointment = new JButton("Supplies");
		appointment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				appointment.main(null);
			}
		});

     JButton suppliesAndEquipment = new JButton("Supplies");
		suppliesAndEquipment.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				equipmentSupplies.main(null);
			}
		});
     JButton exit = new JButton("Close");
     exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
     add(patient);
	add(exit);
     add(suppliesAndEquipment);
     add(appointment);
	add(branches);
     add(labs);
     setSize(1000, 1000);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLayout(null);
	}

	public static void main(String args[]) {
		dashBoard dashboard = new dashBoard();
		dashboard.userDashboard();
	}
}