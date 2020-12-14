package swa.xcal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class xcal {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					xcal window = new xcal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public xcal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setFont(new Font("Dialog", Font.PLAIN, 10));
		frame.setBounds(100, 100, 303, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 10, 248, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn7.setBounds(30, 119, 50, 51);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn8.setBounds(90, 119, 50, 51);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn9.setBounds(150, 119, 50, 51);
		frame.getContentPane().add(btn9);
		
		JButton btnp = new JButton("+");
		btnp.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnp.setBounds(210, 119, 50, 51);
		frame.getContentPane().add(btnp);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn4.setBounds(30, 180, 50, 51);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn5.setBounds(90, 180, 50, 51);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn6.setBounds(150, 180, 50, 51);
		frame.getContentPane().add(btn6);
		
		JButton btnm = new JButton("-");
		btnm.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnm.setBounds(210, 180, 50, 51);
		frame.getContentPane().add(btnm);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn1.setBounds(30, 241, 50, 51);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn2.setBounds(90, 241, 50, 51);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn3.setBounds(150, 241, 50, 51);
		frame.getContentPane().add(btn3);
		
		JButton btnx = new JButton("*");
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnx.setBounds(210, 241, 50, 51);
		frame.getContentPane().add(btnx);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn0.setBounds(30, 302, 50, 51);
		frame.getContentPane().add(btn0);
		
		JButton btndot = new JButton(".");
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndot.setBounds(90, 302, 50, 51);
		frame.getContentPane().add(btndot);
		
		JButton btndivide = new JButton("/");
		btndivide.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btndivide.setBounds(150, 302, 50, 51);
		frame.getContentPane().add(btndivide);
		
		JButton btnequal = new JButton("=");
		btnequal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnequal.setBounds(210, 302, 50, 51);
		frame.getContentPane().add(btnequal);
		
		JButton btnarrow = new JButton("<-");
		btnarrow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnarrow.setBounds(32, 58, 48, 51);
		frame.getContentPane().add(btnarrow);
		
		JButton clear = new JButton("c");
		clear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		clear.setBounds(90, 58, 50, 51);
		frame.getContentPane().add(clear);
		
		JButton modulus = new JButton("%");
		modulus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		modulus.setBounds(150, 58, 50, 51);
		frame.getContentPane().add(modulus);
		
		JButton minus = new JButton("-");
		minus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		minus.setBounds(210, 58, 50, 51);
		frame.getContentPane().add(minus);
	}
}
