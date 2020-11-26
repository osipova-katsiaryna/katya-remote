package lesson6;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

// http://worldtimeapi.org/api/timezone/America/Argentina/Salta
public class Weather {
	
	public static void main(String[] args) throws IOException {
		Weather.getJson();		
	}
	
	public static void getJson() throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/28580?apikey=B72ZqRK2kC20JziwJVn4mSxBU3MLk0Hj&metric=true")
                .build();
        
        Response resp = client.newCall(request).execute();
        String body = resp.body().string();        
        System.out.println("Minsk 5 days weather");
        System.out.println(body);


	}

}
