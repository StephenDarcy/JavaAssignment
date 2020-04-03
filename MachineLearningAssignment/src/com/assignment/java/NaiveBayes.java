package com.assignment.java;

import java.util.ArrayList;

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
