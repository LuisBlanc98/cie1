package Curso2;

public class PersonaPrincipal {

    public static void main(String[] args) {
        
        DeportistaPro tenista= new DeportistaPro("pepe","tenis",1);

        System.out.println(tenista.getDeporte());
        tenista.andar();

        Deportista futbolista= new Deportista("pedro", "futbol");
        System.out.println(futbolista.getDeporte());
        futbolista.andar();

        Persona nadador= new Persona("tomas");
        System.out.println(nadador.getNombre());
        nadador.andar();

   



    }
}
//la variable andar se hereda de la clase Persona,