package lesson7;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyResult {

	@JsonProperty(value = "DailyForecasts")
	private List<DailyForecast> days;

	public List<DailyForecast> getDays() {
		return days;
	}

	public void setDays(List<DailyForecast> days) {
		this.days = days;
	}
}
