package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;

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
	}

}
