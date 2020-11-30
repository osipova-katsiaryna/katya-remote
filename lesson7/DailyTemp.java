package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyTemp {

	@JsonProperty(value = "Minimum")
	private Temperature min;
	
	@JsonProperty(value = "Maximum")
	private Temperature max;

	public Temperature getMin() {
		return min;
	}

	public void setMin(Temperature min) {
		this.min = min;
	}

	public Temperature getMax() {
		return max;
	}

	public void setMax(Temperature max) {
		this.max = max;
	}
	
	
}
