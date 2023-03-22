package EjercicioVeintitres;

public class Repartidor extends Persona{
	private String zona;
	
	public Repartidor(String nombre,int edad,double salario,String zona) {
		super(nombre,edad,salario);
		this.zona = zona;
	}
	public String getZona() {
		return zona;
	}
	public boolean plus() {
		boolean p = false;
		if(edad<25) {
			if(zona.equals("zona 3")) {
				p = true;
			}
		}
		return p;
	}
	public double nuevoSalario() {
		double nuevoSalario = salario;
		if(plus()==true) {
			nuevoSalario += PLUS;
		}
		return nuevoSalario;
	}
	
	public String toString() {
		return "\nRepartidor"+"\nNombre: "+nombre+"\nEdad: "+edad+"\nSalario: "+nuevoSalario()+"\nZona: "+zona;
	}
}
