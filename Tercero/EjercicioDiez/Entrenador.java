package EjercicioDiez;

public class Entrenador extends Persona{
	private String estrategia;
	
	public Entrenador(String nombre,String apellido,int edad,String estrategia) {
		super(nombre,apellido,edad);
		this.estrategia = estrategia;
	}
	public String getEstrategia() {
		return estrategia;
	}
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nEstrategia: "+estrategia;
	}
}
