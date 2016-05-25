package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ManagerTurns extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerTurns dialog = new ManagerTurns();
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
	public ManagerTurns() {
		setTitle("Manager Turn Window");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		int budget = 10000, satisfaction = 50, fame = 50;
		String [] storeItems = new String [] {"Potted Plants",  "Higher quality food",  "Provide free meals to kids", "Hold a charity fundraiser", "Sponser local sports team", "Employee in a mascot costume", "Newspaper article", "Fancy table cloths", "Create a website", "Forge Yelp reviews"};
		
		JTextPane txtpnYourCurrentBudget = new JTextPane();
		txtpnYourCurrentBudget.setEditable(false);
		txtpnYourCurrentBudget.setText("Your current budget: " + budget + "$");
		txtpnYourCurrentBudget.setBounds(10, 11, 158, 20);
		getContentPane().add(txtpnYourCurrentBudget);
		
		JTextPane txtpnSatisfaction = new JTextPane();
		txtpnSatisfaction.setEditable(false);
		txtpnSatisfaction.setText("Satisfaction: " + satisfaction);
		txtpnSatisfaction.setBounds(195, 11, 93, 20);
		getContentPane().add(txtpnSatisfaction);
		
		JTextPane txtpnFame = new JTextPane();
		txtpnFame.setEditable(false);
		txtpnFame.setText("Fame:" + fame);
		txtpnFame.setBounds(315, 11, 93, 20);
		getContentPane().add(txtpnFame);
		
		JTextPane txtpnWelcomeToThe = new JTextPane();
		txtpnWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnWelcomeToThe.setText("Welcome to the manager store, check all the things you wish to purchase, then press next.");
		txtpnWelcomeToThe.setBounds(10, 50, 414, 38);
		getContentPane().add(txtpnWelcomeToThe);
		
		JCheckBox checkBox = new JCheckBox(storeItems[0]);
		checkBox.setBounds(10, 95, 97, 23);
		getContentPane().add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox(storeItems[1]);
		checkBox_1.setBounds(10, 121, 205, 23);
		getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox(storeItems[2]);
		checkBox_2.setBounds(10, 147, 205, 23);
		getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox(storeItems[3]);
		checkBox_3.setBounds(10, 173, 205, 23);
		getContentPane().add(checkBox_3);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox(storeItems[4]);
		chckbxNewCheckBox.setBounds(10, 199, 205, 23);
		getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox checkBox_4 = new JCheckBox(storeItems[5]);
		checkBox_4.setBounds(217, 95, 207, 23);
		getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox(storeItems[6]);
		checkBox_5.setBounds(217, 121, 207, 23);
		getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox(storeItems[7]);
		checkBox_6.setBounds(217, 147, 207, 23);
		getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox(storeItems[8]);
		checkBox_7.setBounds(217, 173, 207, 23);
		getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox(storeItems[9]);
		checkBox_8.setBounds(217, 199, 207, 23);
		getContentPane().add(checkBox_8);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(335, 228, 89, 23);
		getContentPane().add(btnNext);

	}
}
