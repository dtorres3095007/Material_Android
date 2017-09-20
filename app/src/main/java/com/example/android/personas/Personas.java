package com.example.android.personas;

/**
 * Created by android on 19/09/2017.
 */

public class Personas {
    private String nombre;
    private String cedula;
    private String apellido;

    public Personas(String nombre, String cedula, String apellido) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void Guardar(){
        Datos.GuardarPersona(this);
    }
}
