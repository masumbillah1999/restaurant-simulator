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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_graphic window = new Main_graphic();
					window.frmRestaurantSimulator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_graphic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRestaurantSimulator = new JFrame();
		frmRestaurantSimulator.setIconImage(Toolkit.getDefaultToolkit().getImage(Main_graphic.class.getResource("/project/restaurant logo.png")));
		frmRestaurantSimulator.setResizable(false);
		frmRestaurantSimulator.setTitle("Restaurant Simulator\r\n");
		frmRestaurantSimulator.setBounds(100, 100, 540, 281);
		frmRestaurantSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRestaurantSimulator.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToMasum = new JLabel("Welcome to Masum & Calvin's Restaurant Simulator!");
		lblWelcomeToMasum.setFont(new Font("Imprint MT Shadow", Font.BOLD, 20));
		lblWelcomeToMasum.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeToMasum.setBounds(10, 36, 514, 53);
		frmRestaurantSimulator.getContentPane().add(lblWelcomeToMasum);
		
		JLabel lblToGetStarted = new JLabel("To get started, pick a name for your restaurant");
		lblToGetStarted.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblToGetStarted.setHorizontalAlignment(SwingConstants.CENTER);
		lblToGetStarted.setBounds(118, 100, 297, 28);
		frmRestaurantSimulator.getContentPane().add(lblToGetStarted);
		
		textField = new JTextField();
		textField.setBounds(128, 139, 287, 20);
		frmRestaurantSimulator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				restaurantName = textField.getText();
				GameMode newWindow = new GameMode();
				newWindow.setVisible(true);
			}
		});
		btnNext.setBounds(435, 206, 89, 23);
		frmRestaurantSimulator.getContentPane().add(btnNext);
	}
}
