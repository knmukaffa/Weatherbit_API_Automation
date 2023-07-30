package starter.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.Utils.Constants;
import starter.Weatherbit.WeatherbitAPI;

public class GetCurrentWeatherStepDef {
    @Steps
    WeatherbitAPI weatherbitAPI;

    @Given("Get Current Weather with lat {string} and lon {string}")
    public void getCurrentWeatherWithLatAndLon(String lat, String lon){
        weatherbitAPI.getCurrentWeather(lat,lon);
    }

    @When("Send get current weather")
    public void sendGetCurrentWeather() {
      Constants.STATE_CODE =  SerenityRest.when().get(Constants.CURRENT).jsonPath().getString("data[0].state_code");
    }


    @Then("Status code should be {int} OK")
    public void statusCodeShouldBeOK(int ok) {
        SerenityRest.then().statusCode(ok);
    }
}
