package com.naivebayes.assignment;

public class Control {

	public static void main(String[] args) 
	{
		Converter file = new Converter("MLdata.csv");
		file.openFile();
		
		Case newinput = new Case("hot","yes","yes","yes","yes");
		
		NaiveBayes test = new NaiveBayes(newinput,file);
		System.out.println(test);
	}

}
