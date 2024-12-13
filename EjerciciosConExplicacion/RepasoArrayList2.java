package EjerciciosConExplicacion;

import java.util.ArrayList;

public class RepasoArrayList2 {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista= new ArrayList<Integer>();
        
        lista.add(5);
        lista.add(7);
        lista.add(3);
        
        for (int i=lista.size()-1; i>=0;i--) {

        System.out.println(lista.get(i));
    }
}  
}

// HEMOS SACADO LOS NUMEROS DE LA LISTA HACIA ATRÁS
//Un bucle for no lleva punto y coma al final, (todos los llevan menos los bucles while,for,etc) sino da error y no detecta la variable(i).
//int (son 8 tipos básicos y van todos en minúscula)
//Integer:
//parseInt: sirve para convertir el String en un int (solo numero).
// El size sirve para sacar la cantidad de numeros que hay (en este caso 3)
//EL -1 sirve para empezar a contar desde el ultimo numero al primero, y siempre con i--