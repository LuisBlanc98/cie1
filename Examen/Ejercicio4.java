package Examen;

public class Ejercicio4 {
//Crear la Clase Ordenador que contiene la propiedad encendido de tipo boolean,
//crear un metodo para encenderlo otro para apagarlo y otro para comprobar si esta encendido.
    
    private boolean encendido;

    public Ejercicio4(boolean b) {
        //TODO Auto-generated constructor stub
    }
    public boolean estaEncendido() {
       
        return encendido;
    }
    public void encender() {
        if(!encendido)
        encendido=true;
    }
    public void apagar() {
        if(encendido)
        encendido=false;
    }



}

















