/**
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator ManagerTurns program
 * This method runs the cashiers turns, including all calculations and opening/closing windows
 */
package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.awt.event.ActionEvent;

public class CashierTurns extends JDialog {

	private static final long serialVersionUID = -3865296265279349927L;
	private JTextField textField; //textfield initialized
	public static int score = 50;
	public static String result;
	public static String scoreFinal;
	public static long start, now;
	public static int tip = 0;
	public static boolean powerup = false;
	public static double time = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CashierTurns dialog = new CashierTurns();
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
	public CashierTurns() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CashierTurns.class.getResource("/project/restaurant logo.png")));
		setTitle("Cashier Game");
		setBounds(100, 100, 450, 276);
		getContentPane().setLayout(null);
		
		String[] customers = {"Bob","Jack","Timmy","John","Steve","Jacob","Jim","Stacey","Angelina","Tyrone"};
		String[] items = {"Chicken","Beef","Pork","Veggies","Lamb","Steamed Crab","Lobster","Salad","Mac & Cheese","Omelette"};
		double[] prices =  {9.95, 15.45, 12.45, 8.50, 16.95, 22.75, 25.30, 5.45, 8.95, 6.45};
		
		Random r = new Random();
		int randName = r.nextInt((9 - 0) + 1) + 0;
		
		JLabel lblEnterInputHere = new JLabel("Enter Total Price Here");
		lblEnterInputHere.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterInputHere.setBounds(42, 25, 215, 50);
		getContentPane().add(lblEnterInputHere);
		
		textField = new JTextField();
		textField.setBounds(45, 86, 154, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("$");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setBounds(10, 84, 30, 20);
		getContentPane().add(label);
		
		JTextPane txtpnCustomerNameBob = new JTextPane();
		txtpnCustomerNameBob.setEditable(false);
		txtpnCustomerNameBob.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnCustomerNameBob.setText("Customer Name: " + customers[randName]);
		txtpnCustomerNameBob.setBounds(270, 25, 154, 50);
		getContentPane().add(txtpnCustomerNameBob);
		
		
		
		JTextPane txtpnBill = new JTextPane();
		txtpnBill.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtpnBill.setText("Receipt:");
		txtpnBill.setEditable(false);
		txtpnBill.setBounds(270, 86, 154, 28);
		getContentPane().add(txtpnBill);
		
		JTextPane txtpnFood = new JTextPane();
		txtpnFood.setEditable(false);
		int randFood1 = r.nextInt((9 - 0) + 1) + 0;
		txtpnFood.setText(items[randFood1] + "     $" + prices[randFood1]);
		txtpnFood.setBounds(270, 125, 154, 28);
		getContentPane().add(txtpnFood);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		int randFood2 = r.nextInt((9 - 0) + 1) + 0;
		textPane.setText(items[randFood2] + "     $" + prices[randFood2]);
		textPane.setBounds(270, 164, 154, 28);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setEditable(false);
		int randFood3 = r.nextInt((9 - 0) + 1) + 0;
		textPane_1.setText(items[randFood3] + "     $" + prices[randFood3]);
		textPane_1.setBounds(270, 203, 154, 28);
		getContentPane().add(textPane_1);
		scoreFinal = "" + score;
		
		
		
		
		JTextPane txtpnTip = new JTextPane();
		txtpnTip.setEditable(false);
		txtpnTip.setText("Tip: $ " + tip);
		txtpnTip.setBounds(10, 188, 89, 20);
		getContentPane().add(txtpnTip);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEditable(false);
		textPane_3.setBounds(109, 188, 148, 20);
		getContentPane().add(textPane_3);
		
		JButton btnStore = new JButton("Disable Time ($15)");
		btnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (tip >= 15){
					textPane_3.setText("Timer Disabled!");
					powerup = true;
					tip-= 15;
					txtpnTip.setText("Tip: $ " + tip);
				} else {
					textPane_3.setText("Not Enough Funds!");
				}
				
			}
		});
		btnStore.setBounds(10, 213, 250, 23);
		getContentPane().add(btnStore);
		start = System.currentTimeMillis();
		
		JTextPane txtpnScore = new JTextPane();
		txtpnScore.setText("Score: " + scoreFinal);
		txtpnScore.setBounds(10, 164, 89, 20);
		getContentPane().add(txtpnScore);
		
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {	
				now = System.currentTimeMillis();
				double time =  (now - start) / 1000.0;
				int timeScore = 0;
				String input = textField.getText();
				boolean checker = input.matches(".*[a-zA-Z]+.*");
				if (checker == false){
				double inputPrice = Double.parseDouble(input);
				BigDecimal totalBigNumber = new BigDecimal( prices[randFood1] + prices[randFood2] + prices[randFood3]).setScale(2, BigDecimal.ROUND_HALF_UP);
				double total = totalBigNumber.doubleValue();
					if (total == inputPrice){
						System.out.println(time + " time");
						if (powerup == false){
							if (time <= 15.0){
								timeScore = 5;
								tip+=5;
							} else if (time <= 17.0){
								timeScore = 4;
								tip += 2;
							} else if (time <= 19.0){
								timeScore = 3;
								tip += 1;
							} else if (time <= 21.0){
								timeScore = 2; 
							} else {
								timeScore = 1; 
							}
							
							result = "Correct. +" + timeScore;
							score+=timeScore;
						} else if (powerup == true){
							result = "Correct. +5";
							score+=5;
						}
						
						txtpnTip.setText("$ " + tip);
						
					} else {
						result = "Incorrect input -5";
						score-=5;
					}							
				
				}
				
				else {
					result = "Not a valid input. Try again";
				}
				
				
				
				scoreFinal = "" + score;
				
			
				Result_Cashier newWindow = new Result_Cashier();
				newWindow.setVisible(true);
				setVisible(false);
				
			}			
		});
		btnNext.setBounds(110, 117, 89, 23);
		getContentPane().add(btnNext);
			
	}
	public void isEnd (int score)
	{
		//checks if any of the scores are less than or equal to zero (then the user loses) or fame or satisfaction is greater than 100 (user wins)
		if (score <= 0)
		{
			LoseGame newWindow = new LoseGame();//opens a lose game window
			newWindow.setVisible(true);
			setVisible(false);//hides current window
		}
		else if (score >= 100)
		{
			WinGame newWindow = new WinGame();//opens a win game window
			newWindow.setVisible(true);
			setVisible(false);//hides current window
		}
	}
}
