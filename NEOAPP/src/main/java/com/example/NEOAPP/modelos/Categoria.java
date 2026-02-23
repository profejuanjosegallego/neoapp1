package com.example.NEOAPP.modelos;

public class Categoria {

    //id,nombre,fechaCreacion,responsable,justificacion
    private int id;
    private String nombre;
    private java.time.LocalDate fechaCreacion;
    private String responsable;
    private String justificacion;

    public Categoria() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public java.time.LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.time.LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    

    
}
