package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class WidrawAmt extends JFrame {

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
					WidrawAmt frame = new WidrawAmt();
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
	public WidrawAmt() {
		setTitle("WIDTHDRAW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER WITHDRAW AMOUNT");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel.setBounds(110, 11, 355, 51);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(173, 71, 229, 51);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String amt = textField.getText();
				int amt2 =  Integer.parseInt(amt);
				String pin = textField_1.getText();
				
				DbHandel obj6 = new DbHandel();
				String acc = obj6.str1;
				
				//System.out.println(total +"  "+acc);
			     String pin2 = obj6.readData2(acc, pin);
				
			     int bal2 = obj6.readbal(acc, pin);
			     
			     int total = bal2 - amt2;
				
		System.out.println("balance"+bal2+"toatal"+total);
				
				if(pin.equals(pin2))
				{
					if(bal2 >= amt2)
					{	
					  int temp=obj6.upadateOne(acc,total);
					
					  if(temp == 0)
					  {
						JOptionPane.showMessageDialog(btnNewButton,"Widraw Successfull..");
						SelectionFram obj = new SelectionFram();
						obj.setVisible(true);
						dispose();
					  }
					}
					else
					{
						JOptionPane.showMessageDialog(btnNewButton,"Your Account Balance is Low..");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"Please Enter valid PIN..");

				}

				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(219, 285, 139, 42);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER PIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 22));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(162, 156, 210, 42);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setBounds(173, 209, 229, 42);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\9c274894e974c4da2c7590d76d8335f2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 586, 363);
		contentPane.add(lblNewLabel_2);
	}
}
