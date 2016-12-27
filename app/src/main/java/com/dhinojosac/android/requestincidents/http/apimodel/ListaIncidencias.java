
package com.dhinojosac.android.requestincidents.http.apimodel;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListaIncidencias {

    @SerializedName("Incidencia")
    @Expose
    private List<Incidencium> incidencia = null;

    public List<Incidencium> getIncidencia() {
        return incidencia;
    }

    public void setIncidencia(List<Incidencium> incidencia) {
        this.incidencia = incidencia;
    }

}
