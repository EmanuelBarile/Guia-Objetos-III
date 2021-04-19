package com.company;

import sun.plugin2.jvm.CircularByteBuffer;

public class Main {

    public static void main(String[] args) {

        Círculo circulito = new Círculo(5,"Morado");

        circulito.verCirculo();

        //● Inicializar un Cilindro y debuguear analizando los constructores a los que va
        //  llamando para inicializar la cadena de herencia. Imprimir por pantalla, el
        //  radio del cilindro, la altura, el área de la base y el volumen.

        Cilindro cilindrito = new Cilindro();

        cilindrito.verCilindro();

        //● Inicializar un segundo CIlindro esta vez especificando la altura y radio.
        //  Imprimir por pantalla el radio, la altura, el área de la base y el volumen.

        Cilindro cilindrito2 = new Cilindro(5,"Morado",10);

        cilindrito2.verCilindro();

        //● Modificar el método toString() de la clase cilindro para que imprima por
        //  pantalla lo siguiente
        //  Cilindro: subclase de + {toString() de Círculo} +altura= {alturaCilindro};
        System.out.println(cilindrito2.toString());









    }
}
