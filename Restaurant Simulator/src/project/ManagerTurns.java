/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator ManagerTurns program
 * This method runs the managers turns, including all calculations and opening/closing windows
 */

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

	private static final long serialVersionUID = 1L;
	private static ButtonGroup managerGroup = new ButtonGroup(); // button group is declared

	/**
	 * Launches the application.
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
	 * Creates the dialog.
	 */
	
	public static int budget = 10000, satisfaction = 50, fame = 50;//budget, satisfaction and fame are declared as global variables for use throughout the code
	public static String event;//event variable is declared
	
	/**
	 * The constructor method for the class
	 */
	public ManagerTurns() {
		setResizable(false);

		
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(ManagerTurns.class.getResource("/project/restaurant logo.png")));//sets icon for the window
		setTitle("Manager Game");//sets the title for the window
		setBounds(100, 100, 503, 413);//The size of the game window
		getContentPane().setLayout(null);

		String[] storeItems = new String[] { "Potted Plants", "Higher quality food", "Provide free meals to kids", "Hold a charity fundraiser", "Sponser local sports team", "Employee in a mascot costume", "Newspaper article", "Fancy table cloths", "Create a website", "Forge Yelp reviews" };//the names for all of the items that can be bought at the store
		
		
		JTextPane txtpnYourCurrentBudget = new JTextPane();
		txtpnYourCurrentBudget.setEditable(false);//makes the text box un-editable
		txtpnYourCurrentBudget.setText("Your current budget: " + budget + "$");//displays budget
		txtpnYourCurrentBudget.setBounds(10, 11, 175, 20);//size of the text box
		getContentPane().add(txtpnYourCurrentBudget);//adds text to the text box

		JTextPane txtpnSatisfaction = new JTextPane();
		txtpnSatisfaction.setEditable(false);//makes the text box un-editable
		txtpnSatisfaction.setText("Satisfaction: " + satisfaction);//displays satisfaction
		txtpnSatisfaction.setBounds(195, 11, 93, 20);//size of the text box
		getContentPane().add(txtpnSatisfaction);//adds text to the text box

		JTextPane txtpnFame = new JTextPane();
		txtpnFame.setEditable(false);//makes the text box un-editable
		txtpnFame.setText("Fame:" + fame);//displays fame
		txtpnFame.setBounds(315, 11, 93, 20);//size of the text box
		getContentPane().add(txtpnFame);//adds text to the text box

		JTextPane txtpnWelcomeToThe = new JTextPane();
		txtpnWelcomeToThe.setEditable(false);//makes the text box un-editable
		txtpnWelcomeToThe.setFont(new Font("Tahoma", Font.PLAIN, 13));//stes font for the text box
		txtpnWelcomeToThe.setText("Welcome to the manager store, check all the things you wish to purchase, then press next.");//displays intro/instructions
		txtpnWelcomeToThe.setBounds(10, 42, 414, 38);//size of the text box
		getContentPane().add(txtpnWelcomeToThe);//adds text to the text box

		
	
		//radio buttons are declared and sized
		JRadioButton rdbtnPottedPlants = new JRadioButton("Potted Plants (500$)");
		rdbtnPottedPlants.setBounds(6, 87, 231, 23);
		getContentPane().add(rdbtnPottedPlants);

		JRadioButton rdbtnHigherQualityFood = new JRadioButton("Higher quality food (600$)");
		rdbtnHigherQualityFood.setBounds(6, 116, 231, 23);
		getContentPane().add(rdbtnHigherQualityFood);

		JRadioButton rdbtnProvideFreeMeals = new JRadioButton("Provide free meals to kids (1000$)");
		rdbtnProvideFreeMeals.setBounds(6, 144, 231, 23);
		getContentPane().add(rdbtnProvideFreeMeals);

		JRadioButton rdbtnHoldACharity = new JRadioButton("Hold a charity fundraiser (1500$)");
		rdbtnHoldACharity.setBounds(6, 170, 231, 23);
		getContentPane().add(rdbtnHoldACharity);

		JRadioButton rdbtnSponserLocalSports = new JRadioButton("Sponser local sports team (2000$)");
		rdbtnSponserLocalSports.setBounds(6, 196, 231, 23);
		getContentPane().add(rdbtnSponserLocalSports);

		JRadioButton rdbtnEmployeeInA = new JRadioButton("Employee in a mascot costume (500$)");
		rdbtnEmployeeInA.setBounds(239, 87, 248, 23);
		getContentPane().add(rdbtnEmployeeInA);

		JRadioButton rdbtnNewspaperArticle = new JRadioButton("Newspaper article (600$)");
		rdbtnNewspaperArticle.setBounds(239, 116, 248, 23);
		getContentPane().add(rdbtnNewspaperArticle);

		JRadioButton rdbtnFancyTableCloths = new JRadioButton("Fancy table cloths (1000$)");
		rdbtnFancyTableCloths.setBounds(239, 144, 248, 23);
		getContentPane().add(rdbtnFancyTableCloths);

		JRadioButton rdbtnCreateAWebsite = new JRadioButton("Create a website (1500$)");
		rdbtnCreateAWebsite.setBounds(239, 170, 248, 23);
		getContentPane().add(rdbtnCreateAWebsite);

		JRadioButton rdbtnForgeYelpReviews = new JRadioButton("Forge Yelp reviews (2000$)");
		rdbtnForgeYelpReviews.setBounds(239, 196, 248, 23);
		getContentPane().add(rdbtnForgeYelpReviews);

		//radio buttons are all added to a group so that only one can be selected at a time
		managerGroup.add(rdbtnPottedPlants);
		managerGroup.add(rdbtnHigherQualityFood);
		managerGroup.add(rdbtnProvideFreeMeals);
		managerGroup.add(rdbtnHoldACharity);
		managerGroup.add(rdbtnSponserLocalSports);
		managerGroup.add(rdbtnEmployeeInA);
		managerGroup.add(rdbtnNewspaperArticle);
		managerGroup.add(rdbtnFancyTableCloths);
		managerGroup.add(rdbtnCreateAWebsite);
		managerGroup.add(rdbtnForgeYelpReviews);
		
		
		
		JTextPane txtpnEvent = new JTextPane();
		txtpnEvent.setText("Event: " + event);//sets the text to be displayed
		txtpnEvent.setBounds(10, 226, 477, 102);//sets the size of the text box
		getContentPane().add(txtpnEvent);//adds text to the text box

		JButton btnNext = new JButton("Next");//display text for the "next" button
		btnNext.setBounds(398, 340, 89, 23);//size of the button
		getContentPane().add(btnNext);//adds text to the button
		
		btnNext.addActionListener(new ActionListener() {
			/**
			 * method runs when the next button is pushed and randomly displays and activates an event
			 */
			public void actionPerformed(ActionEvent arg0) {
				
				//If else statements check which radio button ended up being selected and implements its effects on the score
				if (rdbtnPottedPlants.isSelected())
				{
					budget -= 500;
					satisfaction +=5;
				}
				else if (rdbtnHigherQualityFood.isSelected())
				{
					budget -= 600;
					satisfaction +=10;
				}
				else if (rdbtnProvideFreeMeals.isSelected())
				{
					budget -= 1000;
					satisfaction += 15;
				}
				else if (rdbtnHoldACharity.isSelected())
				{
					budget -= 1500;
					satisfaction +=15;
					fame += 5;
				}
				else if (rdbtnSponserLocalSports.isSelected())
				{
					budget -= 2000;
					satisfaction +=15;
					fame += 10;
				}
				else if (rdbtnEmployeeInA.isSelected())
				{
					budget -= 500;
					fame +=5;
				}
				else if (rdbtnNewspaperArticle.isSelected())
				{
					budget -= 600;
					fame +=10;
				}
				else if (rdbtnFancyTableCloths.isSelected())
				{
					budget -= 1000;
					fame +=15;
				}
				else if (rdbtnCreateAWebsite.isSelected())
				{
					budget -= 1500;
					fame +=15;
					satisfaction += 5;
				}
				else if (rdbtnForgeYelpReviews.isSelected())
				{
					budget -= 2000;
					fame +=15;
					satisfaction += 10;
				}
				
				//switch chooses a random event based upon a randomly calculated number (see randnum), displays and implements it into the scores
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
					event = "Find a loonie on the ground and pick it up, customers think you're cheap";
					budget += 1;
					fame += 5;
					satisfaction -=10;
					break;
				case 7:
					event = "Your restaurant has the same name as another famous restaurant in Italy";
					fame += 15;
					break;
				case 8:
					event = "Store wins the lottery (somehow)";
					budget += 2000;
					fame += 5;
					break;
				case 9:
					event = "Old burger-flipper joe's dentures broke apart and fell into multiple hamburgers, satisfaction plummets";
					satisfaction -=20;
					break;
				}
				
				//checks if the user has won or lost the game
				isEnd(satisfaction, fame, budget);
				
				//the next block opens a new manager turn window for the next turn
				ManagerTurns newWindow = new ManagerTurns();
				newWindow.setVisible(true);
				setVisible(false);
			}
		
		});
		
		
	}
	
	/**
	 * Randomly generates a number between 0-9 (inclusive)
	 * @return the random number
	 */
	public int randnum ()
	{
		Random rand = new Random();
		int randomNum = rand.nextInt((9 - 0) + 1) + 0;//random number is determined
		return randomNum;
		
	}
	
	/**
	 * Checks if the game is voer
	 * @param sat the satisfaction score
	 * @param fame the fame score
	 * @param budget the budget amount
	 */
	public void isEnd (int sat, int fame, int budget)
	{
		//checks if any of the scores are less than or equal to zero (then the user loses) or fame or satisfaction is greater than 100 (user wins)
		if (sat <= 0 || fame <= 0 || budget <= 0)
		{
			ManagerLoseGame newWindow = new ManagerLoseGame();//opens a lose game window
			newWindow.setVisible(true);
			setVisible(false);//hides current window
		}
		else if (sat >= 100 || fame >= 100)
		{
			ManagerWinGame newWindow = new ManagerWinGame();//opens a win game window
			newWindow.setVisible(true);
			setVisible(false);//hides current window
		}
	}
}
//