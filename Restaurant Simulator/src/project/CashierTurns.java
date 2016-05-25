package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.Toolkit;

public class CashierTurns extends JDialog {

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
		String[] items = {"Chicken","Beef","Pork","Veggies","Lamb","Steamed Crab","Lobster","Salad","Mac & Cheese","Omelette	"};
	}

}
