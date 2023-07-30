Feature: Get Current Weather

  @Weatherbit
  Scenario: Get Current Weather with lat and lon
    Given Get Current Weather with lat "40.730610" and lon "-73.935242"
    When Send get current weather
    Then Status code should be 200 OK