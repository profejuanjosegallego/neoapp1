package com.example.NEOAPP.modelos;

public class MetodoPago {

    //id, nombre, franquicia, estado(activo/inactivo), descripcion
    private int id;
    private String nombre;
    private String franquicia;
    private String estado;
    private String descripcion;


    public MetodoPago() {
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


    public String getFranquicia() {
        return franquicia;
    }


    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }


    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    

}
