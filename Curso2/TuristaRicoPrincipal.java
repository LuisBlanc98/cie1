package Curso2;

import java.util.ArrayList;

public class TuristaRicoPrincipal {

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
    for (int i=0;i<maletas.size();i++) {

        Maleta maletaR=maletas.get(i);

    //metodo simplificado de los dos Syso de abajo 
        System.out.println(maletaR.getModelo());
        System.out.println(maletaR.getPeso());

        System.out.println(maletas.get(i).getModelo());
        System.out.println(maletas.get(i).getPeso());
}
}
}
