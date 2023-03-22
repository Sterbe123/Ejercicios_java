package Veintecinco;

import java.util.Scanner;

public class App {
	static Scanner sc = new Scanner(System.in);
	static Inventario i = new Inventario();
	
	public void interaccion() {
		i.llenarAlmacen();
		int op;
		System.out.println("");
		do {
			System.out.println("1. Ver productos");
			System.out.println("2. Agregar producto");
			System.out.println("3. Eliminar producto");
			System.out.println("4. Precio Total");
			System.out.println("5. Salir");
			System.out.print("Elija una opcion: ");
			op = sc.nextInt();
			System.out.println("");
			switch(op) {
				case 1: i.mostrarProducto();
						break;
				case 2: i.agregarProducto();
						break;
				case 3: i.eliminarProducto();
						break;
				case 4: i.precioTotal();
						break;
			}
		}while(!(op==5));
	}
}
