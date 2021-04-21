package com.company;

public class Staff extends Persona{

    private double salario;
    private String turno; // duda de si es boolean al tener 2 opciones (mañana o noche)


    public Staff(){

    }

    public Staff (String dni, String nombre, String apellido, String email, String direccion,double salario, String turno){
        super(dni, nombre, apellido, email, direccion);
        this.salario=salario;
        this.turno=turno;

    }




}
