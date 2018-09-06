package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liliang
 * @description:
 * @date 2018/9/7.
 */
public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
