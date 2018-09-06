package android.coolweather.com.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @author liliang
 * @description:
 * @date 2018/9/7.
 */
public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;
    }
}
