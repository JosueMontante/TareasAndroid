package com.example.chaosinfinityviral.sesion5;

import android.app.AlertDialog;

/**
 * Created by ChaosInfinityViral on 02/02/18.
 */

public class Alumno {

    public String nombre;
    public String telefono;
    public String escolaridad;
    public String Genero;
    public String librofav;
    public boolean deporte;


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", escolaridad='" + escolaridad + '\'' +
                ", Genero='" + Genero + '\'' +
                ", librofav='" + librofav + '\'' +
                ", deporte=" + deporte +
                '}';
    }

    public Alumno(String nombre, String telefono, String escolaridad, String genero, String librofav, boolean deporte) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.escolaridad = escolaridad;
        Genero = genero;
        this.librofav = librofav;
        this.deporte = deporte;
    }

    public void clean(){
        nombre.toString();
    }

}

