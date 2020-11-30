package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DailyPhrase {

	@JsonProperty(value = "IconPhrase")
	private String iconPhrase;

	public String getIconPhrase() {
		return iconPhrase;
	}

	public void setIconPhrase(String iconPhrase) {
		this.iconPhrase = iconPhrase;
	}
	
	
}
