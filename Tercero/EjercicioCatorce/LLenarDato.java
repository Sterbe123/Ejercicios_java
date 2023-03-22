package EjercicioCatorce;

import java.util.ArrayList;
import java.util.Scanner;

public class LLenarDato {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Electrodomestico> elec = new ArrayList<Electrodomestico>();
	
	public void llenarDato() {
		int op;
		
		do {
			System.out.println("");
			System.out.println("Elija el electro domestico");
			System.out.println("1. Lavadora");
			System.out.println("2. Television");
			System.out.println("3. Salir");
			do {
				System.out.print("Opcion: ");
				op = sc.nextInt();
				if(op<1 || op>3) {
					System.out.println("Error...");
					System.out.println("Vuelva a digitar");
				}
			}while(op<1 || op>3);
			
			switch(op) {
				case 1: llenarLavadora();
						break;
				case 2: llenarTelevision();
						break;
			}
		}while(op!=3);
		System.out.println("");
		mostrarDato();
	}
	
	public void llenarLavadora() {
		double precio,peso,carga;
		String color;
		char consumo;
		
		System.out.println("");
		System.out.println("Lavadora");
		System.out.print("Valor: ");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.print("Color: ");
		color = sc.nextLine();
		System.out.print("Consumo: ");
		consumo = sc.next().charAt(0);
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		System.out.print("Carga: ");
		carga = sc.nextDouble();
		System.out.println("");
		
		Lavadora L = new Lavadora(precio,color,consumo,peso,carga);
		elec.add(L);
	}
	
	public void llenarTelevision() {
		double precio,peso,resolucion;
		String color;
		char consumo;
		int DTD;
		
		System.out.println("");
		System.out.println("Television");
		System.out.print("Valor: ");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.print("Color: ");
		color = sc.nextLine();
		System.out.print("Consumo: ");
		consumo = sc.next().charAt(0);
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		System.out.print("Resolucion: ");
		resolucion = sc.nextDouble();
		System.out.print("Sintonizador (si=1 o no=0): ");
		DTD = sc.nextInt();
		System.out.println("");
		Television T = new Television(precio,color,consumo,peso,resolucion,DTD);
		elec.add(T);
	}
	
	public void mostrarDato() {
		for(Electrodomestico electro: elec) {
			System.out.println(electro.toString());
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
