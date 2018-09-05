package android.coolweather.com.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * @author liliang
 * @description: HTTP 工具类
 * @date 2018/9/5.
 */
public class HttpUtil {

    /**
     * 发送 HTTP 请求
     * @param address 请求地址
     * @param callback 回调函数
     */
    public static void sendOkHttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
