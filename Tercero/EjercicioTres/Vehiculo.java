//Construir un programa que dada una serie de veh�culos 
//caracterizados por su marca, modelo y precio, 
//imprima las propiedades del veh�culo m�s barato. 
//Para ello, se deber�n leer por teclado las caracter�sticas de cada veh�culo y crear una clase 
//que represente a cada uno de ellos.

package EjercicioTres;

public class Vehiculo {

	private String marca;
	private String modelo;
	private float precio;
	
	public Vehiculo(String marca,String modelo,float precio) {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}

	public float getPrecio() {
		return precio;
	}

	public String mostrarDato() {
		return "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: "+precio;
	}
}
