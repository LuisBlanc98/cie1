package EjerciciosConExplicacion;

public class PrincipalCaja {

    public static void main(String[] args) {
     
    Caja c= new Caja(10,5,15);

    System.out.println("El alto es:"+ c.getAlto());
    System.out.println("El ancho es:"+ c.getAncho());
    System.out.println("El fondo es:"+ c.getFondo());
    System.out.println("El volumen de la Caja es:"+ c.calcularVolumen());
}

    }

