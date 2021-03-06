/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator Manager program
 * This class displays brief instructions for how to play manager, then sends them to the ManagerTurns class
 */

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

	private static final long serialVersionUID = 639111262609411241L;

	/**
	 * Launches the application.
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
	 * Creates the dialog.
	 */
	public Manager() {
		setResizable(false);//makes sure the text box is not resizable
		setIconImage(Toolkit.getDefaultToolkit().getImage(Manager.class.getResource("/project/restaurant logo.png")));//gets logo for the top of the window
		setTitle("Manager");//sets title of the window
		setBounds(100, 100, 450, 300);//text box dimensions
		getContentPane().setLayout(null);
		
		JTextPane txtpnSdfsd = new JTextPane();
		txtpnSdfsd.setBackground(SystemColor.control);
		txtpnSdfsd.setEditable(false);//makes the text box non-editable
		txtpnSdfsd.setFont(new Font("Tahoma", Font.PLAIN, 15));//sets the text font and size
		txtpnSdfsd.setText("You have chosen to become a manager!\r\n\r\nYou will have a starting budget of $10 000 to spend on anything you like to gain fame and customer satisfaction. Every round can select only one item to purchase, when you have your decision, press the \"next\" button. Remember that at the end of your turn, you may either gain/lose fame, satisfaction and budget.\r\n\r\nBe careful!\r\n*click the \"next\" buton to start your first turn"); //message to be displayed
		txtpnSdfsd.setBounds(0, 25, 434, 195);//sets text box dimensions
		getContentPane().add(txtpnSdfsd);
		
		JButton btnNext = new JButton("Next");//sets a name for the button
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManagerTurns newWindow = new ManagerTurns();//opens the ManagerTurns class when the button is pressed
				newWindow.setVisible(true);
				setVisible(false);//hides this window
			}
		});
		btnNext.setBounds(345, 238, 89, 23);//sets the dimensions of the button
		getContentPane().add(btnNext);

		
	}
}
