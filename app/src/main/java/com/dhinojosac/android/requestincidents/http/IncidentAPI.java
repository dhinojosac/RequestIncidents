package com.dhinojosac.android.requestincidents.http;

import com.dhinojosac.android.requestincidents.http.apimodel.IncidentsListResponse;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by negro-PC on 27-Dec-16.
 */
public interface IncidentAPI {
    @GET("TestingWebPage/eventos.json")
    Call<IncidentsListResponse> getIncidentList();
}
