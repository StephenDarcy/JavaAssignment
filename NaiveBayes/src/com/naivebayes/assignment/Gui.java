package com.naivebayes.assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
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
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 1000, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel title_label = new JLabel("COVID-19 Probability Tool:  ");
		GridBagConstraints gbc_title_label = new GridBagConstraints();
		gbc_title_label.insets = new Insets(0, 0, 5, 0);
		gbc_title_label.gridx = 2;
		gbc_title_label.gridy = 0;
		contentPane.add(title_label, gbc_title_label);
		
		JLabel symptoms_label = new JLabel("Enter Symptoms:");
		GridBagConstraints gbc_symptoms_label = new GridBagConstraints();
		gbc_symptoms_label.anchor = GridBagConstraints.WEST;
		gbc_symptoms_label.insets = new Insets(0, 0, 5, 5);
		gbc_symptoms_label.gridx = 0;
		gbc_symptoms_label.gridy = 1;
		contentPane.add(symptoms_label, gbc_symptoms_label);
		
		JLabel temp_label = new JLabel("Temperature:");
		GridBagConstraints gbc_temp_label = new GridBagConstraints();
		gbc_temp_label.anchor = GridBagConstraints.WEST;
		gbc_temp_label.insets = new Insets(0, 0, 5, 5);
		gbc_temp_label.gridx = 0;
		gbc_temp_label.gridy = 2;
		contentPane.add(temp_label, gbc_temp_label);
		
		//creating button group for temperature radio buttons
		//this is done to allow only one radio button to be ticked at a time
		ButtonGroup TempGroup = new ButtonGroup();
		
		JRadioButton temp_hot_radio = new JRadioButton("Hot");
		GridBagConstraints gbc_temp_hot_radio = new GridBagConstraints();
		gbc_temp_hot_radio.anchor = GridBagConstraints.WEST;
		gbc_temp_hot_radio.insets = new Insets(0, 0, 5, 5);
		gbc_temp_hot_radio.gridx = 0;
		gbc_temp_hot_radio.gridy = 3;
		contentPane.add(temp_hot_radio, gbc_temp_hot_radio);
		
		//adding radio button to group
		TempGroup.add(temp_hot_radio);
		
		JRadioButton temp_normal_radio = new JRadioButton("Normal");
		GridBagConstraints gbc_temp_normal_radio = new GridBagConstraints();
		gbc_temp_normal_radio.anchor = GridBagConstraints.WEST;
		gbc_temp_normal_radio.insets = new Insets(0, 0, 5, 5);
		gbc_temp_normal_radio.gridx = 1;
		gbc_temp_normal_radio.gridy = 3;
		contentPane.add(temp_normal_radio, gbc_temp_normal_radio);
		
		//adding normal radio button to group
		TempGroup.add(temp_normal_radio);
		
		JRadioButton temp_cold_radio = new JRadioButton("Cold");
		GridBagConstraints gbc_temp_cold_radio = new GridBagConstraints();
		gbc_temp_cold_radio.anchor = GridBagConstraints.WEST;
		gbc_temp_cold_radio.insets = new Insets(0, 0, 5, 0);
		gbc_temp_cold_radio.gridx = 2;
		gbc_temp_cold_radio.gridy = 3;
		contentPane.add(temp_cold_radio, gbc_temp_cold_radio);
		
		//adding cold radio button to group
		TempGroup.add(temp_cold_radio);
		
		JLabel aches_label = new JLabel("Aches:");
		GridBagConstraints gbc_aches_label = new GridBagConstraints();
		gbc_aches_label.anchor = GridBagConstraints.WEST;
		gbc_aches_label.insets = new Insets(0, 0, 5, 5);
		gbc_aches_label.gridx = 0;
		gbc_aches_label.gridy = 4;
		contentPane.add(aches_label, gbc_aches_label);
		
		//creating button group for aches
		ButtonGroup AchesGroup = new ButtonGroup();
		
		JRadioButton aches_yes_radio = new JRadioButton("Yes");
		GridBagConstraints gbc_aches_yes_radio = new GridBagConstraints();
		gbc_aches_yes_radio.anchor = GridBagConstraints.WEST;
		gbc_aches_yes_radio.insets = new Insets(0, 0, 5, 5);
		gbc_aches_yes_radio.gridx = 0;
		gbc_aches_yes_radio.gridy = 5;
		contentPane.add(aches_yes_radio, gbc_aches_yes_radio);
		
		//adding the aches yes button to group
		AchesGroup.add(aches_yes_radio);
		
		JRadioButton aches_no_radio = new JRadioButton("No");
		GridBagConstraints gbc_aches_no_radio = new GridBagConstraints();
		gbc_aches_no_radio.anchor = GridBagConstraints.WEST;
		gbc_aches_no_radio.insets = new Insets(0, 0, 5, 5);
		gbc_aches_no_radio.gridx = 1;
		gbc_aches_no_radio.gridy = 5;
		contentPane.add(aches_no_radio, gbc_aches_no_radio);
		
		//adding the aches no button to group
		AchesGroup.add(aches_no_radio);
		
		JLabel sore_throat_label = new JLabel("Sore Throat:");
		GridBagConstraints gbc_sore_throat_label = new GridBagConstraints();
		gbc_sore_throat_label.anchor = GridBagConstraints.WEST;
		gbc_sore_throat_label.insets = new Insets(0, 0, 5, 5);
		gbc_sore_throat_label.gridx = 0;
		gbc_sore_throat_label.gridy = 6;
		contentPane.add(sore_throat_label, gbc_sore_throat_label);

		//creating the sore throat radio button group
		ButtonGroup SoreThroatGroup = new ButtonGroup();
		
		JRadioButton sore_throat_yes_radio = new JRadioButton("Yes");
		GridBagConstraints gbc_sore_throat_yes_radio = new GridBagConstraints();
		gbc_sore_throat_yes_radio.anchor = GridBagConstraints.WEST;
		gbc_sore_throat_yes_radio.insets = new Insets(0, 0, 5, 5);
		gbc_sore_throat_yes_radio.gridx = 0;
		gbc_sore_throat_yes_radio.gridy = 7;
		contentPane.add(sore_throat_yes_radio, gbc_sore_throat_yes_radio);
		
		//adding yes radio button to group
		SoreThroatGroup.add(sore_throat_yes_radio);
		
		JRadioButton sore_throat_no_radio = new JRadioButton("No");
		GridBagConstraints gbc_sore_throat_no_radio = new GridBagConstraints();
		gbc_sore_throat_no_radio.anchor = GridBagConstraints.WEST;
		gbc_sore_throat_no_radio.insets = new Insets(0, 0, 5, 5);
		gbc_sore_throat_no_radio.gridx = 1;
		gbc_sore_throat_no_radio.gridy = 7;
		contentPane.add(sore_throat_no_radio, gbc_sore_throat_no_radio);
		
		//adding no radio button to group
		SoreThroatGroup.add(sore_throat_no_radio);
		
		JLabel cough_label = new JLabel("Cough: ");
		GridBagConstraints gbc_cough_label = new GridBagConstraints();
		gbc_cough_label.anchor = GridBagConstraints.WEST;
		gbc_cough_label.insets = new Insets(0, 0, 5, 5);
		gbc_cough_label.gridx = 0;
		gbc_cough_label.gridy = 8;
		contentPane.add(cough_label, gbc_cough_label);
		
		//creating group for cough radio buttons
		ButtonGroup CoughGroup = new ButtonGroup();
		
		JRadioButton cough_yes_radio = new JRadioButton("Yes");
		GridBagConstraints gbc_cough_yes_radio = new GridBagConstraints();
		gbc_cough_yes_radio.anchor = GridBagConstraints.WEST;
		gbc_cough_yes_radio.insets = new Insets(0, 0, 5, 5);
		gbc_cough_yes_radio.gridx = 0;
		gbc_cough_yes_radio.gridy = 9;
		contentPane.add(cough_yes_radio, gbc_cough_yes_radio);
		
		//adding yes radio button to group
		CoughGroup.add(cough_yes_radio);
		
		JRadioButton cough_no_radio = new JRadioButton("No");
		GridBagConstraints gbc_cough_no_radio = new GridBagConstraints();
		gbc_cough_no_radio.anchor = GridBagConstraints.WEST;
		gbc_cough_no_radio.insets = new Insets(0, 0, 5, 5);
		gbc_cough_no_radio.gridx = 1;
		gbc_cough_no_radio.gridy = 9;
		contentPane.add(cough_no_radio, gbc_cough_no_radio);
		
		//adding no radio button to group
		CoughGroup.add(cough_no_radio);
		
		JLabel danger_label = new JLabel("Travelled To Danger");
		GridBagConstraints gbc_danger_label = new GridBagConstraints();
		gbc_danger_label.insets = new Insets(0, 0, 5, 5);
		gbc_danger_label.gridx = 0;
		gbc_danger_label.gridy = 10;
		contentPane.add(danger_label, gbc_danger_label);
		
		JLabel zone_label = new JLabel(" Zone Recently?:  ");
		GridBagConstraints gbc_zone_label = new GridBagConstraints();
		gbc_zone_label.insets = new Insets(0, 0, 5, 5);
		gbc_zone_label.gridx = 0;
		gbc_zone_label.gridy = 11;
		contentPane.add(zone_label, gbc_zone_label);
		
		//Creating new ButtonGroup for yes no for danger zone
		ButtonGroup DangerZoneGroup = new ButtonGroup();
		
		JRadioButton danger_yes_radio = new JRadioButton("Yes");
		GridBagConstraints gbc_danger_yes_radio = new GridBagConstraints();
		gbc_danger_yes_radio.anchor = GridBagConstraints.WEST;
		gbc_danger_yes_radio.insets = new Insets(0, 0, 5, 5);
		gbc_danger_yes_radio.gridx = 0;
		gbc_danger_yes_radio.gridy = 12;
		contentPane.add(danger_yes_radio, gbc_danger_yes_radio);
		
		//adding yes radio button to danger zone group
		DangerZoneGroup.add(danger_yes_radio);
		
		JRadioButton danger_no_radio = new JRadioButton("No");
		GridBagConstraints gbc_danger_no_radio = new GridBagConstraints();
		gbc_danger_no_radio.anchor = GridBagConstraints.WEST;
		gbc_danger_no_radio.insets = new Insets(0, 0, 5, 5);
		gbc_danger_no_radio.gridx = 1;
		gbc_danger_no_radio.gridy = 12;
		contentPane.add(danger_no_radio, gbc_danger_no_radio);
		
		//adding no radio button to danger zone group
		DangerZoneGroup.add(danger_no_radio);
		
		JButton check_prob_button = new JButton("Find Probability");
		
		check_prob_button.addMouseListener(new MouseAdapter() 
		{
		@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getSource() == check_prob_button)
				{
					
					//boolean value to make sure user has filled in all radio values
					boolean complete = true;
					
					//creating a new case when the user presses check probability button
					Case UserInputCase = new Case("","","","","");
					
					//checking to see which temperature radio button is selected
					if (temp_hot_radio.isSelected())
					{
						UserInputCase.setTemperature("hot");
					}
					else if(temp_normal_radio.isSelected())
					{
						UserInputCase.setTemperature("normal");
					}
					else if(temp_cold_radio.isSelected())
					{
						UserInputCase.setTemperature("cold");
					}
					else
					{
						complete = false;
					}
					
					//checking to see what aches option is selected
					if (aches_yes_radio.isSelected())
					{
						UserInputCase.setAches("yes");
					}
					else if (aches_no_radio.isSelected())
					{
						UserInputCase.setAches("no");
					}
					else
					{
						complete = false;
					}
					
					//checking to see what sore throat option is selected
					if (sore_throat_yes_radio.isSelected())
					{
						UserInputCase.setSore_throat("yes");
					}
					else if (sore_throat_no_radio.isSelected())
					{
						UserInputCase.setSore_throat("no");
					}
					else
					{
						complete = false;
					}
					
					//checking to see which cough option is selected 
					if (cough_yes_radio.isSelected())
					{
						UserInputCase.setCough("yes");
					}
					else if (cough_no_radio.isSelected())
					{
						UserInputCase.setCough("no");
					}
					else
					{
						complete = false;
					}
					
					//checking to see which danger_zone is selected
					if (danger_yes_radio.isSelected())
					{
						UserInputCase.setDanger_zone("yes");
					}
					else if (danger_no_radio.isSelected())
					{
						UserInputCase.setDanger_zone("no");
					}
					else
					{
						complete = false;
					}
					
					
				}
			}
		});
		
		GridBagConstraints gbc_check_prob_button = new GridBagConstraints();
		gbc_check_prob_button.insets = new Insets(0, 0, 0, 5);
		gbc_check_prob_button.gridx = 1;
		gbc_check_prob_button.gridy = 13;
		contentPane.add(check_prob_button, gbc_check_prob_button);
	}

}
