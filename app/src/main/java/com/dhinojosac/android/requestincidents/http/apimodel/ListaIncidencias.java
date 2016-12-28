
package com.dhinojosac.android.requestincidents.http.apimodel;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaIncidencias {

    @SerializedName("Incidencia")
    @Expose
    private ArrayList<Incidencium> incidencias = null;

    public ArrayList<Incidencium> getIncidencias() {
        return incidencias;
    }

    public int getSize(){
        if (incidencias!= null){
            return  incidencias.size();
        }else {
            return 0;
        }
    }

    public Incidencium getIncidencium(int position){
        return incidencias.get(position);
    }

    public void setIncidencia(ArrayList<Incidencium> incidencia) {
        this.incidencias = incidencia;
    }

}
