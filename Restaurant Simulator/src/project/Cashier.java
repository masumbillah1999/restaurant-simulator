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
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		txtpnYou.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnYou.setBackground(SystemColor.control);
		txtpnYou.setEditable(false);
		txtpnYou.setText("You have chosen to become the cashier!\r\n\r\nYou will have to enter the customer's totals into the cash register as fast as possible. The quicker you are, the higher the score you will receive.  Your customer satisfaction starts off at 50, and if it drops you 0 you lose. If it goes up to 100, you win the game! After each turn, you will receive a tip based on the customer's rating, and you may use that money to buy powerups to increase time. \r\n\r\nClick the next button to start your turn!\r\n");
		txtpnYou.setBounds(10, 11, 424, 221);
		getContentPane().add(txtpnYou);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CashierTurns newWindow = new CashierTurns();
				newWindow.setVisible(true);
				setVisible(false);
			}
		});
		btnNext.setBounds(345, 238, 89, 23);
		getContentPane().add(btnNext);
			
		
		
	}
}
