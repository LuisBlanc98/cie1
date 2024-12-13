package Examen;

public class Ejercicio5 {
//Disponemos de la cadena "hola me llamo pepe y soy informatico".  
//Queremos recorrer la cadena con un bucle y obtener el numero de letras "e" 
//que el texto contiene.

public static void main(String[] args) {
    
    String cadena= "hola me llamo pepe y soy informatico";

    int contador=0;

    for (int i=0;i<cadena.length();i++){

        if (cadena.charAt(i)=='e') {
            contador++;
        }
    }
    System.out.println(contador);
}






}
