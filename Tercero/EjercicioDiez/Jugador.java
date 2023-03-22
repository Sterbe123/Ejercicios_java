package EjercicioDiez;

public class Jugador extends Persona{
	private int dorsal;
	private String posicion;
	
	public Jugador(String nombre,String apellido,int edad,int dorsal,String posicion) {
		super(nombre,apellido,edad);
		this.dorsal = dorsal;
		this.posicion = posicion;
	}
	public int getDorsal() {
		return dorsal;
	}
	public String getPosicion() {
		return posicion;
	}
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nDorsal: "+dorsal+"\nPosicion: "+posicion;
	}
}
