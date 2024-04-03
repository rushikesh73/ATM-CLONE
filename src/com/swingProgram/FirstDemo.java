package com.swingProgram;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class FirstDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textname;
	private JLabel label2;
	private JTextField textage;
	private JButton btnReset;
	private JButton btnVote;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstDemo frame = new FirstDemo();
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
	public FirstDemo() {
		setBackground(new Color(64, 128, 128));
		setTitle("My Frame");
		setFont(new Font("Dialog", Font.BOLD, 12));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 341);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label1 = new JLabel("Name :");
		label1.setForeground(new Color(255, 128, 0));
		label1.setBounds(27, 89, 84, 28);
		label1.setBackground(new Color(255, 255, 255));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(label1);
		
		textname = new JTextField();
		textname.setBounds(110, 89, 240, 28);
		textname.setBackground(new Color(255, 255, 255));
		contentPane.add(textname);
		textname.setColumns(10);
		
		label2 = new JLabel("Age :");
		label2.setForeground(new Color(255, 128, 0));
		label2.setBounds(27, 143, 84, 28);
		label2.setBackground(new Color(255, 255, 255));
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(label2);
		
		textage = new JTextField();
		textage.setBounds(110, 145, 240, 29);
		contentPane.add(textage);
		textage.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(27, 208, 99, 39);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textname.getText();
				int age = Integer.parseInt(textage.getText());
				System.out.println("Name:"+name);
				System.out.println("Age:"+age);
			}
		});
		btnSubmit.setBackground(new Color(128, 128, 0));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnSubmit);
		
		btnReset = new JButton("Reset");
		btnReset.setBounds(178, 208, 99, 39);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textname.setText("");
				textage.setText("");
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBackground(new Color(240, 240, 240));
		contentPane.add(btnReset);
		
		btnVote = new JButton("vote");
		btnVote.setBounds(330, 208, 99, 39);
		btnVote.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int age = Integer.parseInt(textage.getText());
				
				if(age >= 18)
				{
					JOptionPane.showMessageDialog(btnVote, " You can Vote");
				}
				else
				{
					JOptionPane.showMessageDialog(btnVote, " You can't Vote");
				}
			}
		});
		btnVote.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnVote);
		
		JLabel LABEL3 = new JLabel("");
		LABEL3.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\SHIVAJI MAHARAJ.jpg"));
		LABEL3.setBounds(0, 0, 595, 302);
		contentPane.add(LABEL3);
	}
}
