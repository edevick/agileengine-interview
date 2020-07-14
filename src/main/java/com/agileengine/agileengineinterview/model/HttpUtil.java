package com.agileengine.agileengineinterview.model;

import com.agileengine.agileengineinterview.http.AuthRequest;
import com.agileengine.agileengineinterview.http.AuthResponse;
import com.google.gson.Gson;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class HttpUtil {

    public static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");

    private static OkHttpClient client = new OkHttpClient();

    private static String TOKEN = null;
    private static String API_KEY = "23567b218376f79d9415";
    private static String BASE_URL = "http://interview.agileengine.com:80";

    static {
        try {
            Gson gson = new Gson();
            AuthRequest request = new AuthRequest(API_KEY);

            String result = post(BASE_URL + "/auth", gson.toJson(request));
            AuthResponse response = gson.fromJson(result, AuthResponse.class);

            TOKEN = response.getToken();

            System.out.println("Our Token:" + TOKEN);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String post(String url, String json) throws IOException {
        RequestBody body = RequestBody.create(json, JSON);

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .build();
        Response response = client.newCall(request).execute();

        return response.body().string();
    }

    public static String get(String url) throws IOException {

        Request request = new Request.Builder()
                .url(BASE_URL + url)
                .addHeader("Authorization", "Bearer "+TOKEN)
                .build();

        Response response = client.newCall(request).execute();

        return response.body().string();
    }


}
