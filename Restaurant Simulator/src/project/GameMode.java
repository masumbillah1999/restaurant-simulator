/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator GameMode program
 * This class lets the user choose whether they want to: start the game, look at the rules or exit the code
 */

package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class GameMode extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		try {
			GameMode dialog = new GameMode();//creates a new dialog
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);//makes it visible
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creates the dialog.
	 */
	public GameMode() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameMode.class.getResource("/project/restaurant logo.png")));//sets icon image
		setResizable(false);//makes sure it cannot be resized
		setTitle("Welcome to " + Main_graphic.restaurantName + "'s Restaurant");//welcome message
		setBounds(100, 100, 450, 300);//sets the dimensions
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");//main message
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Microsoft YaHei", Font.BOLD, 64));//sets text font and size
		lblMenu.setBounds(10, 11, 414, 85);//sets the dimensions
		contentPanel.add(lblMenu);
		
		JButton btnRules = new JButton("Rules");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rules newWindow = new Rules();//opens Rules class
				newWindow.setVisible(true);
			}
		});
		btnRules.setBounds(10, 180, 100, 70);//sets the dimensions
		contentPanel.add(btnRules);
		
		JButton btnStart = new JButton("Pick a job");// text set for the button
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JobPick newWindow = new JobPick();//opens the JobPick class 
				newWindow.setVisible(true);
				setVisible(false);
				
			}
		});
		btnStart.setBounds(163, 180, 100, 70);//sets the dimensions
		contentPanel.add(btnStart);
		
		JButton btnExit = new JButton("Exit");//sets button text
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);//exits the code
			}
		});
		btnExit.setBounds(324, 180, 100, 70);//sets the dimensions
		contentPanel.add(btnExit);
	}
}
