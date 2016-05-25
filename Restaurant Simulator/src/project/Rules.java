package project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.Dialog;

import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Rules extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Rules dialog = new Rules();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Rules() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Rules.class.getResource("/project/restaurant logo.png")));
		setResizable(false);
		setTitle("Rules");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 260, 434, 1);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("OK");
			okButton.setBounds(377, 227, 47, 23);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton btnOk = new JButton("OK");
			btnOk.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
				}
			});
			btnOk.setBounds(335, 226, 89, 23);
			getContentPane().add(btnOk);
		}
		
		JTextPane txtpnSdfhdzfbSzdFdfg = new JTextPane();
		txtpnSdfhdzfbSzdFdfg.setEditable(false);
		txtpnSdfhdzfbSzdFdfg.setBackground(SystemColor.control);
		txtpnSdfhdzfbSzdFdfg.setText("The rules go here...");
		txtpnSdfhdzfbSzdFdfg.setBounds(10, 11, 414, 204);
		getContentPane().add(txtpnSdfhdzfbSzdFdfg);
	}
}
