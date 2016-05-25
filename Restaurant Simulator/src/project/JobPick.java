package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JobPick extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			JobPick dialog = new JobPick();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public JobPick() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(JobPick.class.getResource("/project/restaurant logo.png")));
		setTitle("Pick a job!");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNowItsTime = new JLabel("Now it's time to pick a job!");
		lblNowItsTime.setHorizontalAlignment(SwingConstants.CENTER);
		lblNowItsTime.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNowItsTime.setBounds(10, 11, 414, 50);
		getContentPane().add(lblNowItsTime);
		
		JButton btnCashier = new JButton("Cashier");
		btnCashier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cashier newWindow = new Cashier();
				newWindow.setVisible(true);
			}
		});
		btnCashier.setBounds(10, 72, 175, 179);
		getContentPane().add(btnCashier);
		
		JButton btnManager = new JButton("Manager");
		btnManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager newWindow = new Manager();
				newWindow.setVisible(true);
			}
		});
		btnManager.setBounds(249, 72, 175, 179);
		getContentPane().add(btnManager);
	}
}
