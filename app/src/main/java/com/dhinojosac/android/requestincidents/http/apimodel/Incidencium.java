
package com.dhinojosac.android.requestincidents.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Incidencium {

    @SerializedName("ID")
    @Expose
    private String iD;
    @SerializedName("Ciudad")
    @Expose
    private String ciudad;
    @SerializedName("Sector")
    @Expose
    private String sector;
    @SerializedName("Titulo")
    @Expose
    private String titulo;
    @SerializedName("Subtitulo")
    @Expose
    private String subtitulo;
    @SerializedName("TipoIncidente")
    @Expose
    private String tipoIncidente;
    @SerializedName("Categor\u00eda")
    @Expose
    private String categorA;
    @SerializedName("Texto")
    @Expose
    private String texto;
    @SerializedName("Coordenadas")
    @Expose
    private Coordenadas coordenadas;
    @SerializedName("FechaCreacion")
    @Expose
    private String fechaCreacion;
    @SerializedName("FechaInicio")
    @Expose
    private String fechaInicio;
    @SerializedName("FechaFin")
    @Expose
    private String fechaFin;
    @SerializedName("FechaActualizacion")
    @Expose
    private String fechaActualizacion;
    @SerializedName("Autor")
    @Expose
    private String autor;
    @SerializedName("TransporteAfectado")
    @Expose
    private String transporteAfectado;

    public String getID() {
        return iD;
    }

    public void setID(String iD) {
        this.iD = iD;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public String getTipoIncidente() {
        return tipoIncidente;
    }

    public void setTipoIncidente(String tipoIncidente) {
        this.tipoIncidente = tipoIncidente;
    }

    public String getCategorA() {
        return categorA;
    }

    public void setCategorA(String categorA) {
        this.categorA = categorA;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(Coordenadas coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(String fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTransporteAfectado() {
        return transporteAfectado;
    }

    public void setTransporteAfectado(String transporteAfectado) {
        this.transporteAfectado = transporteAfectado;
    }

}
