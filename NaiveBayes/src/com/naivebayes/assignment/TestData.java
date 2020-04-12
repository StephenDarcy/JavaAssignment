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
		passedSet = passedDataset.convertFile();
		
		//splitting passed dataset into 70% for training set and 30% to be tested
		for (int i = 0; i < Math.round(passedSet.size() * .7); i++)
		{
			trainingSet.add(passedSet.get(i));
		}
		
		for (int i = Math.round(passedSet.size() * 7); i < Math.round(passedSet.size()); i++)
		{
			testSet.add(passedSet.get(i));
		}
	
		for (int i = 0; i< testSet.size();i++)
		{
			NaiveBayes test = new NaiveBayes(testSet.get(i), passedDataset);
			
			if (test.getPositive_probability() >= 50 && testSet.get(i).getHas_covid() == "yes")
			{
				correct++;
			}
			else if (test.getPositive_probability() <= 50 && testSet.get(i).getHas_covid() == "no")
			{
				correct++;
			}
		}
		
		setAccuracy(Math.round(correct/testSet.size() * 100)); 
	}

	public float getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(float accuracy) {
		this.accuracy = accuracy;
	}


}
