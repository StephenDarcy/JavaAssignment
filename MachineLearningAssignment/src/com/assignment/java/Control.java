package com.assignment.java;

public class Control 
{

	public static void main(String[] args) 
	{
		CSVtoArray file1 = new CSVtoArray("MLdata.csv");
		file1.openFile();
		file1.convertFile();
		file1.print();
	}

}
