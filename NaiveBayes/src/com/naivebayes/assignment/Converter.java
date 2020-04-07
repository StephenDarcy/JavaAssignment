package com.naivebayes.assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Converter 
{
	private String filename;
	private File file1;
	private Scanner myScanner;
	private ArrayList<Case> training_set = new ArrayList<Case>();
		
	public Converter(String filename)
	{
		this.setFilename(filename); 
		
	}
	
	public void openFile()
	{
		file1 = new File(filename);
	}
		
	//method to convert the csv file to an array list. This array list is populated with Cases. Each case is also populated with the 
	//associated factors e.g. cough, temperature
	public ArrayList<Case> convertFile()
	{
		try 
		{
			Scanner myScanner = new Scanner(file1);
			while(myScanner.hasNextLine())
			{
				String line = myScanner.nextLine();
				String[] factor = line.split(",");
				
				getTraining_set().add(new Case(factor[0],factor[1],factor[2],factor[3],factor[4],factor[5]));		
			}
			myScanner.close();
		} 
		catch (FileNotFoundException e) 
		{		
			e.printStackTrace();
		}
		return getTraining_set();
	}
		
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