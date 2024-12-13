package EjerciciosConExplicacion;

import java.util.ArrayList;

public class RepasoArrayList {

    public static void main(String[] args) {
        
        ArrayList<Integer> lista= new ArrayList<Integer>();
        
        lista.add(5);
        lista.add(7);
        lista.add(3);
        System.out.println(lista);

    System.out.println("********");
    for (int i=0; i<lista.size();i++) {
        
        System.out.println("<"+lista.get(i)+">");
        }
        System.out.println("*******");
}  
}
//Un bucle for no lleva punto y coma al final, (todos los llevan menos los bucles while,for,etc) sino da error y no detecta la variable(i).
//int (son 8 tipos básicos y van todos en minúscula)
//Integer: es más complejo que int, integer sirve para listas de objetos, como un numero y más características. Le da funcionalidad y tiene mayor flexibilidad
//parseInt: sirve para convertir el String en un int (solo numero).