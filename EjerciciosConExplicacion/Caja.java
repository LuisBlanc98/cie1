package EjerciciosConExplicacion;



public class Caja {
//alto ancho fondo
private int alto;
private int ancho;
private int fondo;
public int getAlto() {
    return alto;
}
public void setAlto(int alto) {
    this.alto = alto;
}
public int getAncho() {
    return ancho;
}
public void setAncho(int ancho) {
    this.ancho = ancho;
}
public int getFondo() {
    return fondo;
}
public void setFondo(int fondo) {
    this.fondo = fondo;
}
public Caja(int alto, int ancho, int fondo) {
    this.alto = alto;
    this.ancho = ancho;
    this.fondo = fondo;
}

public int calcularVolumen(){
    return alto*ancho*fondo;
}

}
