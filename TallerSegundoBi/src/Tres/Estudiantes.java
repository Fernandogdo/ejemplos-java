/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tres;

/**
 *
 * @author Macbook
 */
class Estudiantes {

    private String nombre;
    private String apellido;
    private int edad;

    public Estudiantes(String n, String a, int e) {
        setNombre(n);
        setApellido(a);
        setEdad(e);
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int anio) {
        edad = 2016 - anio;
    }
}
