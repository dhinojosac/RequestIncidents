
package com.dhinojosac.android.requestincidents.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncidentsListResponse {

    @SerializedName("ListaIncidencias")
    @Expose
    private ListaIncidencias listaIncidencias;

    public ListaIncidencias getListaIncidencias() {
        return listaIncidencias;
    }

    public void setListaIncidencias(ListaIncidencias listaIncidencias) {
        this.listaIncidencias = listaIncidencias;
    }

}
