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

public class CashierTurns extends JDialog {
	private JTextField textField;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(CashierTurns.class.getResource("/project/restaurant logo.png")));
		setTitle("Cashier Game");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		String[] customers = {"Bob","Jack","Timmy","John","Steve","Jacob","Jim","Stacey","Angelina","Tyrone"};
		String[] items = {"Chicken","Beef","Pork","Veggies","Lamb","Steamed Crab","Lobster","Salad","Mac & Cheese","Omelette"};
		double[] prices =  {3.95, 4.25, 4.00, 2.95, 4.50, 6.25, 7.15, 2.25, 3.25, 3.15};
		
		Random r = new Random();
		int randName = r.nextInt(10)+1;
		
		JLabel lblEnterInputHere = new JLabel("Enter Input Here");
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
		txtpnBill.setText("Bill:");
		txtpnBill.setEditable(false);
		txtpnBill.setBounds(270, 86, 154, 28);
		getContentPane().add(txtpnBill);
		
		JTextPane txtpnFood = new JTextPane();
		int randFood1 = r.nextInt(10)+1;
		txtpnFood.setText(items[randFood1] + "     $" + prices[randFood1]);
		txtpnFood.setBounds(270, 125, 154, 28);
		getContentPane().add(txtpnFood);
		
		JTextPane textPane = new JTextPane();
		int randFood2 = r.nextInt(10)+1;
		textPane.setText(items[randFood2] + "     $" + prices[randFood2]);
		textPane.setBounds(270, 164, 154, 28);
		getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		int randFood3 = r.nextInt(10)+1;
		textPane_1.setText(items[randFood3] + "     $" + prices[randFood3]);
		textPane_1.setBounds(270, 203, 154, 28);
		getContentPane().add(textPane_1);

		for (int i = 0; i < 5; i++){
			randFood1 = r.nextInt(10)+1;
			
		}
		

			
		
	}
}