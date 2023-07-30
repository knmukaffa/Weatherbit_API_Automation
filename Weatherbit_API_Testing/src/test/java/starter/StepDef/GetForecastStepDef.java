package starter.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Weatherbit.WeatherbitAPI;

public class GetForecastStepDef {
    @Steps
    WeatherbitAPI weatherbitAPI;

    @Given("Get Forecast with Postal Code {string}")
    public void getCurrentWeatherWithLatAndLon(String postalcode){
        weatherbitAPI.getforecast(postalcode);
    }

    @When("Send get forecast")
    public void sendGetForecast() {
        Constants.Timestamp_utc = SerenityRest.when().get(Constants.FORECAST).jsonPath().getString("data[0].timestamp_utc");
        Constants.Weather_desc = SerenityRest.when().get(Constants.FORECAST).jsonPath().getString("data[0].weather.description");
        Constants.Weather_code = SerenityRest.when().get(Constants.FORECAST).jsonPath().getString("data[0].weather.code");
        Constants.Weather_icon = SerenityRest.when().get(Constants.FORECAST).jsonPath().getString("data[0].weather.icon");
    }
}
