package EjerciciosConExplicacion;
public class Bombilla {
private int intensidad;

//lo que se vaya a usar tiene que ser una funcion publica
//void es para que me modifique el valor. Con el int y con el double te da un valor

public int getIntensidad() {
    return intensidad;
}
public void setIntensidad(int i) {

    if (i>=0 && i<=3);
    intensidad=i;
}
    
public void incrementar() {
    //setIntensidad es para que vuelva a pasar por el If y se cumpla la funcion.
    setIntensidad(getIntensidad()+1);
    //intensidad=intensidad+1
}

 public void decrementar() {
    setIntensidad(getIntensidad()-1);
    //intensidad=intensidad-1;
}
}

