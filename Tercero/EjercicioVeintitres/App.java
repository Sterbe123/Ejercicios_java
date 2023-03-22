package EjercicioVeintitres;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	static ArrayList <Persona> per = new ArrayList<Persona>();
	
	String nombre;
	int edad;
	double salario;
	double comision;
	String zona;
	
	public void llenarDato() {
		int op;
		System.out.println("");
		do {
			do {
				System.out.println("Registro");
				System.out.println("1. Vendedor");
				System.out.println("2. Repartidor");
				System.out.println("3. Salir");
				System.out.print("Digite la opcion: ");
				op = sc.nextInt();	
				switch (op) {
					case 1: llenarVendedor();
							break;
					case 2: llenarRepartidor();
							break;
				}
			}while(!(op==3));
			System.out.println("");
			mostrarDato();
		}while(!(op==3));
	}
	
	private void llenarVendedor() {
		sc.nextLine();
		System.out.println("\nVendedor");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		System.out.print("Comision: ");
		comision = sc.nextDouble();
		System.out.println("");
		
		Vendedor v = new Vendedor(nombre,edad,salario,comision);
		
		per.add(v);
	}
	
	private void llenarRepartidor() {
		sc.nextLine();
		System.out.println("\nVendedor");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("Salario: ");
		salario = sc.nextDouble();
		sc.nextLine();
		System.out.print("Zona: ");
		zona = sc.nextLine();
		System.out.println("");
		
		Repartidor r = new Repartidor(nombre,edad,salario,zona);
		
		per.add(r);
	}
	
	private void mostrarDato() {
		for(Persona player: per) {
			System.out.println(player.toString());
			System.out.println("");
		}
	}
}
