package com.naivebayes.assignment;
/********************************************************************************************************************************************
 * Naive Bayes ML Assignment																												*
 * Class: Control																															*
 * Description: This class simply declares a static file 'file_in_use'. This is used in other classes when the user chooses to change		*
 * the current file. This class also calles the gui class to generate the frame																*
 * 																																			*
 * Author: Stephen Darcy (C18490924)																										*
 * Date: March - April 2020																													*
 * Compiler: Eclipse 2020-03																												*
 * Plugins: WindowBuilder																													*
 * 																																			*
 ********************************************************************************************************************************************/


public class Control 
{
	
	//had to use a a static variable as I could not access a normal string across the two GUI classes
	//default file is MLdata.csv 
	static String file_in_use = "MLdata.csv";

	//start of main method
	public static void main(String[] args) 
	{
		
		//calling the gui class to generate frame
		@SuppressWarnings("unused")
		GUI frame = new GUI();
		
	}//end of main

	
	//getters and setters
	public static String getFile_in_use() 
	{
		return file_in_use;
	}

	public static void setFile_in_use(String file_in_use) 
	{
		Control.file_in_use = file_in_use;
	}
	

} //end of Control
