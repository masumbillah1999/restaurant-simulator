package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class Manager extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager dialog = new Manager();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Manager() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Manager.class.getResource("/project/restaurant logo.png")));
		setTitle("Manager");
		setBounds(100, 100, 450, 300);

	}

}
