package com.naivebayes.assignment;

/********************************************************************************************************************************************
 * Naive Bayes ML Assignment																												*
 * Class: TestData																															*
 * Description: Class that calculates the accuract of a dataset that is passed to it. It does this by splitting the dataset into 70% to be	* 
 * trained on and 30% to be tested on. If the test set is >50% result and has COVID-19 this is a correct guess and vice versa.				*												
 * 																																			*																		
 ********************************************************************************************************************************************/

import java.util.ArrayList;

public class TestData {
	
	//creating the arrayLists
	ArrayList<Case> passedSet = new ArrayList<Case>();
	ArrayList<Case> trainingSet = new ArrayList<Case>();
	ArrayList<Case> testSet = new ArrayList<Case>();
	
	//creating the variables
	private float accuracy;
	private float correct;
	
	//constructor
	public TestData(Dataset passedDataset)
	{
		//converting passed dataset to a array list of cases
		passedSet = passedDataset.convertFile();
	}
	
	//counting the accuracy 
	void countCorrect()
	{
		//emptying the arrayLists 
		testSet.removeAll(testSet);
		trainingSet.removeAll(trainingSet);
		
		//setting variables to zero
		accuracy = 0;
		correct = 0;
		
		//splitting passed dataset into 70% for training set and 30% to be tested 
		for (int i = 0; i < Math.round(passedSet.size() * .7); i++)
		{
			trainingSet.add(passedSet.get(i));
		}
		for (float i = Math.round(passedSet.size() * .7); i < Math.round(passedSet.size()); i++)
		{
			testSet.add(passedSet.get((int) i));
		}
		
		//checking to see how accurate the testSet is using the trainingSet. They are both passed to the NaiveBayes Class.
		for (int i = 0; i< testSet.size();i++)
		{
			NaiveBayes test = new NaiveBayes(testSet.get(i), trainingSet);
			
			if (test.getPositive_probability() >= 50 && testSet.get(i).getHas_covid().contains("yes"))
			{
				correct++;
			}
			else if (test.getPositive_probability() <= 50 && testSet.get(i).getHas_covid().contains("no"))
			{
				correct++;
			}
		}
		
		//setting the accuracy to a percentage 
		setAccuracy(Math.round(correct/testSet.size() * 100));
		
		//emptying the passed data set as it will be refilled
		passedSet.removeAll(passedSet);
	}
	
	//getters and setters

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}


}
