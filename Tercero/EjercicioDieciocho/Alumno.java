package EjercicioDieciocho;

public class Alumno extends Persona{
	private double nota;
	
	public Alumno() {

	}
	public Alumno(String nombre,int edad,String sexo) {
		super(nombre,edad,sexo);
	}
	
	public double saberNota() {
		nota = (Math.random()*7+1);
		return nota;
	}
	
	public String situacion() {
		if(saberNota()>4) {
			if(asistencia()>60) {
				return "Aprobado";
			}else {
				return "Reprobado";
			}
		}else {
			return "Reprobado";
		}
	}
	
	public int asistencia() {
		int numero = (int) (Math.random()*100+0);
		return numero;
	}
	public String toString() {
		return super.toString()+"\nNota: "+saberNota()+"\nAsistencia: "+asistencia()+"%"+"\nSituacion Final: "+situacion();
	}
}
