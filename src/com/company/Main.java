package com.company;

import sun.plugin2.jvm.CircularByteBuffer;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

       /* Círculo circulito = new Círculo(5,"Morado");

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
*/



        //INCISO 2

        //● Inicializar 4 estudiantes diferentes.

        Estudiante estudiante1 =new Estudiante("45125663","Mauro","Ruiz","MR@gm.com","Matheu 1515","2018","Interiorismo",3900);
        Estudiante estudiante2 =new Estudiante("36558471","Leandro","Perks","LP@gm.com","Saavedra 3259","2019","Acuicultura",3200);
        Estudiante estudiante3 =new Estudiante("42336558","Cristian","Sanchez","CS@gm.com","Mateotti 1524","2018","TUSI",4300);
        Estudiante estudiante4 =new Estudiante("45445789","Lucas","Reynoso","LR@gm.com","Avellaneda 3166","2020","Ing Naval",5450);


        //● Inicializar 4 miembros de staff con características diferentes.

        Staff empleado1= new Staff ("32114758","Nicolas","Alarcon","NA@gm.com","Laprida 1895",52000,"noche");
        Staff empleado2= new Staff ("29554871","Raul","Schols","RS@gm.com","Cerrito 2654",45000,"noche");
        Staff empleado3= new Staff ("30255687","Nahuel","Mansi","NM@gm.com","Formosa 3456",42000,"mañana");
        Staff empleado4= new Staff ("36541221","Facundo","Carreño","FC@gm.com","Catamarca 2260",44000,"mañana");

        //● Crear un array que permita almacenar juntos los tipos anteriores y
        //almacenar las 8 instancias creadas anteriormente.

        ArrayList<Persona> arregloPersonas = new ArrayList<>(); // arreglo de tipo Persona que engloba a Staff y Estudiantes
        arregloPersonas.add(estudiante1);
        arregloPersonas.add(estudiante2);
        arregloPersonas.add(estudiante3);
        arregloPersonas.add(estudiante4);
        arregloPersonas.add(empleado1);
        arregloPersonas.add(empleado2);
        arregloPersonas.add(empleado3);
        arregloPersonas.add(empleado4);

        //● Recorrer el array y mostrar por pantalla la cantidad de estudiantes y
        //la cantidad de miembros de staff.

        mostrarCantidad(arregloPersonas);


        //● Recorrer el array y sumar el total de ingresos que percibe la
        //institución por parte de la cuota de estudiantes.


        System.out.println("el ingreso mensual que percibe la institución por sus estudiantes es:"+sumarIngresos(arregloPersonas));

    }

    //Funciones estaticas declaradas en la clase main, pero fuera del metodo static main

    public static void mostrarCantidad(ArrayList<Persona> arregloPersonas){

        int cantStaff=0, cantEstudiantes=0;

        for ( Persona variable: arregloPersonas ) {

            if( variable instanceof Staff){
                cantStaff++;
            }
            else {
                cantEstudiantes++;
            }
        }
        System.out.println("La cantidad de miembros del staff es: "+cantStaff+ " y la cantidad de Estudiantes es: "+cantEstudiantes);

    }

    public static double sumarIngresos(ArrayList<Persona> arregloPersonas){

        double ingresosDeEstudiantes=0;

        for (Persona variable: arregloPersonas) {

            if ( variable instanceof Estudiante) {
                ingresosDeEstudiantes += ((Estudiante) variable).getCuotaMensual();
            }
        }
        return  ingresosDeEstudiantes;

    }

}

