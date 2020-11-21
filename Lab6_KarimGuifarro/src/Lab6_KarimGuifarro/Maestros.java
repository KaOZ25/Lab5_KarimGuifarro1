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
public class Maestros {
    private String nombre;
    private String apellido;
    private String salario;
    private int edad;
    

    public Maestros() {
    }

    public Maestros(String nombre, String apellido, String salario, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

 

    @Override
    public String toString() {
        return  nombre + apellido  + salario + edad ;
    }
    
}
