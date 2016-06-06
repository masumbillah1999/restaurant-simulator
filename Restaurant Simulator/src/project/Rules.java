/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator Rules program
 * This class displays the game rules
 */

package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;

import java.awt.Color;
import java.awt.Dialog;

import javax.swing.UIManager;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SwingConstants;

import java.awt.Label;
import java.awt.Font;
import java.awt.Toolkit;

public class Rules extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		try {
			Rules dialog = new Rules();//creates a new dialog
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the dialog.
	 */
	public Rules() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Rules.class.getResource("/project/restaurant logo.png")));//displays restaurant logo
		setResizable(false);//makes it non-resizable
		setTitle("Rules");//sets title of dialog to "Rules"
		setBounds(100, 100, 450, 300);//sets dimensions
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 260, 434, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("OK");//creates the "OK button"
			okButton.setBounds(377, 227, 47, 23);//sets dimensions
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);//hides window when button is pushed
				}
			});
			btnOk.setBounds(345, 238, 89, 23);//sets dimensions
			getContentPane().add(btnOk);
		}
		
		JTextPane txtpnSdfhdzfbSzdFdfg = new JTextPane();
		txtpnSdfhdzfbSzdFdfg.setFont(new Font("Tahoma", Font.PLAIN, 11));//sets text size and fonts
		txtpnSdfhdzfbSzdFdfg.setEditable(false);//makes it non-editable
		txtpnSdfhdzfbSzdFdfg.setBackground(SystemColor.control);
		txtpnSdfhdzfbSzdFdfg.setText("If you are a cashier:\r\n\r\nYour goal is to enter the totals from a customer's receipt into your cash register as fast as possible so as to be able to raise your customer satisfaction score to 100 (you start at 50). If your score falls to 0, then you lose, if it goes to 100, you win! Once you have completed a receipt you will receive a tip based upon that customer's rating of you. You can use these tips to purchase powerups that will give you a little extra time.\r\n\r\nIf you are a manager:\r\n\r\nYour goal is to get your customer satisfaction and restaurant fame levels from 50 (the starting point) to 100. If these levels drop to 0, then you lose. You will start with a budget of $10 000 and you will be able to invest this money in different objects, all of which will have different effects. At the end of every turn you may lose or earn money, so be careful with your investments!");//rules are displayed
		txtpnSdfhdzfbSzdFdfg.setBounds(10, 11, 414, 250);//sets dimensions
		getContentPane().add(txtpnSdfhdzfbSzdFdfg);
	}
}
