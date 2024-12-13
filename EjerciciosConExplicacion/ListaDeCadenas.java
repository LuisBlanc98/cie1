package EjerciciosConExplicacion;

public class ListaDeCadenas {

    // tenemos un array con textos o cadenas imprimir por la consola la cedena de
    // mayor longitud.
    // utilizando un bucle while.



public static void main(String[] args) {
String [] lista= new String[] {"Buenos", "dias","alumnos"};
int i=0;
int letras=0;
int posicion=0;
while(i<lista.length) {

//System.out.println(lista[i]);
//System.out.println(lista[i].length());

if (letras<lista[i].length()) {
    letras=lista[i].length();
    posicion=i;
     }
        i++;
    }
System.out.println(letras);
System.out.println(lista[posicion]);
}
}

    
        





// for (int i=0;i<lista.length;i++) {

// for (int j= 0;j< lista[i].length(); j++) {
