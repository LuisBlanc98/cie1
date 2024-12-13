package Curso2;


//Ponemos la clase extends que esté por encima, en este caso es deportista.
//Despues de poner extends de la clase deportista, hacemos get and set y contructor normal.
public class DeportistaPro extends Deportista {

private int nivel;
public DeportistaPro(String nombre, int edad, String deporte) {
    super(nombre, deporte);
    nivel=2;
}
public int getNivel() {
    return nivel;
}

public void setNivel(int nivel) {
    this.nivel = nivel;
}

public DeportistaPro(String nombre, String deporte, int nivel) {
    super(nombre, deporte);
    this.nivel = nivel;
}  

public void andar() {
   System.out.println("anda a 9 km/hora"); 

}
}
