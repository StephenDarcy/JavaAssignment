package com.naivebayes.assignment;

import java.util.ArrayList;

public class TestData {
	
	ArrayList<Case> passedSet = new ArrayList<Case>();
	ArrayList<Case> trainingSet = new ArrayList<Case>();
	ArrayList<Case> testSet = new ArrayList<Case>();
	
	private float accuracy;
	private float correct;
	
	public TestData(Dataset passedDataset)
	{
		//converting passed dataset to a array list of cases
		passedDataset.openFile();
		passedSet = passedDataset.convertFile();
	}
	
	void countCorrect()
	{
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
		
		setAccuracy(Math.round(correct/testSet.size() * 100));
		
		//emptying the passed data set as it will be refilled
		passedSet.removeAll(passedSet);
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}


}
