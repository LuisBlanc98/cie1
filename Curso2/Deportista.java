package Curso2;

//Ponemos extends Persona, que es la clase que tenemos por encima
public class Deportista extends Persona{

    private String deporte;

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Deportista(String nombre, String deporte) {
        super(nombre);
        this.deporte = deporte;
    }

    @Override
    public void andar() {
        System.out.println("anda a 7km/hora");
    }
    
}
//Al poner extends Persona, te coge la variable de persona para el constructor.
//En super() va la variable que está por encima, que es la de persona.