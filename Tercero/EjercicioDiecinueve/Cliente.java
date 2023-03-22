package EjercicioDiecinueve;

public class Cliente {
	private String nombre;
	private int edad;
	private double dineroTotal;
	
	public Cliente() {
		
	}
	public Cliente(String nombre,int edad,double dineroTotal) {
		this.nombre = nombre;
		this.edad = edad;
		this.dineroTotal = dineroTotal;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getDinerototal() {
		return dineroTotal;
	}
	public String toString() {
		return  "Nombre: "+nombre+"\nEdad: "+edad+"\nDinero: "+dineroTotal;
	}
}
