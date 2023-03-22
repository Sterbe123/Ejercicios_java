package EjercicioSeis;

public class Estudiante extends Persona{
	private int codigoEstudiante;
	private float notaFinal;
	
	public Estudiante(String nombre,String apellido,int edad, int codigoEstudiante, float notaFinal) {
		super(nombre,apellido,edad);
		this.codigoEstudiante = codigoEstudiante;
		this.notaFinal = notaFinal;
	}
	
	public void mostrarDato() {
		System.out.print("\nNombre: "+getNombre()+
				"\nApellido: "+getApellido()+
				"\nEdad: "+getEdad()+
				"\nCodigo de Estudiante: "+codigoEstudiante+
				"\nNota final: "+notaFinal);
	}
}
