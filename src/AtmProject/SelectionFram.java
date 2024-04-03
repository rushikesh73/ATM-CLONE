package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class SelectionFram extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SelectionFram frame = new SelectionFram();
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
	public SelectionFram() {
		setTitle("Selection Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button1 = new JButton("Balance");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				PinFram obj = new PinFram();
				obj.setVisible(true);
				dispose();
				
				
			}
		});
		button1.setFont(new Font("Tahoma", Font.BOLD, 14));
		button1.setBounds(62, 75, 155, 66);
		contentPane.add(button1);
		
		JButton button2 = new JButton("Deposit");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DepositAmt obj = new DepositAmt();
				obj.setVisible(true);
				dispose();
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD, 14));
		button2.setBounds(62, 199, 155, 66);
		contentPane.add(button2);
		
		JButton button3 = new JButton("Withdraw");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				WidrawAmt obj = new WidrawAmt();
				obj.setVisible(true);
				dispose();

			}
		});
		button3.setFont(new Font("Tahoma", Font.BOLD, 14));
		button3.setBounds(375, 75, 155, 66);
		contentPane.add(button3);
		
		JButton button6 = new JButton("Exit ATM");
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lastframe obj = new lastframe();
				obj.setVisible(true);
				dispose();
			}
		});
		button6.setFont(new Font("Tahoma", Font.BOLD, 14));
		button6.setBounds(221, 284, 155, 66);
		contentPane.add(button6);
		
		JButton btnNewButton = new JButton("Change PIN");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				changePIN obj = new changePIN();
				obj.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(375, 199, 155, 66);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\46852956743e9658b9a107831ddd584d.jpg"));
		lblNewLabel.setBounds(0, 0, 587, 361);
		contentPane.add(lblNewLabel);
		
		
	}
}
