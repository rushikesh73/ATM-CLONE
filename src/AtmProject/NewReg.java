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
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JPasswordField;

public class NewReg extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textacc;
	private JTextField textcard;
	private JTextField textname;
	private JPasswordField textpass;
	private JPasswordField textpin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewReg frame = new NewReg();
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
	public NewReg() {
		setTitle(" Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New Card  Registration");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 30));
		lblNewLabel.setBounds(154, 11, 349, 26);
		contentPane.add(lblNewLabel);
		
		JLabel labelacc = new JLabel("Account No ");
		labelacc.setForeground(new Color(128, 0, 64));
		labelacc.setBackground(new Color(0, 0, 0));
		labelacc.setHorizontalAlignment(SwingConstants.CENTER);
		labelacc.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		labelacc.setBounds(10, 82, 134, 36);
		contentPane.add(labelacc);
		
		textacc = new JTextField();
		textacc.setBackground(new Color(177, 198, 205));
		textacc.setFont(new Font("Tahoma", Font.BOLD, 11));
		textacc.setBounds(154, 89, 250, 26);
		contentPane.add(textacc);
		textacc.setColumns(15);
		
		JLabel labelcard = new JLabel("Card No");
		labelcard.setBackground(new Color(0, 0, 0));
		labelcard.setForeground(new Color(128, 0, 64));
		labelcard.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		labelcard.setHorizontalAlignment(SwingConstants.CENTER);
		labelcard.setBounds(10, 127, 134, 36);
		contentPane.add(labelcard);
		
		textcard = new JTextField();
		textcard.setBackground(new Color(177, 198, 205));
		textcard.setFont(new Font("Tahoma", Font.BOLD, 11));
		textcard.setBounds(154, 133, 250, 28);
		contentPane.add(textcard);
		textcard.setColumns(10);
		
		JLabel labelname = new JLabel("NAME");
		labelname.setBackground(new Color(0, 128, 255));
		labelname.setForeground(new Color(128, 0, 64));
		labelname.setHorizontalAlignment(SwingConstants.CENTER);
		labelname.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		labelname.setBounds(10, 45, 134, 36);
		contentPane.add(labelname);
		
		textname = new JTextField();
		textname.setBackground(new Color(177, 198, 205));
		textname.setForeground(new Color(0, 0, 0));
		textname.setFont(new Font("Tahoma", Font.BOLD, 11));
		textname.setBounds(154, 52, 250, 26);
		contentPane.add(textname);
		textname.setColumns(10);
		
		JButton btnsubmit = new JButton("SUBMIT");
		btnsubmit.setBackground(new Color(255, 255, 255));
		btnsubmit.setForeground(new Color(255, 128, 0));
		btnsubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				 String acc = textacc.getText();
				 String name =textname.getText();
				 String card =textcard.getText();
				 String pass = textpass.getText();
				 String pin = textpin.getText();
				 int bal = 00;
				 int x=1;
				 int y=1;
				 int z=1;
				 int p=0;
				 
				 
				 if(acc.length() == 14)	
				 {
					 x++;
					
				 }
				 if(card.length() == 16)
				 {
					 y++;
				 }
				 int cnt=0;
				 
				 for(int i=0 ; i<name.length();i++)
				 {
					 if(name.charAt(i) == ' ')
					 {
						 cnt++;
						 
					 }
				 }
				 if(cnt == 2)
				 {
					 z++; 
					
				 }
				 int flag = 1;
					int a = 0, b = 0, c = 0, d = 0, e1 = 0;
					
					if(pass.length() >= 6)
					{
						for(int i = 0; i < pass.length(); i++)
						{
							if(pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')
							{
								a++;
							}
							else if(pass.charAt(i) >= 'a' && pass.charAt(i) <= 'z')
							{
								b++;
							}
							else if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57)
							{
								c++;
							}
							else if((pass.charAt(i) >= 33 && pass.charAt(i) <= 47) || (pass.charAt(i) >= 58 && pass.charAt(i) <= 64))
							{
								d++;
							}
						
							if(a >= 1 && b >= 1 && c >= 1 && d >= 1)
							{
								flag = 0;
								break;
							}
							
							
						}
					}
					else
					{
						e1 = 1;
						flag = 1;
						
					}
					if(pin.length() == 4 )
					{
						p++;
					}
					
					
					 

					
				 if(flag == 0 && x ==2 && y == 2 && z == 2 && p == 1)
				 {
					 
					 DbHandel obj3 = new DbHandel();
						//obj3.connectDB();
						//obj3.createDB();
						//obj3.createTable();
						int yes =obj3.insertData(acc, name.toUpperCase(), card, pass,pin,bal);
						
						if(yes == 0)
						{
							LoginPageNew obj = new LoginPageNew();
							JOptionPane.showMessageDialog(btnsubmit,"Registration Successfully");
							dispose();

						}
						else
						{
							JOptionPane.showMessageDialog(btnsubmit,"Please Enter Valid Information..");
						}
						
				 }
				 else
				 {
					 JOptionPane.showMessageDialog(btnsubmit,"Registration Failed..");
				 }
				
			}
		});
		btnsubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnsubmit.setBounds(117, 291, 148, 36);
		contentPane.add(btnsubmit);
		
		JButton btnback = new JButton("BACK");
		btnback.setForeground(new Color(0, 0, 160));
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPageNew obj2 = new LoginPageNew();
				obj2.setVisible(true);
				dispose();
			}
		});
		btnback.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnback.setBounds(380, 291, 123, 36);
		contentPane.add(btnback);
		
		JLabel label5 = new JLabel("Password");
		label5.setBackground(new Color(0, 0, 0));
		label5.setForeground(new Color(128, 0, 64));
		label5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setBounds(10, 175, 134, 36);
		contentPane.add(label5);
		
		textpass = new JPasswordField();
		textpass.setBackground(new Color(177, 198, 205));
		textpass.setFont(new Font("Tahoma", Font.BOLD, 13));
		textpass.setBounds(154, 180, 250, 29);
		contentPane.add(textpass);
		textpass.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Set Pin");
		lblNewLabel_1.setForeground(new Color(128, 0, 64));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(36, 230, 73, 26);
		contentPane.add(lblNewLabel_1);
		
		textpin = new JPasswordField();
		textpin.setBackground(new Color(64, 128, 128));
		textpin.setFont(new Font("Tahoma", Font.BOLD, 12));
		textpin.setBounds(154, 233, 89, 20);
		contentPane.add(textpin);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Documents\\WhatsApp Image 2024-02-25 at 18.53.20_5b2df3f2.jpg"));
		lblNewLabel_2.setBounds(0, 0, 597, 372);
		contentPane.add(lblNewLabel_2);
	}
}
