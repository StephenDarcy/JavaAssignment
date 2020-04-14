package com.naivebayes.assignment;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class GUI extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup TempGroup = new ButtonGroup();
	private final ButtonGroup AchesGroup = new ButtonGroup();
	private final ButtonGroup CoughGroup = new ButtonGroup();
	private final ButtonGroup SoreThroatGroup = new ButtonGroup();
	private final ButtonGroup DangerZoneGroup = new ButtonGroup();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 779, 741);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel left_panel = new JPanel();
		left_panel.setBounds(0, 0, 272, 704);
		left_panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(left_panel);
		left_panel.setLayout(null);
		
		JButton test_accuracy_button = new JButton("Test Accuracy");
		test_accuracy_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		test_accuracy_button.setOpaque(true);
		test_accuracy_button.setForeground(new Color(0, 0, 0));
		test_accuracy_button.setBackground(new Color(255, 255, 255));
		test_accuracy_button.setBounds(32, 616, 211, 49);
		left_panel.add(test_accuracy_button);
		
		JButton select_dataset_button = new JButton("Select Dataset");
		select_dataset_button.setBounds(32, 539, 211, 49);
		left_panel.add(select_dataset_button);
		select_dataset_button.setOpaque(true);
		select_dataset_button.setForeground(new Color(0, 0, 0));
		select_dataset_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		select_dataset_button.setBackground(new Color(255, 255, 255));
		
		JLabel img1 = new JLabel("New label");
		img1.setIcon(new ImageIcon(GUI.class.getResource("/com/naivebayes/assignment/B4953A7C-C062-4089-969A-2ACC4D336CE6.jpeg")));
		img1.setBounds(-259, -89, 914, 872);
		left_panel.add(img1);
		
		JPanel right_panel = new JPanel();
		right_panel.setBackground(new Color(255, 255, 255));
		right_panel.setBounds(272, 0, 612, 704);
		contentPane.add(right_panel);
		right_panel.setLayout(null);
		
		JRadioButton temp_normal_radio = new JRadioButton("Normal");
		temp_normal_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		temp_normal_radio.setHorizontalAlignment(SwingConstants.CENTER);
		TempGroup.add(temp_normal_radio);
		temp_normal_radio.setBounds(171, 240, 141, 40);
		right_panel.add(temp_normal_radio);
		
		JRadioButton temp_hot_radio = new JRadioButton("Hot");
		temp_hot_radio.setHorizontalAlignment(SwingConstants.CENTER);
		temp_hot_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TempGroup.add(temp_hot_radio);
		temp_hot_radio.setBounds(16, 240, 141, 40);
		right_panel.add(temp_hot_radio);
		
		JRadioButton temp_cold_radio = new JRadioButton("Cold");
		temp_cold_radio.setHorizontalAlignment(SwingConstants.CENTER);
		temp_cold_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		TempGroup.add(temp_cold_radio);
		temp_cold_radio.setBounds(325, 240, 141, 40);
		right_panel.add(temp_cold_radio);
		
		JLabel temp_label = new JLabel("Temperature: ");
		temp_label.setFont(new Font("Tahoma", Font.ITALIC, 20));
		temp_label.setBounds(16, 199, 153, 30);
		right_panel.add(temp_label);
		
		JLabel aches_label = new JLabel("Aches:");
		aches_label.setFont(new Font("Tahoma", Font.ITALIC, 20));
		aches_label.setBounds(89, 286, 153, 30);
		right_panel.add(aches_label);
		
		JRadioButton aches_yes_radio = new JRadioButton("Yes");
		aches_yes_radio.setHorizontalAlignment(SwingConstants.CENTER);
		aches_yes_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		AchesGroup.add(aches_yes_radio);
		aches_yes_radio.setBounds(89, 322, 141, 40);
		right_panel.add(aches_yes_radio);
		
		JRadioButton sore_throat_yes_radio = new JRadioButton("Yes");
		SoreThroatGroup.add(sore_throat_yes_radio);
		sore_throat_yes_radio.setHorizontalAlignment(SwingConstants.CENTER);
		sore_throat_yes_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sore_throat_yes_radio.setBounds(89, 404, 141, 40);
		right_panel.add(sore_throat_yes_radio);
		
		JRadioButton cough_yes_radio = new JRadioButton("Yes");
		CoughGroup.add(cough_yes_radio);
		cough_yes_radio.setHorizontalAlignment(SwingConstants.CENTER);
		cough_yes_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cough_yes_radio.setBounds(89, 486, 141, 40);
		right_panel.add(cough_yes_radio);
		
		JRadioButton danger_yes_radio = new JRadioButton("Yes");
		DangerZoneGroup.add(danger_yes_radio);
		danger_yes_radio.setHorizontalAlignment(SwingConstants.CENTER);
		danger_yes_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		danger_yes_radio.setBounds(89, 568, 141, 40);
		right_panel.add(danger_yes_radio);
		
		JRadioButton aches_no_radio = new JRadioButton("No");
		AchesGroup.add(aches_no_radio);
		aches_no_radio.setHorizontalAlignment(SwingConstants.CENTER);
		aches_no_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		aches_no_radio.setBounds(268, 322, 141, 40);
		right_panel.add(aches_no_radio);
		
		JRadioButton sore_throat_no_radio = new JRadioButton("No");
		SoreThroatGroup.add(sore_throat_no_radio);
		sore_throat_no_radio.setHorizontalAlignment(SwingConstants.CENTER);
		sore_throat_no_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		sore_throat_no_radio.setBounds(268, 404, 141, 40);
		right_panel.add(sore_throat_no_radio);
		
		JRadioButton cough_no_radio = new JRadioButton("No");
		CoughGroup.add(cough_no_radio);
		cough_no_radio.setHorizontalAlignment(SwingConstants.CENTER);
		cough_no_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		cough_no_radio.setBounds(268, 486, 141, 40);
		right_panel.add(cough_no_radio);
		
		JRadioButton danger_no_radio = new JRadioButton("No");
		DangerZoneGroup.add(danger_no_radio);
		danger_no_radio.setHorizontalAlignment(SwingConstants.CENTER);
		danger_no_radio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		danger_no_radio.setBounds(268, 568, 141, 40);
		right_panel.add(danger_no_radio);
		
		JLabel sore_throat_label = new JLabel("Sore Throat:");
		sore_throat_label.setFont(new Font("Tahoma", Font.ITALIC, 20));
		sore_throat_label.setBounds(89, 368, 153, 30);
		right_panel.add(sore_throat_label);
		
		JLabel cough_label = new JLabel("Cough:");
		cough_label.setFont(new Font("Tahoma", Font.ITALIC, 20));
		cough_label.setBounds(89, 450, 153, 30);
		right_panel.add(cough_label);
		
		JLabel danger_label = new JLabel("Recently in a danger zone:");
		danger_label.setFont(new Font("Tahoma", Font.ITALIC, 20));
		danger_label.setBounds(89, 532, 320, 30);
		right_panel.add(danger_label);
		
		JButton check_results_button = new JButton("Check Results");
		check_results_button.setForeground(Color.BLACK);
		check_results_button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		check_results_button.setBackground(new Color(0, 204, 51));
		check_results_button.setBounds(147, 632, 211, 49);
		right_panel.add(check_results_button);
		
		JLabel enter_label = new JLabel("Enter Your Symptoms:");
		enter_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		enter_label.setBounds(16, 167, 226, 30);
		right_panel.add(enter_label);
		
		JLabel diagnostic_label = new JLabel("DIAGNOSTIC TOOL\r\n");
		diagnostic_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		diagnostic_label.setBounds(54, 102, 226, 30);
		right_panel.add(diagnostic_label);
		
		JLabel coronavirus_label = new JLabel("CORONAVIRUS");
		coronavirus_label.setFont(new Font("Tahoma", Font.BOLD, 20));
		coronavirus_label.setBounds(75, 76, 226, 30);
		right_panel.add(coronavirus_label);
		
		JLabel img2 = new JLabel("New label");
		img2.setIcon(new ImageIcon(GUI.class.getResource("/com/naivebayes/assignment/IMG_2900.jpg")));
		img2.setBounds(311, 10, 153, 144);
		right_panel.add(img2);
		
		setVisible(true);
	}
}
