/*
 * Masum Billah & Calvin Veenkamp
 * 342149929 322936881
 * 02/06/16
 * Restaurant Simulator Main_Graphic program
 * This class lets the user create a name for their restaurant
 */

package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Main_graphic {

	private JFrame frmRestaurantSimulator;
	private JTextField textField;
	public static String restaurantName; 

	/**
	 * Launches the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_graphic window = new Main_graphic();//creates a new window
					window.frmRestaurantSimulator.setVisible(true);//displays the window
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Creates the application.
	 */
	public Main_graphic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurantSimulator = new JFrame();
		frmRestaurantSimulator.setIconImage(Toolkit.getDefaultToolkit().getImage(Main_graphic.class.getResource("/project/restaurant logo.png")));//sets the icon to the restaurant
		frmRestaurantSimulator.setResizable(false);//makes the frame non-resizable
		frmRestaurantSimulator.setTitle("Restaurant Simulator\r\n");//sets name of the frame
		frmRestaurantSimulator.setBounds(100, 100, 540, 281);//sets dimensions of frame
		frmRestaurantSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurantSimulator.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToMasum = new JLabel("Welcome to Masum & Calvin's Restaurant Simulator!");//welcome message displayed
		lblWelcomeToMasum.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));//text size and font
		lblWelcomeToMasum.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToMasum.setBounds(10, 36, 514, 53);//sets size for box
		frmRestaurantSimulator.getContentPane().add(lblWelcomeToMasum);
		
		JLabel lblToGetStarted = new JLabel("To get started, pick a name for your restaurant");//prompt message
		lblToGetStarted.setFont(new Font("Calibri", Font.PLAIN, 15));//text size and font
		lblToGetStarted.setHorizontalAlignment(SwingConstants.CENTER);
		lblToGetStarted.setBounds(118, 100, 297, 28);//sets size for box
		frmRestaurantSimulator.getContentPane().add(lblToGetStarted);
		
		textField = new JTextField();//creates a new text field
		textField.setBounds(128, 139, 287, 20);//sets size for box
		frmRestaurantSimulator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("Next");//stes name for the button
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restaurantName = textField.getText();//gets restaurant name
				GameMode newWindow = new GameMode();//opens GameMode class
				newWindow.setVisible(true);
			}
		});
		btnNext.setBounds(435, 206, 89, 23);//sets size for button
		frmRestaurantSimulator.getContentPane().add(btnNext);
	}
}
