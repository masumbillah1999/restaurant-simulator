package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;

import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JTextPane;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ManagerTurns extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static ButtonGroup managerGroup = new ButtonGroup(); // button group

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
	
	public static int budget = 10000, satisfaction = 50, fame = 50;
	public static String event;
	
	public ManagerTurns() {

		
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(ManagerTurns.class.getResource("/project/restaurant logo.png")));
		setTitle("Manager Game");
		setBounds(100, 100, 449, 413);
		getContentPane().setLayout(null);

		String[] storeItems = new String[] { "Potted Plants", "Higher quality food", "Provide free meals to kids", "Hold a charity fundraiser", "Sponser local sports team", "Employee in a mascot costume", "Newspaper article", "Fancy table cloths", "Create a website", "Forge Yelp reviews" };
		
		
		JTextPane txtpnYourCurrentBudget = new JTextPane();
		txtpnYourCurrentBudget.setEditable(false);
		txtpnYourCurrentBudget.setText("Your current budget: " + budget + "$");
		txtpnYourCurrentBudget.setBounds(10, 11, 175, 20);
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
		txtpnWelcomeToThe.setEditable(false);
		txtpnWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnWelcomeToThe.setText("Welcome to the manager store, check all the things you wish to purchase, then press next.");
		txtpnWelcomeToThe.setBounds(10, 42, 414, 38);
		getContentPane().add(txtpnWelcomeToThe);

		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				switch (randnum())
				{
				case 0:
					event = "Restaurant gets sued! Lose $2000 from your budget";
					budget -= 2000;
					fame += 10;
					satisfaction -=20;
					break;
				case 1:
					event = "Locals love your restaurant!";
					budget += 500;
					fame -= 5;
					satisfaction +=10;
					break;
				case 2:
					event = "A couple cases of cold food have been reported! Pay $500 in compensation.";
					budget -= 500;
					fame -= 10;
					satisfaction -=10;
					break;
				case 3:
					event = "A new item on the menu was a success!";
					budget += 1000;
					fame += 10;
					satisfaction +=10;
					break;
				case 4:
					event = "Your restaurant gets 'meh' reviews, nothing happens";
					break;
				case 5:
					event = "Restaurant becomes haunted, call the Ghostbusters";
					budget -= 5000;
					fame += 23;
					break;
				case 6:
					event = "";
					budget -= 2000;
					fame += 10;
					satisfaction -=20;
					break;
				case 7:
					
					break;
				case 8:
					
					break;
				case 9:
					
					break;
				}
			}
		});
		btnNext.setBounds(334, 340, 89, 23);
		getContentPane().add(btnNext);

		JRadioButton radioButton = new JRadioButton(storeItems[0]);
		radioButton.setBounds(20, 87, 186, 23);
		getContentPane().add(radioButton);

		JRadioButton radioButton_1 = new JRadioButton(storeItems[1]);
		radioButton_1.setBounds(20, 116, 186, 23);
		getContentPane().add(radioButton_1);

		JRadioButton radioButton_2 = new JRadioButton(storeItems[2]);
		radioButton_2.setBounds(20, 144, 186, 23);
		getContentPane().add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton(storeItems[3]);
		radioButton_3.setBounds(20, 170, 186, 23);
		getContentPane().add(radioButton_3);

		JRadioButton radioButton_4 = new JRadioButton(storeItems[4]);
		radioButton_4.setBounds(20, 196, 186, 23);
		getContentPane().add(radioButton_4);

		JRadioButton radioButton_5 = new JRadioButton(storeItems[5]);
		radioButton_5.setBounds(207, 87, 217, 23);
		getContentPane().add(radioButton_5);

		JRadioButton radioButton_6 = new JRadioButton(storeItems[6]);
		radioButton_6.setBounds(207, 116, 217, 23);
		getContentPane().add(radioButton_6);

		JRadioButton radioButton_7 = new JRadioButton(storeItems[7]);
		radioButton_7.setBounds(207, 144, 217, 23);
		getContentPane().add(radioButton_7);

		JRadioButton radioButton_8 = new JRadioButton(storeItems[8]);
		radioButton_8.setBounds(207, 170, 217, 23);
		getContentPane().add(radioButton_8);

		JRadioButton radioButton_9 = new JRadioButton(storeItems[9]);
		radioButton_9.setBounds(207, 196, 217, 23);
		getContentPane().add(radioButton_9);

		managerGroup.add(radioButton);
		managerGroup.add(radioButton_1);
		managerGroup.add(radioButton_2);
		managerGroup.add(radioButton_3);
		managerGroup.add(radioButton_4);
		managerGroup.add(radioButton_5);
		managerGroup.add(radioButton_6);
		managerGroup.add(radioButton_7);
		managerGroup.add(radioButton_8);
		managerGroup.add(radioButton_9);
		
		JTextPane txtpnEvent = new JTextPane();
		txtpnEvent.setText("Event: " + event);
		txtpnEvent.setBounds(10, 226, 413, 102);
		getContentPane().add(txtpnEvent);

	}
	
	public static int randnum ()
	{
		Random rand = new Random();
		int randomNum = rand.nextInt((9 - 0) + 1) + 0;
		return randomNum;
		
	}
}
