package EjercicioTres;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static int indiceBarato(Vehiculo v[]) {
		float precio;
		int indice=0;
		precio = v[0].getPrecio();
		
		for(int i=0;i<v.length;i++) {
			if(v[i].getPrecio()<precio) {
				precio=v[i].getPrecio();
				indice=i;
			}
		}
		return indice;
	}
	public static void main(String[] args) {		
		String marca,modelo;
		float precio;
		int nVeh,indice;		
		System.out.print("Cuantos vehiculos ingresara: ");
		nVeh=sc.nextInt();
		System.out.println();
		
		Vehiculo v[] = new Vehiculo[nVeh];
		
		for(int i=0;i<nVeh;i++) {
			sc.nextLine();
			System.out.println("Vehiculo N°"+(i+1));
			System.out.print("Marca del Vehiculo:");
			marca=sc.nextLine();
			System.out.print("Modelo del vehiculo: ");
			modelo=sc.nextLine();
			System.out.print("Precio del vehiculo: ");
			precio=sc.nextFloat();
			System.out.println();
			v[i] = new Vehiculo(marca,modelo,precio);
		}	
		indice= indiceBarato(v);
		System.out.println("\nAuto mas barato es");
		System.out.println(v[indice].mostrarDato());
	}
}
