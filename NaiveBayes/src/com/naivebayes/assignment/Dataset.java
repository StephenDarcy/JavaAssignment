package com.naivebayes.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/********************************************************************************************************************************************
 * Naive Bayes ML Assignment																																		
 * Class: Dataset
 * Description: This main purpose of this class is to return an ArrayList of Case objects using its convertFile() method. Much of this 
 * class is similar to the FileProccessor class 
 ********************************************************************************************************************************************/

public class Dataset
{
	//creating the variables a dataset object needs
	private String filename;
	private File file1;
	private Scanner myScanner;
	private ArrayList<Case> training_set = new ArrayList<Case>();
	
	//constructor for a dataset object, whatever string is passed will be used to create a file
	public Dataset(String filename)
	{
		setFilename(filename); 
		file1 = new File(filename);
	}
			
	//method to convert the csv file to an array list. This array list is populated with Cases. Each case is also populated with the 
	//associated factors e.g. cough, temperature
	public ArrayList<Case> convertFile()
	{
		//start of try incase file name is invalid
		try 
		{
			//creating a scanner
			Scanner myScanner = new Scanner(file1);
			
			//while loop that runs until there is no new lines in the csv file
			while(myScanner.hasNextLine())
			{
				//adds each line of the csv file to a string
				String line = myScanner.nextLine();
				
				//splits each factor by a comma and adds to an array
				String[] factor = line.split(",");
				
				//adds each member of the array in the format of a case object into an arrayList
				getTraining_set().add(new Case(factor[0],factor[1],factor[2],factor[3],factor[4],factor[5]));
				
			}//end of while
			
			//closing scanner
			myScanner.close();
		} 
		
		//catch method so program wont crash
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
			System.out.println("Error file not found!");
			
		}
		
		//returns the arrayList when this method is called
		return getTraining_set();
		
	} //end of convertFile()
		
	//getters and setters 
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public File getFile1() {
		return file1;
	}

	public void setFile1(File file1) {
		this.file1 = file1;
	}

	public Scanner getMyScanner() {
		return myScanner;
	}

	public void setMyScanner(Scanner myScanner) {
		this.myScanner = myScanner;
	}

	private ArrayList<Case> getTraining_set() {
		return training_set;
	}
}