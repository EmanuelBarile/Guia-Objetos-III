package com.company;

public class Cilindro extends Círculo{

    //[ATRIBUTOS]//////////////////////////////////////////////////////////////////////////////////
    private double alturaCilindro; //Por defecto 1.0


    //[CONSTRUCTORES]//////////////////////////////////////////////////////////////////////////////////

    public Cilindro(float radio, String color, double alturaCilindro) {
        super(radio, color); //Esto no lo entiendo mucho.

        this.alturaCilindro = alturaCilindro;
    }

    public Cilindro() {
        super();  //Esto no lo entiendo mucho
        this.alturaCilindro = 1;
    }
    //[MÉTODOS]//////////////////////////////////////////////////////////////////////////////////


    //● Sobreescribir el método calcular area declarado en Círculo, para que nos
    //permita calcular el área del cilindro  --> Formula: (2π×radius×height + 2×areaBase)

    @Override
    public double calcularArea() {

        double area =( Math.PI * 2 * this.getRadio() * this.alturaCilindro ) + (2  * Math.PI * this.getRadio() * this.getRadio());


        return area;
    }

    public double calcularVolumen()
    {
        double area = super.calcularArea();

        return area * this.alturaCilindro;
    }

    //● Modificar el método toString() de la clase cilindro para que imprima por
    //  pantalla lo siguiente
    //  Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};

    @Override
    public String toString() {
        return "Cilindro: subclase de "+super.getClass().toString()+". Altura = "+this.alturaCilindro;
    }

    public void verCilindro()
    {
        System.out.println("\t\t[Cilindro] \n");
        System.out.println("Radio -> ["+this.getRadio()+"] \n " +
                "Altura --> ["+this.alturaCilindro+"] \n" +
                "Area --> ["+this.calcularArea()+"] \n " +
                "Volumen --> ["+this.calcularVolumen()+"] \n " +
                "Color --> ["+this.getColor()+"] \n");

    }


    /* Getters & Setters */

    public double getAlturaCilindro() {
        return alturaCilindro;
    }

    public void setAlturaCilindro(double alturaCilindro) {
        this.alturaCilindro = alturaCilindro;
    }
}
