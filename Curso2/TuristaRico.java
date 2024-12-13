package Curso2;

import java.util.ArrayList;

public class TuristaRico {

//el objeto es maletas, y la variable arraylist maletas. Esto es para crear una variable y su tipo. Es para la creacion de un array
//se puede añadir las maletas que sean, porque es un a lista dinamica
private ArrayList<Maleta> maletas= new ArrayList<Maleta>();

private String nombre;

public ArrayList<Maleta> getMaletas() {
    return maletas;
}

public void setMaletas(ArrayList<Maleta> maletas) {
    this.maletas = maletas;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public TuristaRico(String nombre) {
    this.nombre = nombre;
}

public void addMaleta(Maleta maletita) {

    maletas.add(maletita);


}
}


