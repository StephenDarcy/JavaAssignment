package com.naivebayes.assignment;

import java.util.ArrayList;

//https://stackoverflow.com/questions/10059594/a-simple-explanation-of-naive-bayes-classification
//Used this website to help me understand Naive Bayes
//https://stackoverflow.com/questions/12809009/accessing-an-object-class-variable-in-arraylist-java
//website I used to learn about ArrayList methods
//Did not copy any code from these websites

public class NaiveBayes 
{
	//all factors
	private String temperature, aches, cough, sore_throat, danger_zone;
	
	//counting factors with positive
	private float temperature_positive, aches_positive, cough_positive, sore_throat_positive, danger_zone_positive;

	//counting factors with negative
	private float temperature_negative, aches_negative, cough_negative, sore_throat_negative, danger_zone_negative;

	//Prior Probabilities
	private float total_cases, total_positive, total_negative;
	
	//For calculating results
	private float probability_overall, negative_probability, positive_probability, negative_total, positive_total;
	
	//final result after rounding
	private int finalValue;
	
	//ArrayList to store the training set
	ArrayList<Case> training_set = new ArrayList<Case>();

	//constructor for naivebayes class with no knowledge of case is positive or not
	public NaiveBayes(Case input, Dataset file)
	{
		this.setTemperature(input.getTemperature());
		this.setAches(input.getAches());
		this.setCough(input.getCough());
		this.setDanger_zone(input.getDanger_zone());
		this.setSore_throat(input.getSore_throat());
		
		file.openFile();
		training_set = file.convertFile();
		
		Calculate();
	}
	
	
	public String toString()
	{
		String covid_chance = "Probability of testing positive for COVID-19: " + getPositive_probability();
		return covid_chance;
	}
	
	public void Classifier()
	{
		
		positive_total = (temperature_positive/total_positive)*(aches_positive/total_positive)*(sore_throat_positive/total_positive)*
				(cough_positive/total_positive)*(danger_zone_positive/total_positive)*(total_positive/total_cases);
		
		negative_total = (temperature_negative/total_negative)*(aches_negative/total_negative)*(sore_throat_negative/total_negative)*
				(cough_negative/total_negative)*(danger_zone_negative/total_negative)*(total_negative/total_cases);
		
		setPositive_probability((positive_total/(positive_total+negative_total))*100);
		
		//changing to a integer that is rounded
		setFinalValue(Math.round(getPositive_probability()));
		
	}
	
	public void Calculate()
	{
		setTotal_cases(training_set.size());
		
		CovidCount();
		AchesCount();
		CoughCount();
		SoreThroatCount();
		TemperatureCount();
		DangerZoneCount();
		
		Classifier();
	}
	
	public void CovidCount()
	{
		setTotal_positive(0);
		setTotal_negative(0);
		
		for (int i = 0;i<training_set.size();i++)
		{
			boolean covid_true = training_set.get(i).getHas_covid().contains("yes");
			if (covid_true)
			{
				setTotal_positive(getTotal_positive() + 1);
			}
			else
			{
				setTotal_negative(getTotal_negative() + 1);
			}
		}
	}
	
	
	//Method to count negative and positive results that had aches
	public void AchesCount() 
	{
		setAches_positive(0);
		setAches_negative(0);
		
		for (int i = 0;i<training_set.size();i++)
		{
			boolean covid_true_aches = training_set.get(i).getHas_covid().contains("yes");
			boolean aches_true = training_set.get(i).getAches().contains(aches);
			boolean covid_false_aches = training_set.get(i).getHas_covid().contains("no");
			
			if (covid_true_aches && aches_true)
			{
				setAches_positive(getAches_positive() + 1);
			}
			else if(aches_true && covid_false_aches)
			{
				setAches_negative(getAches_negative() + 1);
			}
		}
	}
	
	//method to count negative and positive results that had a cough
	public void CoughCount() 
	{
		setCough_positive(0);
		setCough_negative(0);
		
		for (int i = 0;i<training_set.size();i++)
		{
			boolean covid_true_cough = training_set.get(i).getHas_covid().contains("yes");
			boolean cough_true = training_set.get(i).getCough().contains(cough);
			boolean covid_false_cough = training_set.get(i).getHas_covid().contains("no");
			
			if (covid_true_cough && cough_true)
			{
				setCough_positive(getCough_positive() + 1);
			}
			else if(covid_false_cough && cough_true)
			{
				setCough_negative(getCough_negative() + 1);
			}
		}
	}
	
	//method to count negative and positive results that had a sore throat
	public void SoreThroatCount() 
	{
		setSore_throat_positive(0);
		setSore_throat_negative(0);
		
		for (int i = 0;i<training_set.size();i++)
		{
			boolean sore_throat_true = training_set.get(i).getSore_throat().contains(sore_throat);
			boolean covid_true_sore_throat = training_set.get(i).getHas_covid().contains("yes");
			boolean covid_false_sore_throat = training_set.get(i).getHas_covid().contains("no");
			
			if (sore_throat_true && covid_true_sore_throat)
			{
				setSore_throat_positive(getSore_throat_positive() + 1);
			}
			else if(covid_false_sore_throat && sore_throat_true)
			{
				setSore_throat_negative(getSore_throat_negative() + 1);
			}
		}
	}
	
