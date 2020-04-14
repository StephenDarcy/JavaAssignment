package com.naivebayes.assignment;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GuiHome extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiHome frame = new GuiHome();
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
	public GuiHome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("COVID-19 Prediction Tool  ");
		lblNewLabel.setBounds(451, 47, 287, 30);
		lblNewLabel.setForeground(new Color(0, 153, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 25));
		contentPane.add(lblNewLabel);
		
		JButton enterSymptomsButton = new JButton("Enter Symptoms");
		enterSymptomsButton.setBounds(454, 100, 177, 33);
		enterSymptomsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getSource() == enterSymptomsButton)
				{
					GuiInput enter = new GuiInput();
				}
			}
		});
		enterSymptomsButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(enterSymptomsButton);
		
		JButton btnNewButton_1 = new JButton("Change File");
		btnNewButton_1.setBounds(475, 138, 135, 33);
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnNewButton_1);
		
		JButton btnTestAccuracy = new JButton("Test Accuracy");
		btnTestAccuracy.setBounds(465, 356, 155, 33);
		btnTestAccuracy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnTestAccuracy.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(btnTestAccuracy);
	}
}
