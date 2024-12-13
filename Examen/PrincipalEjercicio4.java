package Examen;

public class PrincipalEjercicio4 {

    public static void main(String[] args) {
        
        Ejercicio4 o= new Ejercicio4 (false);
        System.out.println(o.estaEncendido());
        o.encender();
        System.out.println(o.estaEncendido());
        o.apagar();
    }
}

