package starter.Utils;

public class Constants {
    private static final String BASE_URL = "https://api.weatherbit.io/v2.0/current";
    public static String api_key = "42fd1119b3af4028a534708844f015fc";
    public static String CURRENT = BASE_URL + "/current?lat={lat}&lon={lon}&key={key}";
    public static String FORECAST = BASE_URL + "/forecast/3hourly?postal_code={postal_code}&key={key}";
    public static String STATE_CODE;
    public static String Timestamp_utc;
    public static String Weather_desc;
    public static String Weather_code;
    public static String Weather_icon;
}
