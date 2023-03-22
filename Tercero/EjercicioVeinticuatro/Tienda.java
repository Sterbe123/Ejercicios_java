package EjercicioVeinticuatro;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
	static Scanner sc = new Scanner(System.in);
	static ArrayList <Producto> pro = new ArrayList<Producto>();
	String nombre;
	double precio;
	int caducar;
	String tipo;
	
	public void llenarDato() {
		int re;
		System.out.println("");
		do {
			System.out.println("Pruductos");
			System.out.println("1. Perecedero");
			System.out.println("2. No perecesero");
			System.out.println("3. Salir");
			System.out.print("Elegir una opcion: ");
			re = sc.nextInt();
			switch(re) {
				case 1: llenarPerecedero();
						break;
				case 2: llenarNoPerecedero();
						break;
			}
		}while(!(re==3));
		mostrarDato();
	}
	
	private void llenarPerecedero() {
		sc.nextLine();
		System.out.println("");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Precio: ");
		precio = sc.nextDouble();
		System.out.print("Dia de caducidad: ");
		caducar = sc.nextInt();
		System.out.println("");
		
		Perecedero p = new Perecedero(nombre,precio,caducar);
		pro.add(p);
	}
	
	private void llenarNoPerecedero() {
		sc.nextLine();
		System.out.println("");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Precio: ");
		precio = sc.nextDouble();
		sc.nextLine();
		System.out.print("Tipo de producto: ");
		tipo = sc.nextLine();
		System.out.println("");
		
		NoPerecedero n = new NoPerecedero(nombre,precio,tipo);
		pro.add(n);
	}
	
	private void mostrarDato() {
		for(Producto produc:pro) {
			System.out.println(produc.toString());
			System.out.println("");
		}
	}
}
