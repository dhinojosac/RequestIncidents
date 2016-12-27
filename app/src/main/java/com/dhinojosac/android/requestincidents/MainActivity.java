package com.dhinojosac.android.requestincidents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.dhinojosac.android.requestincidents.http.IncidentAPI;
import com.dhinojosac.android.requestincidents.http.apimodel.Incidencium;
import com.dhinojosac.android.requestincidents.http.apimodel.IncidentsListResponse;
import com.dhinojosac.android.requestincidents.http.apimodel.ListaIncidencias;
import com.dhinojosac.android.requestincidents.root.App;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject
    IncidentAPI incidentAPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((App)getApplication()).getComponent().inject(this);

        Call<IncidentsListResponse> call = incidentAPI.getIncidentList();

        call.enqueue(new Callback<IncidentsListResponse>() {
            @Override
            public void onResponse(Call<IncidentsListResponse> call, Response<IncidentsListResponse> response) {
                //Log.d("Response", response.body());
                ListaIncidencias lista  = response.body().getListaIncidencias();

                Log.d("Response", lista.getIncidencia().get(0).getTitulo());

            }

            @Override
            public void onFailure(Call<IncidentsListResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });
    }
}
