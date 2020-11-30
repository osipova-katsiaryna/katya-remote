package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "DailyForecasts")
public class DailyForecast {
	
	@JsonProperty(value = "Date")
	private String date;
	
	@JsonProperty(value = "Day")
	private DailyPhrase day;
	
	@JsonProperty(value = "Temperature")
	private DailyTemp dailyTemp;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public DailyPhrase getDay() {
		return day;
	}

	public void setDay(DailyPhrase day) {
		this.day = day;
	}

	public DailyTemp getDailyTemp() {
		return dailyTemp;
	}

	public void setDailyTemp(DailyTemp dailyTemp) {
		this.dailyTemp = dailyTemp;
	}
	
	
}
