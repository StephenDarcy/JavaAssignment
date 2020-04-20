package com.naivebayes.assignment;

/********************************************************************************************************************************************
 * Naive Bayes ML Assignment																												*
 * Class: GuiFile																															*
 * Description: Class that display a Gui screen called GuiFile. This has 3 buttons that allows the user to select which dataset they	 	* 
 * want to use.																																*												
 * 																																			*	
 ********************************************************************************************************************************************/

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("serial")
public class GuiFile extends JFrame {

	//creating JPanel
	private JPanel contentPane  = new JPanel();;

	//Creating JButtons
	JButton small_button = new JButton("Small Dataset");
	JButton default_button = new JButton("Defaut Dataset");
	JButton large_button = new JButton("Large Dataset");
	
	//Creating JLabels
	JLabel small_label = new JLabel("30 Cases");
	JLabel default_label = new JLabel("76 Cases");
	JLabel large_label = new JLabel("Over 150 Cases");
	
	public GuiFile() 
	{
		//setting the size of the frame
		setBounds(100, 100, 450, 300);
		
		//setting the border and layout of the panel
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//adding a MouseListener for small_button
		small_button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getSource() == small_button)
				{
					//setting the file in use to the small.csv dataset if this button is pressed
					Control.setFile_in_use("small.csv");
					
					//disposing of the frame
					dispose();
				}
			}
		});
		
		//setting the font and position of the small button label
		small_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		small_button.setBounds(125, 52, 165, 39);
		contentPane.add(small_button);
		
		//adding a MouseListener for default_button
		default_button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if(e.getSource() == default_button)
				{
					//setting the file in use to the MLdata.csv dataset if this button is pressed
					Control.setFile_in_use("MLdata.csv");
					
					//disposing of the frame
					dispose();
				}
			}
		});
		
		//setting the font and position of the default button
		default_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		default_button.setBounds(125, 118, 165, 39);
		contentPane.add(default_button);
		
		//adding a MouseListener for the large_button
		large_button.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				if (e.getSource() == large_button)
				{
					//setting the file in use to the big.csv dataset if this button is pressed
					Control.setFile_in_use("big.csv");
					
					//disposing of the frame
					dispose();
					
				}
			}
		});
		
		//setting the font and position of the large_button
		large_button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		large_button.setBounds(125, 185, 165, 39);
		contentPane.add(large_button);
		
		//setting the font and position of the small_label
		small_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		small_label.setBounds(125, 35, 78, 14);
		contentPane.add(small_label);
		
		//setting the font and position of the default_label
		default_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		default_label.setBounds(125, 101, 78, 14);
		contentPane.add(default_label);
		
		//setting the font and position of the large_label
		large_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		large_label.setBounds(125, 167, 105, 14);
		contentPane.add(large_label);
		
		//making the frame visible
		setVisible(true);
	}
}
