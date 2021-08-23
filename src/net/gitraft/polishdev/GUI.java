package net.gitraft.polishdev;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	int count = 0;
	JLabel label;
	JFrame frame;
	JPanel panel;
	
	public GUI() {
		frame = new JFrame();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		button.setBackground(Color.GREEN);
		button.setFont(new Font("Verdana", Font.BOLD, 18));
		
		 label = new JLabel("Clicked: 0");
		label.setForeground(Color.white);
		label.setFont(new Font("Verdana", Font.BOLD, 18));

		
		
		 panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Java GUI");
		frame.pack();
		frame.setVisible(true);
		
		panel.setBackground(Color.DARK_GRAY);
	}

	public static void main(String[] args) {
		new GUI();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		count++;
		label.setText("Clicked: " + count);
		
	}
	
}
