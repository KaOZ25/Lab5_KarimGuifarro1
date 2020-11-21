/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab6_KarimGuifarro;

/**
 *
 * @author Karim Ozael
 */
public class Clases {
    private String nombre;
    private String seccion;
    private String edificion;
    private String salon;
    private String aire;

    public Clases() {
    }

    public Clases(String nombre, String seccion, String edificion, String salon, String aire) {
        this.nombre=nombre;
        this.seccion = seccion;
        this.edificion = edificion;
        this.salon = salon;
        this.aire = aire;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getEdificion() {
        return edificion;
    }

    public void setEdificion(String edificion) {
        this.edificion = edificion;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    @Override
    public String toString() {
        return nombre + seccion + edificion + salon +  aire ;
    }
    
}
