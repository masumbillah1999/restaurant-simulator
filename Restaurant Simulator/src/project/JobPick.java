/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator JobPick program
 * This method lets the user choose whether they want to be a manager or a cashier
 */

package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JobPick extends JDialog {

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		try {
			JobPick dialog = new JobPick();//creates a new dialog
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the dialog.
	 */
	public JobPick() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JobPick.class.getResource("/project/restaurant logo.png")));//sets logo for window
		setTitle("Pick a job!");//sets window title
		setBounds(100, 100, 450, 300);//sets dimensions
		getContentPane().setLayout(null);
		
		JLabel lblNowItsTime = new JLabel("Now it's time to pick a job!");
		lblNowItsTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblNowItsTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNowItsTime.setBounds(10, 11, 414, 50);//sets dimensions
		getContentPane().add(lblNowItsTime);
		
		JButton btnCashier = new JButton("Cashier");//creates a new button
		btnCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cashier newWindow = new Cashier();//calls Cashier class when button is pushed
				newWindow.setVisible(true);
				setVisible(false);//hides window
			}
		});
		btnCashier.setBounds(10, 72, 175, 179);//sets dimensions
		getContentPane().add(btnCashier);
		
		JButton btnManager = new JButton("Manager");//creates a new button
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newWindow = new Manager();//calls Manager class when button is pushed
				newWindow.setVisible(true);
				setVisible(false);//hides window
			}
		});
		btnManager.setBounds(249, 72, 175, 179);//sets dimensions
		getContentPane().add(btnManager);
	}
}
