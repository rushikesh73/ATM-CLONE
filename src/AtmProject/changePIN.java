package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class changePIN extends JFrame {

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
					changePIN frame = new changePIN();
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
	public changePIN() {
		setTitle("PIN Change");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 402);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Current PIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(86, 11, 384, 65);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(165, 72, 189, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New PIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(92, 129, 305, 46);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setBounds(165, 173, 189, 46);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectionFram obj = new SelectionFram();
				obj.setVisible(true);
				dispose();
			 
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.setBounds(214, 316, 80, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SUBMIT");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String pin = textField.getText();
				String newpin = textField_1.getText();
				DbHandel obj7 = new DbHandel();
				int a=newpin.length();
				int flag = 0;
			for(int i=0 ; i<newpin.length();i++)
			{
				if(newpin.charAt(i) >= 48 && newpin.charAt(i) <= 57)
				{
					flag++;
					
				}
			}
			
			    String pin3= obj7.readData2(obj7.str1, pin);
			    
			    System.out.println("yeueujj"+pin3);
			
				if(pin.equals(pin3) && a== 4 && flag == 4)
				{
					
					int temp = obj7.upadatePIN(obj7.str1, newpin);
					
					if(temp == 0 );
					{
						JOptionPane.showMessageDialog(btnNewButton_1,"PIN Successfully Updated..");
						SelectionFram obj2 = new SelectionFram();
						obj2.setVisible(true);
						dispose();
					}
				
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton_1,"Please Enter Valid PIN..");
				}
			}
		});
		btnNewButton_1.setForeground(new Color(255, 0, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		btnNewButton_1.setBounds(201, 251, 119, 46);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\53fc34ee19077f82db4bfa36d4ff53c3 (2).jpg"));
		lblNewLabel_2.setBounds(0, 0, 587, 363);
		contentPane.add(lblNewLabel_2);
	}
}
