package project;

import java.awt.EventQueue;

import javax.swing.JDialog;

import java.awt.Toolkit;

import javax.swing.JTextPane;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

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
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Manager.class.getResource("/project/restaurant logo.png")));
		setTitle("Manager");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JTextPane txtpnSdfsd = new JTextPane();
		txtpnSdfsd.setBackground(SystemColor.control);
		txtpnSdfsd.setEditable(false);
		txtpnSdfsd.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtpnSdfsd.setText("You have chosen to become a manager!\r\n\r\nYou will have a starting budget of $10 000 to spend on anything you like to gain fame and customer satisfaction. Remember that at the end of your turn, you may either gain/lose fame, satisfaction and budget.\r\n\r\nBe careful!\r\n*click the \"next\" buton to start your first turn");
		txtpnSdfsd.setBounds(0, 25, 434, 195);
		getContentPane().add(txtpnSdfsd);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagerTurns newWindow = new ManagerTurns();
				newWindow.setVisible(true);
			}
		});
		btnNext.setBounds(345, 238, 89, 23);
		getContentPane().add(btnNext);

		
	}
}
