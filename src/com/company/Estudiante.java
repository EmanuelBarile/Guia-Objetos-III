package com.company;

import java.util.ArrayList;

public class Estudiante extends Persona{

    private String anioIngreso;
    private String carrera;
    private double cuotaMensual;


    //Constructores

    public Estudiante(){

    }

    public Estudiante (String dni, String nombre, String apellido, String email, String direccion,String anioIngreso, String carrera, double cuotaMensual){

        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso=anioIngreso;
        this.carrera=carrera;
        this.cuotaMensual=cuotaMensual;

    }

    //Métodos




    //Getters & Setters

    public double getCuotaMensual() {
        return cuotaMensual;
    }
}
