package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class DepositAmt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DepositAmt frame = new DepositAmt();
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
	public DepositAmt() {
		setTitle("DEPOSITE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER DEPOSIT AMOUNT");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(66, 11, 406, 63);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setBounds(174, 88, 187, 47);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setForeground(new Color(0, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String amt= textField.getText();
				int amn2 = Integer.parseInt(amt);
				String pin= textField_1.getText();
				
				DbHandel obj = new DbHandel();
				String acc = obj.str1;
				String pin2 =obj.readData2(acc, pin);
				
				int total = amn2+obj.bal;
				if(pin.equals(pin2))
				{
					int temp=obj.upadateOne(acc,total);
					
					if(temp == 0)
					{
						JOptionPane.showMessageDialog(btnNewButton,"Deposit Successfull..");
						SelectionFram obj1 = new SelectionFram();
						obj1.setVisible(true);
						dispose();
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Please Enter valid PIN..");

				}
				
				
				/*
				obj.setVisible(true);
				dispose();*/
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(215, 316, 129, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Enter PIN");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setBounds(117, 166, 302, 47);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		textField_1.setBounds(200, 239, 144, 37);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\chart-graph-business-finance.jpg"));
		lblNewLabel_2.setBounds(0, 0, 586, 364);
		contentPane.add(lblNewLabel_2);
	}
}
