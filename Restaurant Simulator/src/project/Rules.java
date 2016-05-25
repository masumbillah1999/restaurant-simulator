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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rules dialog = new Rules();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rules() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Rules.class.getResource("/project/restaurant logo.png")));
		setResizable(false);
		setTitle("Rules");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 260, 434, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(377, 227, 47, 23);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnOk.setBounds(345, 238, 89, 23);
			getContentPane().add(btnOk);
		}
		
		JTextPane txtpnSdfhdzfbSzdFdfg = new JTextPane();
		txtpnSdfhdzfbSzdFdfg.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnSdfhdzfbSzdFdfg.setEditable(false);
		txtpnSdfhdzfbSzdFdfg.setBackground(SystemColor.control);
		txtpnSdfhdzfbSzdFdfg.setText("If you are a cashier:\r\n\r\nYour goal is to enter the totals from a customer's receipt into your cash register as fast as possible so as to be able to raise your customer satisfaction score to 10 (you start at 5). If your score falls to 0, then you lose, if it goes to 10, you win! Once you have completed a receipt you will receive a tip based upon that customer's rating of you. You can use these tips to purchase powerups that will give you a little extra time.\r\n\r\nIf you are a manager:\r\n\r\nYour goal is to get your customer satisfaction and restaurant fame levels from 5 (the starting point) to 10. If these levels drop to 0, then you lose. You will start with a budget of $10 000 and you will be able to invest this money in different objects, all of which will have different effects. At the end of every turn you may lose or earn money, so be careful with your investments!");
		txtpnSdfhdzfbSzdFdfg.setBounds(10, 11, 414, 250);
		getContentPane().add(txtpnSdfhdzfbSzdFdfg);
	}
}
