package lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// http://worldtimeapi.org/api/timezone/America/Argentina/Salta
public class AccuWeatherApp {

	public static void main(String[] args) throws IOException {
		String cityCode = AccuWeatherApp.readCity();
		String duration = AccuWeatherApp.readDuration();
		String forecastJson = AccuWeatherApp.getForecastJson(cityCode, duration);

		ObjectMapper objectMapper = new ObjectMapper();
		if ("hourly/12hour".equals(duration)) {
			List<HourForecast> byHour = objectMapper.readValue(forecastJson, new TypeReference<List<HourForecast>>() {});
			for (HourForecast hf : byHour) {
				System.out.println("Time: " + hf.getDateTime() + ", weather: " + hf.getIconPhrase()
					+ ", T: " + hf.getTemperature().getValue() + "C");
			}
		} else {
			DailyResult byDays = objectMapper.readValue(forecastJson, new TypeReference<DailyResult>() {});
			for (DailyForecast day : byDays.getDays()) {
				System.out.println("Day: " + day.getDate() + ", weather: " + day.getDay().getIconPhrase()
						+ ", min: " + day.getDailyTemp().getMin().getValue() + "C" 
						+ ", max: " + day.getDailyTemp().getMax().getValue() + "C");
			}
		}
	}

	public static String readCity() throws IOException {
		String code = null;
		System.out.println("Enter city name");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (code == null) {
			String city = reader.readLine();
			code = AccuWeatherApp.getCityCode(city);
			if (code == null) {
				System.out.print("City is not found. Try another name.");
			}
		}

		return code;
	}

	public static String getCityCode(String city) throws IOException {
		if (city == null || city.length() <= 1) {
			return null;
		}
		String cityInfoJson = AccuWeatherApp.getJsonString("locations/v1/cities/search?q=" + city);
		ObjectMapper objectMapper = new ObjectMapper();
		List<City> cityList = objectMapper.readValue(cityInfoJson, new TypeReference<List<City>>() {
		});
		return cityList == null || cityList.size() == 0 ? null : cityList.get(0).getKey();
	}

	public static String readDuration() throws IOException {
		System.out.println("Enter 'd' for 5 days or anything else for 12 hours period");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String duration = reader.readLine();
		return "d".equals(duration) ? "daily/5day" : "hourly/12hour";
	}

	public static String getForecastJson(String cityCode, String duration) throws IOException {
		String path = "/forecasts/v1/" + duration + "/" + cityCode + "?metric=true";
		return AccuWeatherApp.getJsonString(path);
	}

	// location:
	// http://dataservice.accuweather.com/locations/v1/cities/search?apikey=B72ZqRK2kC20JziwJVn4mSxBU3MLk0Hj&q=Minsk
	// 12h:
	// http://dataservice.accuweather.com/forecasts/v1/hourly/12hour/28580?apikey=B72ZqRK2kC20JziwJVn4mSxBU3MLk0Hj&metric=true
	// 5 days:
	// http://dataservice.accuweather.com/forecasts/v1/daily/5day/28580?apikey=B72ZqRK2kC20JziwJVn4mSxBU3MLk0Hj&metric=true
	public static String getJsonString(String path) throws IOException {
		OkHttpClient client = new OkHttpClient();
		Request request = new Request.Builder()
				.url("http://dataservice.accuweather.com/" + path + "&apikey=B72ZqRK2kC20JziwJVn4mSxBU3MLk0Hj").build();
		Response resp = client.newCall(request).execute();
		String body = resp.body().string();
		return body;
	}

}