	//method to count negative and positive results that had a temperature
	public void TemperatureCount() 
	{
		setTemperature_negative(0);
		setTemperature_positive(0);
		
		for (int i = 0;i<training_set.size();i++)
		{
			boolean covid_true_temperature = training_set.get(i).getHas_covid().contains("yes");
			boolean temperature_true = training_set.get(i).getTemperature().contains(temperature);
			boolean covid_false_temperature = training_set.get(i).getHas_covid().contains("no");
			
			if (covid_true_temperature && temperature_true)
			{
				setTemperature_positive(getTemperature_positive() + 1);
			}
			else if(covid_false_temperature && temperature_true)
			{
				setTemperature_negative(getTemperature_negative() + 1);
			}
		}
	}
	
	//method to count negative and positive results that had travelled to a danger zone
	public void DangerZoneCount() 
	{
		setDanger_zone_positive(0);
		setDanger_zone_negative(0);
		
		for (int i = 0;i<training_set.size();i++)
		{
			boolean covid_true_danger_zone = training_set.get(i).getHas_covid().contains("yes");
			boolean danger_zone_true = training_set.get(i).getDanger_zone().contains(danger_zone);
			boolean covid_false_danger_zone = training_set.get(i).getHas_covid().contains("no");
			
			if (covid_true_danger_zone && danger_zone_true)
			{
				setDanger_zone_positive(getDanger_zone_positive() + 1);
			}
			else if(covid_false_danger_zone && danger_zone_true)
			{
				setDanger_zone_negative(getDanger_zone_negative() + 1);
			}
		}
	}
	
	//getters and setters
	private void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	private void setAches(String aches) {
		this.aches = aches;
	}

	private void setCough(String cough) {
		this.cough = cough;
	}

	private void setSore_throat(String sore_throat) {
		this.sore_throat = sore_throat;
	}

	private void setDanger_zone(String danger_zone) {
		this.danger_zone = danger_zone;
	}


	public float getTemperature_positive() {
		return temperature_positive;
	}


	public void setTemperature_positive(float temperature_positive) {
		this.temperature_positive = temperature_positive;
	}


	public float getAches_positive() {
		return aches_positive;
	}


	public void setAches_positive(float aches_positive) {
		this.aches_positive = aches_positive;
	}


	public float getCough_positive() {
		return cough_positive;
	}


	public void setCough_positive(float cough_positive) {
		this.cough_positive = cough_positive;
	}


	public float getSore_throat_positive() {
		return sore_throat_positive;
	}


	public void setSore_throat_positive(float sore_throat_positive) {
		this.sore_throat_positive = sore_throat_positive;
	}


	public float getDanger_zone_positive() {
		return danger_zone_positive;
	}


	public void setDanger_zone_positive(float danger_zone_positive) {
		this.danger_zone_positive = danger_zone_positive;
	}


	public float getTemperature_negative() {
		return temperature_negative;
	}


	public void setTemperature_negative(float temperature_negative) {
		this.temperature_negative = temperature_negative;
	}


	public float getAches_negative() {
		return aches_negative;
	}


	public void setAches_negative(float aches_negative) {
		this.aches_negative = aches_negative;
	}


	public float getCough_negative() {
		return cough_negative;
	}


	public void setCough_negative(float cough_negative) {
		this.cough_negative = cough_negative;
	}


	public float getTotal_cases() {
		return total_cases;
	}


	public void setTotal_cases(float total_cases) {
		this.total_cases = total_cases;
	}


	public float getTotal_positive() {
		return total_positive;
	}


	public void setTotal_positive(float total_positive) {
		this.total_positive = total_positive;
	}


	public float getTotal_negative() {
		return total_negative;
	}


	public void setTotal_negative(float total_negative) {
		this.total_negative = total_negative;
	}


	public float getSore_throat_negative() {
		return sore_throat_negative;
	}


	public void setSore_throat_negative(float sore_throat_negative) {
		this.sore_throat_negative = sore_throat_negative;
	}


	public float getDanger_zone_negative() {
		return danger_zone_negative;
	}


	public void setDanger_zone_negative(float danger_zone_negative) {
		this.danger_zone_negative = danger_zone_negative;
	}

	public float getProbability_overall() {
		return probability_overall;
	}

	public void setProbability_overall(float probability_overall) {
		this.probability_overall = probability_overall;
	}

	public float getNegative_probability() {
		return negative_probability;
	}

	public void setNegative_probability(float negative_probability) {
		this.negative_probability = negative_probability;
	}

	public float getPositive_probability() {
		return positive_probability;
	}

	public float setPositive_probability(float positive_probability) {
		this.positive_probability = positive_probability;
		return positive_probability;
	}

	public int getFinalValue() {
		return finalValue;
	}

	public void setFinalValue(int finalValue) {
		this.finalValue = finalValue;
	}
}