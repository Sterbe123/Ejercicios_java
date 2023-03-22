package EjercicioVeintitres;

public class Vendedor extends Persona{
	private double comision;
	
	public Vendedor(String nombre,int edad,double salario,double comision) {
		super(nombre,edad,salario);
		this.comision = comision;
	}
	public double getComision() {
		return comision;
	}
	public boolean plus() {
		boolean p = false;
		if(edad>30) {
			if(comision>200) {
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
		return "\nVendedor"+"\nNombre: "+nombre+"\nEdad: "+edad+"\nSalario: "+nuevoSalario()+"\nComision: "+comision;
	}
}
