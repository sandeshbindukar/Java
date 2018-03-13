//import java.awt.Color;
//import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//import javax.swing.JFrame;
//import javax.swing.JTextArea;

public class New {
	public static void main(String[] args) {
		JFrame f= new JFrame("My app");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		f.setSize(400, 600);
		
		Container background = f.getContentPane();
		background.setBackground(Color.GREEN);
		background.setLayout(new FlowLayout());
		
		JLabel l= new JLabel("Username");
		background.add(l);
		
		JTextField tf= new JTextField(12);
		background.add(tf);
		
		JButton b= new JButton("Submit");
		background.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tf.setText("Submitted");
				JOptionPane.showMessageDialog(null, tf.getText());
				
			}
			});
		
		System.out.println("Hello World");
		f.setVisible(true);
	}

}
