package com.naivebayes.assignment;

public class Case 
{
	private String temperature;
	private String aches;
	private String cough;
	private String sore_throat;
	private String danger_zone;
	private String has_covid;
	
	public Case (String temperature, String aches, String cough, String sore_throat, String danger_zone, String has_covid)
	{
		this.setAches(aches);
		this.setTemperature(temperature);
		this.setCough(cough);
		this.setSore_throat(sore_throat);
		this.setDanger_zone(danger_zone);
		this.setHas_covid(has_covid);
		
	}
	
	//other constructor for a user inputted case
	public Case (String temperature, String aches, String cough, String sore_throat, String danger_zone)
	{
		this.setAches(aches);
		this.setTemperature(temperature);
		this.setCough(cough);
		this.setSore_throat(sore_throat);
		this.setDanger_zone(danger_zone);		
	}
	
	//getters and setters
	
	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getAches() {
		return aches;
	}

	public void setAches(String aches) {
		this.aches = aches;
	}

	public String getCough() {
		return cough;
	}

	public void setCough(String cough) {
		this.cough = cough;
	}

	public String getSore_throat() {
		return sore_throat;
	}

	public void setSore_throat(String sore_throat) {
		this.sore_throat = sore_throat;
	}

	public String getDanger_zone() {
		return danger_zone;
	}

	public void setDanger_zone(String danger_zone) {
		this.danger_zone = danger_zone;
	}

	public String getHas_covid() {
		return has_covid;
	}

	public void setHas_covid(String has_covid) {
		this.has_covid = has_covid;
	}
	
	
}
