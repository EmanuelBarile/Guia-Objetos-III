package com.company;

import java.lang.Math;

public class Círculo {

    //Atributos///////////////////////////////////////

    private double radio; //Por defecto 1.0
    private String color; //Por defecto rojo.

    //Constructores///////////////////////////////////////
    public Círculo() {
        this.radio = 1;
        this.color = "Rojo";
    }

    public Círculo(float radio, String color) {
        this.radio = radio;
        this.color = color;

    }

    //Métodos/////////////////////////////////////////////////////////////////////////


    public double calcularArea ()
    {
        return Math.PI * this.radio * this.radio;
    }

    public void verCirculo()
    {
        double area = calcularArea();
        System.out.println("\t\t[Circulo] ");
        System.out.println("Radio ->["+this.radio+"] \n" +
                "Área ->["+area+"] \n " +
                "Color -> ["+this.color+"] \n");
    }


    /*Getters & Setters*/

    public double getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
