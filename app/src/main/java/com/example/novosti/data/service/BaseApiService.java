package com.example.novosti.data.service;

import com.example.novosti.util.Config;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.util.concurrent.Executors;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class BaseApiService {

    private static Retrofit baseApiClient() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        return new Retrofit.Builder()
                .baseUrl(Config.BASE_API_URL)
                .callbackExecutor(Executors.newSingleThreadExecutor())
                .client(client)
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }

    public static CategoryService getCategoryService() {
        return baseApiClient().create(CategoryService.class);
    }

    public static CountryService getCountryService() {
        return baseApiClient().create(CountryService.class);
    }


    public static final String parseError(Response response) {
        try {
            JSONObject jObjError = new JSONObject(response.errorBody().string());
            return jObjError.getJSONObject("error").getString("message");
        } catch (Exception e) {
            return "Unknown Error";
        }
    }

//    fun parseError(response: Response<*>): ErrorResponse? {
//        val converter: Converter<ResponseBody, ErrorResponse> = retrofit.responseBodyConverter(ErrorResponse::class.java, arrayOfNulls<Annotation>(0))
//        val error: ErrorResponse?
//                error = try {
//            converter.convert(response.errorBody()!!)
//        } catch (e: IOException) {
//            return ErrorResponse(App.applicationContext().getString(R.string.tr_error), 500, App.applicationContext().getString(R.string.tr_error))
//        }
//        return error
//    }

}
