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
public class Estudiante {
    private String nombre;
    private String apellido;
    private String num_cuenta;
    private int edad;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String num_cuenta, int edad, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.num_cuenta = num_cuenta;
        this.edad = edad;
        this.carrera = carrera;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNum_cuenta() {
        return num_cuenta;
    }

    public void setNum_cuenta(String num_cuenta) {
        this.num_cuenta = num_cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellido=" + apellido + ", num_cuenta=" + num_cuenta + ", edad=" + edad + ", carrera=" + carrera + '}';
    }
    
}
