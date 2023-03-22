package EjercicioDiez;

public class Doctor extends Persona{
	private String titulacion;
	private int añoex;
	
	public Doctor(String nombre,String apellido,int edad,String titulacion,int añoex) {
		super(nombre,apellido,edad);
		this.titulacion = titulacion;
		this.añoex = añoex;
	}
	public String getTitulacion() {
		return titulacion;
	}
	public int getAñoex() {
		return añoex;
	}
	public String toString() {
		return "Nombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+edad+"\nTitulacion: "+titulacion+
				"\nAños de experiencia: "+añoex;
	}
}
