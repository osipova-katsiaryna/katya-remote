package lesson7;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {
	
	@JsonProperty(value = "Key")
	String Key;

	public String getKey() {
		return Key;
	}

	public void setKey(String key) {
		Key = key;
	}	
	
}
