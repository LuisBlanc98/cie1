package es.curso7;

public class DeportistaPro extends Deportista {

	private int nivel;
	public DeportistaPro(String nombre, int edad, String deporte) {
		super(nombre, edad, deporte);
		nivel=2;
		// TODO Auto-generated constructor stub
	}
	
	
	public DeportistaPro(String nombre, int edad, String deporte, int nivel) {
		super(nombre, edad, deporte);
		this.nivel = nivel;
	}


	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	

}
