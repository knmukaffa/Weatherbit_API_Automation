package starter.Weatherbit;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.Utils.Constants;

public class WeatherbitAPI {

    @Step("Get current weather")
    public void getCurrentWeather(String lat, String lon){
        SerenityRest.given().pathParam("lat", lat)
                .pathParam("lon", lon)
                .pathParam("key", Constants.api_key);
    }

    @Step("Get forecast")
    public void getforecast(String postalcode){
        SerenityRest.given().pathParam("postal_code", postalcode)
                .pathParam("key", Constants.api_key);
    }
}
