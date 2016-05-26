package project;

import java.awt.EventQueue;

import javax.swing.JDialog;

public class ManagerWinGame extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerWinGame dialog = new ManagerWinGame();
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
	public ManagerWinGame() {
		setBounds(100, 100, 450, 300);

	}

}
