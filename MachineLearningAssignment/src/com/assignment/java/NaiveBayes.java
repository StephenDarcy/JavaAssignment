package com.assignment.java;

import java.util.ArrayList;


//https://stackoverflow.com/questions/10059594/a-simple-explanation-of-naive-bayes-classification
//Used this website to help me understand Naive Bayes


public class NaiveBayes 
{
	//all factors
	private String temperature;
	private String aches;
	private String cough;
	private String sore_throat;
	private String danger_zone;
	
	//counting positives and negative results
	private int covid_positive = 0;
	private int covid_negative = 0;
	
	//counting factors with positive
	private int temperature_positive = 0;
	private int aches_positive = 0;
	private int cough_positive = 0;
	private int sore_throat_positive = 0;	
	private int danger_zone_positive = 0;
	
	//counting factors with negative
	private int temperature_negative = 0;
	private int aches_negative = 0;
	private int cough_negative = 0;
	private int sore_throat_negative = 0;
	private int danger_zone_negative = 0;
	
	//Prior Probabilities
	private float total_cases = 0;
	private float total_positive = 0;
	private float total_negative = 0;
	
	
	
	//ArrayList to store the training set
	ArrayList<Case> training_set = new ArrayList<Case>();

	public NaiveBayes(String temperature, String aches, String cough, String sore_throat, String danger_zone)
	{
		
		this.setTemperature(temperature);
		this.setAches(aches);
		this.setCough(cough);
		this.setDanger_zone(danger_zone);
		this.setSore_throat(sore_throat);
		
		
		//opening the file and adding to training set using CSVtoArray class
		CSVtoArray file1 = new CSVtoArray("MLdata.csv");
		file1.openFile();
		training_set = file1.convertFile();
		
	}
	
	
	//Method to count negative and positive results that had aches
	public void AchesCount() 
	{
		//https://stackoverflow.com/questions/12809009/accessing-an-object-class-variable-in-arraylist-java
		//website I used to learn about ArrayList methods
		
		for (int i = 0;i<training_set.size();i++)
		{
			if (training_set.get(i).getAches() == "yes" && training_set.get(i).getHas_covid() == "yes")
			{
				aches_positive++;
			}
			else
			{
				aches_negative++;
			}
		}
	}
	
	//method to count negative and positive results that had a cough
	public void CoughCount() 
	{
		
		for (int i = 0;i<training_set.size();i++)
		{
			if (training_set.get(i).getCough() == "yes" && training_set.get(i).getHas_covid() == "yes")
			{
				cough_positive++;
			}
			else
			{
				cough_negative++;
			}
		}
	}
	
	//method to count negative and positive results that had a sore throat
	public void SoreThroatCount() 
	{
		
		for (int i = 0;i<training_set.size();i++)
		{
			if (training_set.get(i).getSore_throat() == "yes" && training_set.get(i).getHas_covid() == "yes")
			{
				sore_throat_positive++;
			}
			else
			{
				sore_throat_negative++;
			}
		}
	}
	
	
	
	//method to count negative and positive results that had a temperature
	public void TemperatureCount() 
	{
		
		for (int i = 0;i<training_set.size();i++)
		{
			if (training_set.get(i).getTemperature() == "yes" && training_set.get(i).getHas_covid() == "yes")
			{
				temperature_positive++;
			}
			else
			{
				temperature_negative++;
			}
		}
	}
	
	//method to count negative and positive results that had travelled to a danger zone
	public void DangerZoneCount() 
	{
		
		for (int i = 0;i<training_set.size();i++)
		{
			if (training_set.get(i).getDanger_zone() == "yes" && training_set.get(i).getHas_covid() == "yes")
			{
				danger_zone_positive++;
			}
			else
			{
				danger_zone_negative++;
			}
		}
	}
	
	
	
	//getters and setters

	private String getTemperature() {
		return temperature;
	}

	private void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	private String getAches() {
		return aches;
	}

	private void setAches(String aches) {
		this.aches = aches;
	}

	private String getCough() {
		return cough;
	}

	private void setCough(String cough) {
		this.cough = cough;
	}

	private String getSore_throat() {
		return sore_throat;
	}

	private void setSore_throat(String sore_throat) {
		this.sore_throat = sore_throat;
	}

	private String getDanger_zone() {
		return danger_zone;
	}

	private void setDanger_zone(String danger_zone) {
		this.danger_zone = danger_zone;
	}
	
	
	
	
	
}
