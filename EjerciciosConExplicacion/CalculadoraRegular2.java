package EjerciciosConExplicacion;

public class CalculadoraRegular2 {
public static void main(String[] args) {

//no hace falta crear la clase Calculadora New porque es un metodo estatico

    System.out.println(CalculadoraRegular.sumar(2.0, 2.0));
    System.out.println(CalculadoraRegular.restar(2, 2));
    System.out.println(CalculadoraRegular.multiplicar(2, 2));
    System.out.println(CalculadoraRegular.dividir(2, 2));
}
}
//un metodo estatico es un metodo que invocas directamente, sin instanciar primero nada
//es un metodo de clase, porque le invocas referenciando a su clase.
//pero no instancias priemero nada, usas directamente de la clase este metodo, luego lo invocas y se ejecuta
//(CalculaoraRegular)
//static es un metodo que pertenece a la clase, y se ejecuta directamente. 
//un metodo estatico no necesita las propiedades de la clase para funcionar.