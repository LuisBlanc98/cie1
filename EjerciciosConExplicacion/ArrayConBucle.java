package EjerciciosConExplicacion;

public class ArrayConBucle {

//int i=0 significa que empiece a contar desde la primera letra
//i<lista.length significa que la longitud de la lista no sea mayor que lo que es
//i++ significa que vaya contando de uno en uno
//cada palabra es un objeto de la lista String
//en el array cada palabra se diseña como propiedad, y en el string es una funcion
//charAt devuelve el valor en una posicion específica, si es 0 el valor 1 y así sucesivamente

    public static void main(String[] args) {
        
        String[] lista=new String[] {"hola","que","tal","estas"};

        for (int i=0;i<lista.length;i++) {
        
        for (int j= 0;j< lista[i].length(); j++) {

        char caracter= lista[i].charAt(j);     
        System.out.println(caracter);
            }
        System.out.println();
        //System.out.println(lista[i].charAt(j)); ESTO ES OTRA FORMA DE HACERLO
        }
    }
}
