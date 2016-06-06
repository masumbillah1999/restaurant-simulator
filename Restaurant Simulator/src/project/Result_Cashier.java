package project;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Result_Cashier extends JDialog {

	private static final long serialVersionUID = 7868112565094808526L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Result_Cashier dialog = new Result_Cashier();
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
	public Result_Cashier() {
		setTitle("Result");
		setBounds(100, 100, 245, 170);
		getContentPane().setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setEditable(false);
		textPane.setBounds(10, 11, 209, 50);
		getContentPane().add(textPane);
		textPane.setText(CashierTurns.result);
		
	
		
		JLabel label = new JLabel("Score:");
		label.setBounds(10, 75, 46, 14);
		getContentPane().add(label);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setText(CashierTurns.scoreFinal);
		textPane_1.setEditable(false);
		textPane_1.setBounds(10, 100, 60, 20);
		getContentPane().add(textPane_1);
		
		
		JButton btnOk = new JButton("Next");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				CashierTurns newWindow = new CashierTurns();
				newWindow.setVisible(true);
			}
		});
		btnOk.setBounds(130, 97, 89, 23);
		getContentPane().add(btnOk);
	}
}
