/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_KarimGuifarro;


public class Carrera {
    private String nombre;
    private String facultad;
    private int costo;
    private String jefe_carrera;
    private String tipo;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, int costo, String jefe_carrera, String tipo) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo = costo;
        this.jefe_carrera = jefe_carrera;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getJefe_carrera() {
        return jefe_carrera;
    }

    public void setJefe_carrera(String jefe_carrera) {
        this.jefe_carrera = jefe_carrera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return  nombre +  facultad + costo + jefe_carrera +  tipo;
    }
    
}

