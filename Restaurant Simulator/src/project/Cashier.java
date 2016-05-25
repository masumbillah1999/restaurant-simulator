package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class Cashier extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Cashier dialog = new Cashier();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Cashier() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cashier.class.getResource("/project/restaurant logo.png")));
		setTitle("Cashier");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnYou = new JTextPane();
		txtpnYou.setText("You have chosen to become the cashier!\r\n\r\nYou ");
		txtpnYou.setBounds(10, 11, 424, 50);
		getContentPane().add(txtpnYou);
		
		String[] customers = {"Bob","Jack","Timmy","John","Steve","Jacob","Jim","Stacey","Angelina","Tyrone"};

		
		
		
	}
}
