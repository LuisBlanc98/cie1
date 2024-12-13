package EjerciciosConExplicacion;

public class PrincipalFactura {

    public static void main(String[] args) {
        
        Factura f= new Factura(15,1500);
       

        System.out.println(f.getNumero());
        System.out.println(f.getImporte());
        System.out.println(f.calcularConIVA());
}
}