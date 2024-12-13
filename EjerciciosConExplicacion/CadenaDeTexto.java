package EjerciciosConExplicacion;
public class CadenaDeTexto {
public static void main(String[] args) {
 
    

String cadena1= "hola amigo que tal estas";
System.out.println(cadena1);
for (int i=0;i<cadena1. length();i++) {
if (cadena1.charAt(i)=='a'||cadena1.charAt(i)=='e'||cadena1.charAt(i)=='i'||cadena1.charAt(i)=='o'||cadena1.charAt(i)=='u') {
System.out.println(cadena1.charAt(i));

//También podría ser así:
//for char letra= texto.chsrAt(i);
//if(letra=='a' || letra=='e' || letra=='i' || letra=='o' || letra=='u'){
//System.out.println(texto.charAt(i));
}
}
}
}
//Establezco la cadena de palabras(String=cadena1)
//luego me imprime la cadena 1, que es "hola que tal estas" (systemoutprintln cadena1)
//luego que empiece desde la primera letra, que sea hasta la ultima letra, no más de su longiutd, y de uno en uno
//(for (int i=0;i<cadena1. length();i++))
//luego si la cadena tiene la letra a, e , i , o , u, que imprima cada letra: if (cadena1.charAt(i)=='a'||cadena1.charAt(i)=='e'||cadena1.charAt(i)=='i'||cadena1.charAt(i)=='o'||cadena1.charAt(i)=='u') {
//System.out.println(cadena1.charAt(i));