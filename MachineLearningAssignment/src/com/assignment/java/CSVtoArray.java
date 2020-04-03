package com.assignment.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CSVtoArray 
{
	private String filename;
	private File file1;
	private Scanner myScanner;
	
	public CSVtoArray(String filename)
	{
		this.setFilename(filename); 
		
	}
	
	void openFile()
	{
		setFile1(new File(getFilename()));
	}
	
	//making an array to store the CSV File
	List<List<String>> lines = new ArrayList<>();
	
	
	void convertFile()
	{
		try 
		{
			Scanner inputStream = new Scanner(file1);
			while(inputStream.hasNext())
			{
				String cell = inputStream.next();
				String[] training_set = cell.split(",");
				lines.add(Arrays.asList(training_set));
			}
			inputStream.close();
		} 
		catch (FileNotFoundException e) 
		{
		
			e.printStackTrace();
		}
		
	}
		
	void print()
	{
		int lineNo = 1;
        for(List<String> line: lines) {
            int columnNo = 1;
            for (String value: line) 
            {
                System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                columnNo++;
            }
            lineNo++;
        }
	}
	

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


}
