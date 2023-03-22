package EjercicioDiez;

public class Doctor extends Persona{
	private String titulacion;
	private int a�oex;
	
	public Doctor(String nombre,String apellido,int edad,String titulacion,int a�oex) {
		super(nombre,apellido,edad);
		this.titulacion = titulacion;
		this.a�oex = a�oex;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public int getA�oex() {
		return a�oex;
	}
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nTitulacion: "+titulacion+
				"\nA�os de experiencia: "+a�oex;
	}
}
