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
import java.awt.event.ActionEvent;

public class CashierTurns extends JDialog {
	private JTextField textField;
	public int score = 50;

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
	//test
	public CashierTurns() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(CashierTurns.class.getResource("/project/restaurant logo.png")));
		setTitle("Cashier Game"); 
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		String[] customers = {"Bob","Jack","Timmy","John","Steve","Jacob","Jim","Stacey","Angelina","Tyrone"};
		String[] items = {"Chicken","Beef","Pork","Veggies","Lamb","Steamed Crab","Lobster","Salad","Mac & Cheese","Omelette"};
		double[] prices =  {9.95, 15.45, 12.45, 8.50, 16.95, 22.75, 25.30, 5.45, 8.95, 6.45};
		
		Random r = new Random();
		int randName = r.nextInt((9 - 0) + 1) + 0;
		
		JLabel lblEnterInputHere = new JLabel("Enter Total Price Here");
		lblEnterInputHere.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterInputHere.setBounds(45, 25, 215, 50);
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
		

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEditable(false);
		textPane_2.setBounds(45, 222, 154, 28);
		getContentPane().add(textPane_2);
		
		JLabel lblScore = new JLabel("Score:");
		lblScore.setBounds(45, 176, 46, 14);
		getContentPane().add(lblScore);
		
		JTextPane txtpnScore = new JTextPane();
		txtpnScore.setEditable(false);
		txtpnScore.setBounds(45, 191, 60, 20);
		String scoreFinal = "" + score;
		txtpnScore.setText(scoreFinal);
		getContentPane().add(txtpnScore);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {			
				String input = textField.getText();
				boolean checker = input.matches(".*[a-zA-Z]+.*");
				if (checker == false){
				double inputPrice = Double.parseDouble(input);
				double total = prices[randFood1] + prices[randFood2] + prices[randFood3];
					if (total == inputPrice){
						textPane_2.setText("Correct!");
						score+=5;
						
					} else {
						textPane_2.setText("Incorrect input");
						score-=5;
						System.out.println("test");
					}							
				
				} else {
					textPane_2.setText("Not a valid input");
					score-=5;
				}
			
				
				CashierTurns newWindow = new CashierTurns();
				setVisible(false);
				newWindow.setVisible(true);
				
			
				
				
			}			
		});
		btnNext.setBounds(110, 130, 89, 23);
		getContentPane().add(btnNext);
		
		
		
		
		

			
		
	}
}
