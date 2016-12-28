package com.dhinojosac.android.requestincidents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.dhinojosac.android.requestincidents.adapters.CustomAdapter;
import com.dhinojosac.android.requestincidents.adapters.RecyclerItemClickListener;
import com.dhinojosac.android.requestincidents.http.IncidentAPI;
import com.dhinojosac.android.requestincidents.http.apimodel.Incidencium;
import com.dhinojosac.android.requestincidents.http.apimodel.IncidentsListResponse;
import com.dhinojosac.android.requestincidents.http.apimodel.ListaIncidencias;
import com.dhinojosac.android.requestincidents.root.App;

import java.util.ArrayList;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Incidencium> incidenciumArrayList = new ArrayList<>();

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
                incidenciumArrayList  = response.body().getListaIncidencias().getIncidencias();
                Log.d("INCIDENT-LIST", incidenciumArrayList.get(0).getTitulo());
            }

            @Override
            public void onFailure(Call<IncidentsListResponse> call, Throwable t) {
                t.printStackTrace();

            }
        });

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        CustomAdapter adapter = new CustomAdapter(incidenciumArrayList);
        adapter.setRecyclerItemClickListener(new RecyclerItemClickListener() {
            @Override
            public void onItemClickListener(int position) {
                Toast.makeText(getApplicationContext(),"Clicked item "+position,Toast.LENGTH_SHORT).show();
            }
        });
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
    }




}
