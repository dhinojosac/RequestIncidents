package com.dhinojosac.android.requestincidents.http;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by negro-PC on 27-Dec-16.
 */
@Module
public class ApiModule {

    public final String BASE_URL = "https://dhinojosac.github.io/";

    @Provides
    public OkHttpClient provideClient(){
        // only necesary to add a interceptor to our client generally for logging purposes
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        return new OkHttpClient.Builder().addInterceptor(interceptor).build();
    }

    @Provides
    public Retrofit provideRetrofit(String baseURL, OkHttpClient client){
        // to provide retrofit instance
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    public IncidentAPI providesIncidentApiService(){
        return provideRetrofit(BASE_URL,provideClient()).create(IncidentAPI.class);
    }
}
