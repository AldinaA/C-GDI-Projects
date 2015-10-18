import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.BorderLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Proba extends JFrame {
	private JTextField textField;
	private JTextField textField_1;
	public Proba() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(35, 54, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(35, 85, 86, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Saberi");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = Integer.parseInt(textField.getText());
				int b = Integer.parseInt(textField_1.getText());
				int c=a+b;
				JOptionPane.showMessageDialog(null, c);
			}
		});
		btnNewButton.setBounds(35, 122, 89, 23);
		getContentPane().add(btnNewButton);
	}
}
