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
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GameMode dialog = new GameMode();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GameMode() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(GameMode.class.getResource("/project/restaurant logo.png")));
		setResizable(false);
		setTitle("Welcome to " + Main_graphic.restaurantName + "'s Restaurant");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Microsoft YaHei", Font.BOLD, 64));
		lblMenu.setBounds(10, 11, 414, 85);
		contentPanel.add(lblMenu);
		
		JButton btnRules = new JButton("Rules");
		btnRules.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Rules newWindow = new Rules();
				newWindow.setVisible(true);
			}
		});
		btnRules.setBounds(10, 180, 100, 70);
		contentPanel.add(btnRules);
		
		JButton btnStart = new JButton("Pick a job");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JobPick newWindow = new JobPick();
				newWindow.setVisible(true);
				setVisible(false);
				
			}
		});
		btnStart.setBounds(163, 180, 100, 70);
		contentPanel.add(btnStart);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnExit.setBounds(324, 180, 100, 70);
		contentPanel.add(btnExit);
	}
}
