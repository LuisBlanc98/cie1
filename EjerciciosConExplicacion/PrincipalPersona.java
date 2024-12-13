package EjerciciosConExplicacion;

public class PrincipalPersona {

    public static void main(String[] args) {
        
        Persona p= new Persona("pedro",10);
        p.setEdad(10);
        p.setNombre("pedro");

        System.out.println(p.getEdad());
        System.out.println(p.getNombre());

    }
}
