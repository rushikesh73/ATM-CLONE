package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JToggleButton;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class PinFram extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PinFram frame = new PinFram();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PinFram() {
		setTitle("BALANCE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 404);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PLEASE  ENTER YOUR PIN ");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(112, 95, 355, 48);
		contentPane.add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 20));
		passwordField.setEchoChar('*');
		passwordField.setBounds(186, 169, 198, 48);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pin = passwordField.getText();
				DbHandel obj = new DbHandel();
				
			   String a	=obj.readData2(obj.str1, pin);
			   int bal = obj.readbal(obj.str1, pin);
				if(pin.equals(a))
				{
					JOptionPane.showMessageDialog(btnNewButton,"AVAILABLE BALANCE\n"+bal);
					SelectionFram obj2 = new SelectionFram();
					obj2.setVisible(true);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "INVALID PIN");
				}
					
				/*
				String str =obj.readPin(pin,obj.acc2);
				if(str.isEmpty())
				{
					JOptionPane.showMessageDialog(btnNewButton, "INVALID PIN");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"AVAILABLE BALANCE"
							+);
					dispose();
				}
				/*Balance obj2 = new Balance();
				obj2.setVisible(true);*/
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBounds(220, 260, 115, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectionFram obj = new SelectionFram();
				obj.setVisible(true);
				dispose();
			} 
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(230, 331, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\53fc34ee19077f82db4bfa36d4ff53c3 (2).jpg"));
		lblNewLabel_1.setBounds(0, 0, 586, 365);
		contentPane.add(lblNewLabel_1);
	}
}
