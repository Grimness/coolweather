package android.coolweather.com.coolweather.gson;

/**
 * @author liliang
 * @description:
 * @date 2018/9/7.
 */
public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
