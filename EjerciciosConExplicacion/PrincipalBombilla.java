package EjerciciosConExplicacion;

public class PrincipalBombilla {
public static void main(String[] args) {
    
    Bombilla b=new Bombilla();
   
    b.setIntensidad(2);
    b.incrementar();
    System.out.println(b.getIntensidad());
}
}
