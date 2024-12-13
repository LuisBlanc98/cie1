package Curso2;

import java.util.ArrayList;

import java.util.Iterator;

public class TuristaRicoPrincipal2 {

public static void main(String[] args) {
//construimos un objeto TuristaRico
//en el constructor asignamos el nombre
//la variable es pepito

    TuristaRico pepito= new TuristaRico("pepito");

//al generar una nueva variable facilitamos el uso y manejo de las funciones de la misma 
//creamos dos maletas con sus parametros
    Maleta m1= new Maleta("sansonite",10);
    Maleta m2= new Maleta("benzi",5);

//usamos el metodo addMaleta de la clase TuristaRico para añadir a pepito dos maletas
    pepito.addMaleta(m1);
    pepito.addMaleta(m2);

//llamo al getMaletas de pepito y asigno la variable maletas
    ArrayList<Maleta> maletas= pepito.getMaletas();

//Por cada maleta m en la lista de maletas, imprimemelo
    for (Maleta m: maletas) {

    //Metodo simplificado de los dos Syso de abajo 
        System.out.println(m.getModelo());
        System.out.println(m.getPeso());

//En un bucle for yo accedo por posicion, por lo tanto tengo que saber las posiciones.
//Los iteradores puede recorrer colecciones con más facilidad que el bucle for, cuando no hay posiciones.
//por cada elemento de la lista dame el siguiente

        Iterator<Maleta> it= maletas.iterator();

//hasNext sirve para que de el siguiente, si no hay siguiente para. 
        while (it.hasNext()) {

            System.out.println(it.next().getModelo());
        }
}
}
}
