package Curso2;

public class Maleta {
    private String modelo;
    private int peso;
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public Maleta(String modelo, int peso) {
        this.modelo = modelo;
        this.peso = peso;
    }

}
