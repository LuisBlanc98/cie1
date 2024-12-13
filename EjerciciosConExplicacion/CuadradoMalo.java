package EjerciciosConExplicacion;

public class CuadradoMalo {

    private int lado;

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public CuadradoMalo(int lado)  {
        super();
        this.lado = lado;
    }

    public double area() {
        return lado*lado;
}
}
