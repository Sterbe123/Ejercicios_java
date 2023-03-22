package EjercicioVeintiuno;

public class Jugador {
	private String nombre;
	private int dinero;
	
	public Jugador(String nombre,int dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getDinero() {
		return dinero;
	}
	
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public String toString() {
		return "Nombre: "+nombre+"\nDinero: "+dinero;
	}
}
