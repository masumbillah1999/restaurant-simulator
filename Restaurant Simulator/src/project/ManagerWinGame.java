/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator ManagerTurns program
 * This class displays end win message and finishes the program
 */

package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;

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
		setBounds(100, 100, 450, 300);//sets the size of the window
		getContentPane().setLayout(null);
		
		JLabel lblYouWin = new JLabel("You Win!!!!!!!!!!!!!!!!!!");//win message text
		lblYouWin.setFont(new Font("Tahoma", Font.PLAIN, 30));//text font
		lblYouWin.setBounds(86, 89, 308, 56);//label font
		getContentPane().add(lblYouWin);//adds text to the label

	}
}
//