import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class medicine extends JFrame {

  public void medicineInterface() {
    JLabel medicineList = new JLabel("Available Drugs and Medicine");
	  //set bounds medicineList
		JLabel notice = new JLabel("Notice: Please refer to our pharmacist for the prices for non-OTC medicine please give us the doctors prescription to prevent medicine misuse.");
		//set bounds for notice below the Available Medicine
		JLabel noticeObgyn = new JLabel("Notice: Please refer to your obyn before buying contraception.");
		//set bounds for noticeObgyn below the the first notice
    notice.setForeground(Color.red);
    JLabel paracetamol = new JLabel("Paracetamol 500mg/Syrup/Suspension");
		//set bounds for paracetamol 
		JLabel antihistamine = new JLabel("Antihistamines 10/25mg");
		// set bounds for antihistamines
		JLabel antacids = new JLabel("Antacids 40/250mg 10ml drops");
		// set bounds for antacids
    JLabel hydrocortisoneCream = new JLabel("Hydrocortisone Cream 5/10/15g");
		// set bounds for hydrocortisoneCream
		JLabel antisepticCream = new JLabel("Antiseptic Cream 50/100g");
		//setBounds for antisepticCream
		JLabel antisepticSolution = new JLabel("Anti-Septic Solution 25/50ml");
		//set bounds for antisepticSolution
    JLabel painKiller = new JLabel("Painkiller 60/120ml");
		//set bounds for painKiller
		JLabel bandages = new JLabel("Bandages 4x6/4x10/3x5");
		// set bounds bandages
    JLabel loperamide = new JLabel("Loperamide 2mg only");
    //set bounds for loperamide
    JLabel centrum = new JLabel("Centrum Silver Advance 30 Tablets");
		// set bounds for centrum
		JLabel loratadine = new JLabel("Loratadine 10mg");
		// set bounds loratadine
    JLabel folicAcid = new JLabel("Folic Acid 300mg");
		//set bounds for folic acid
		JLabel eyedrops = new JLabel("EyeDrops 10m");
		//set bounds for eyedrops
		JLabel hexylresorcinol = new JLabel("Hexylresorcinol 2.4 mg");
		//set bounds for hexylresorcinol
		JButton ok = new JButton("OK");
    // set bounds for ok variable this button is to close the window by pressing ok
    ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		add(noticeObgyn);
		add(paracetamol);
		add(antihistamine);
		add(antacids);
		add(hydrocortisoneCream);
		add(antisepticCream);
		add(antisepticSolution);
		add(painKiller);
		add(bandages);
		add(loperamide);
		add(centrum);
		add(loratadine);
		add(folicAcid);
		add(eyedrops);
		add(hexylresorcinol);
		add(ok);
		setSize(700, 700);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		medicine medicine = new medicine();
		medicine.medicineInterface();
	}
}