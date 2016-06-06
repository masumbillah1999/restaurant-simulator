/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator ManagerLoseGame program
 * This class displays end message lose and finishes the program
 */

package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;

public class LoseGame extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoseGame dialog = new LoseGame();
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
	public LoseGame() {
		setBounds(100, 100, 450, 300);//sets text size
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You Lose!!!!!!!!!!");//losing display text
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 30));//the world's most hated font ;)
		lblNewLabel.setBounds(99, 95, 239, 66);//sets text box dimensions
		getContentPane().add(lblNewLabel);

	}
}
//