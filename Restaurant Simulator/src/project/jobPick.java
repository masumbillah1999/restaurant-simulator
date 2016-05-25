package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jobPick extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			jobPick dialog = new jobPick();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public jobPick() {
		setTitle("Pick a job!");
		setResizable(false);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		{
			JLabel lblWelcomeToThe = new JLabel("Welcome to the place where jobs are picked!");
			lblWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblWelcomeToThe.setHorizontalAlignment(SwingConstants.CENTER);
			lblWelcomeToThe.setBounds(10, 11, 414, 50);
			getContentPane().add(lblWelcomeToThe);
		}
		
		JLabel lblPleaseSelectA = new JLabel("Please select a position:");
		lblPleaseSelectA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPleaseSelectA.setBounds(20, 72, 207, 30);
		getContentPane().add(lblPleaseSelectA);
		
		JButton btnCashier = new JButton("Cashier");
		btnCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cashier newWindow = new Cashier();
				newWindow.setVisible(true);
			}
		});
		btnCashier.setBounds(10, 150, 200, 100);
		getContentPane().add(btnCashier);
		
		JButton btnManager = new JButton("Manager");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newWindow = new Manager();
				newWindow.setVisible(true);
			}
		});
		btnManager.setBounds(224, 150, 200, 100);
		getContentPane().add(btnManager);
	}

}
