package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import com.mysql.cj.protocol.Resultset;

import javax.swing.JSplitPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class LoginPageNew extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textacc1;
	private JPasswordField passwordField1;
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPageNew frame = new LoginPageNew();
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
	public LoginPageNew() {
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 602, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textacc1 = new JTextField();
		textacc1.setBackground(new Color(255, 255, 255));
		textacc1.setFont(new Font("Tahoma", Font.BOLD, 11));
		textacc1.setBounds(75, 91, 290, 30);
		contentPane.add(textacc1);
		textacc1.setColumns(10);
		
		passwordField1 = new JPasswordField();
		passwordField1.setBounds(75, 157, 290, 30);
		contentPane.add(passwordField1);
		
		JLabel label3 = new JLabel("");
		label3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\resize-17087990241666171572accc.jpeg"));
		label3.setBounds(10, 91, 46, 30);
		contentPane.add(label3);
		
		JLabel lable4 = new JLabel("");
		lable4.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\resize-17087990682124040490pngtreevectorlockiconpngimage1011211.jpg"));
		lable4.setBounds(10, 157, 46, 30);
		contentPane.add(lable4);
		
		
		JButton buttonlogin = new JButton("Login");
		buttonlogin.setIcon(null);
		buttonlogin.setForeground(new Color(255, 128, 192));
		buttonlogin.setBackground(new Color(255, 255, 255));
		buttonlogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		buttonlogin.setBounds(75, 230, 124, 30);
		contentPane.add(buttonlogin);
		
		
		
		buttonlogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String acc = textacc1.getText();
				String pass = passwordField1.getText();
				
				
				try 
				 {
					 DbHandel obj2 = new DbHandel();
					  int res = obj2.readData(acc,pass);
					   System.out.println(res);
					   if(res == 1)
					   {
						   JOptionPane.showMessageDialog(buttonlogin,"Login Successfull..");
						   Frame3 obj = new Frame3();
							obj.setVisible(true);
							dispose();
					   }
					   else
					   {
						   JOptionPane.showMessageDialog(buttonlogin,"Pls enter correct credential");
					   }
						
				 }
				 catch(Exception ex)
				 {
					 ex.printStackTrace();
				 }
				
			
			/*	
				Frame3 obj = new Frame3();
				obj.setVisible(true);
				dispose();*/
			}
		});
		
		JButton buttonback = new JButton("BACK");
		buttonback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StartPage obj = new StartPage();
				obj.setVisible(true);
				dispose();
			}
		});
		buttonback.setBackground(new Color(255, 255, 255));
		buttonback.setForeground(new Color(64, 128, 128));
		buttonback.setFont(new Font("Tahoma", Font.BOLD, 13));
		buttonback.setBounds(286, 230, 119, 30);
		contentPane.add(buttonback);
		
		JButton buttoNewReg = new JButton("New Registration");
		buttoNewReg.setBackground(new Color(0, 0, 0));
		buttoNewReg.setForeground(new Color(255, 255, 255));
		buttoNewReg.setFont(new Font("Tahoma", Font.BOLD, 11));
		buttoNewReg.setBounds(119, 298, 226, 32);
		contentPane.add(buttoNewReg);
		
		JLabel lblNewLabel = new JLabel("USER LOGIN ");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(135, 11, 323, 69);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\admin\\Documents\\WhatsApp Image 2024-02-27 at 22.53.38_49827a71.jpg"));
		lblNewLabel_1.setBounds(0, 0, 586, 362);
		contentPane.add(lblNewLabel_1);
		
				
			
		buttoNewReg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				NewReg obj2 = new NewReg();
				obj2.setVisible(true);
				dispose();
			}
		});
	}
}
