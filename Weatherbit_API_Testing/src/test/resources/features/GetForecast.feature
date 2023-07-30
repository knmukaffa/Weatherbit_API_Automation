Feature: Get Forecast

  @Weatherbit
  Scenario: Get Forecast with Postal Code
    Given Get Forecast with Postal Code "28546"
    When Send get forecast
    Then Status code should be 200 OK