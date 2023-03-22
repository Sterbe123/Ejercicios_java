package EjercicioDieciocho;

public class Profesor extends Persona{
	private String materia;
	
	public Profesor(String nombre,int edad,String sexo,String materia) {
		super(nombre,edad,sexo);
		this.materia = materia;
	}
	public String getMateria() {
		return materia;
	}
	
	public int asistencia() {
		int numero = (int) (Math.random()*100+0);
		return numero;
	}
	
	public String toString() {
		return super.toString()+"\nMateria: "+materia+"\nAsistencia: "+asistencia()+"%";
	}
}
