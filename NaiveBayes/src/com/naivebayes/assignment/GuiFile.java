package com.naivebayes.assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiFile extends JFrame {

	private JPanel contentPane  = new JPanel();;

	JButton small_button = new JButton("Small Dataset");
	JButton default_button = new JButton("Defaut Dataset");
	JButton large_button = new JButton("Large Dataset");
	
	JLabel small_label = new JLabel("30 Cases");
	JLabel default_label = new JLabel("76 Cases");
	JLabel large_label = new JLabel("Over 150 Cases");
	
	static String current_file = "MLdata.csv";
	
	public GuiFile() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		small_button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getSource() == small_button)
				{
					current_file = "small.csv";
				}
			}
		});
		
		
		small_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		small_button.setBounds(125, 52, 165, 39);
		contentPane.add(small_button);
		default_button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(e.getSource() == default_button)
				{
					current_file = "MLdata.csv";
				}
			}
		});
		
		
		default_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		default_button.setBounds(125, 118, 165, 39);
		contentPane.add(default_button);
		large_button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getSource() == large_button)
				{
					current_file = "big.csv";
				}
			}
		});
		
		large_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		large_button.setBounds(125, 185, 165, 39);
		contentPane.add(large_button);
		

		small_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		small_label.setBounds(125, 35, 78, 14);
		contentPane.add(small_label);
		

		default_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		default_label.setBounds(125, 101, 78, 14);
		contentPane.add(default_label);
		
		
		large_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		large_label.setBounds(125, 167, 105, 14);
		contentPane.add(large_label);
		
		setVisible(true);
	}
}
