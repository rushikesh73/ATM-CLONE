package AtmProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Frame3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame3 frame = new Frame3();
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
	public Frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label31 = new JLabel("ACCOUNT  TYPE");
		label31.setBackground(new Color(0, 128, 128));
		label31.setForeground(new Color(0, 128, 64));
		label31.setFont(new Font("Tahoma", Font.BOLD, 18));
		label31.setHorizontalAlignment(SwingConstants.CENTER);
		label31.setBounds(183, 54, 221, 44);
		contentPane.add(label31);
		
		JButton btnNewButton = new JButton("Saving ");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(128, 0, 128));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectionFram obj = new SelectionFram();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(46, 154, 144, 44);
		contentPane.add(btnNewButton);
		
		JButton button2 = new JButton("Current");
		button2.setBackground(new Color(255, 255, 255));
		button2.setForeground(new Color(128, 0, 128));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectionFram obj = new SelectionFram();
				obj.setVisible(true);
				dispose();
				
			}
		});
		button2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		button2.setBounds(404, 154, 144, 44);
		contentPane.add(button2);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(228, 278, 97, 25);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\admin\\Downloads\\chart-graph-business-finance.jpg"));
		lblNewLabel.setBackground(new Color(128, 0, 128));
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setBounds(0, 0, 585, 361);
		contentPane.add(lblNewLabel);
	}
}
