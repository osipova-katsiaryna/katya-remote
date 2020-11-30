package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HourForecast {
	
	@JsonProperty(value = "DateTime")
	private String dateTime;
	
	@JsonProperty(value = "IconPhrase")
	private String iconPhrase;
	
	@JsonProperty(value = "Temperature")
	private Temperature temperature;

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getIconPhrase() {
		return iconPhrase;
	}

	public void setIconPhrase(String iconPhrase) {
		this.iconPhrase = iconPhrase;
	}

	public Temperature getTemperature() {
		return temperature;
	}

	public void setTemperature(Temperature temperature) {
		this.temperature = temperature;
	}

}
