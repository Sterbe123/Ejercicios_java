package EjercicioNueve;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	static ArrayList<Poligono> poligono = new ArrayList<Poligono>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		llenarPoligono();
		mostraResultado();
	}
	public static void llenarPoligono() {
		int op;
		char r;
		do {
			do {
				System.out.println("Opciones ");
				System.out.println("1- Rectangulos");
				System.out.println("2- Triangulo");
				System.out.print("Digite la opcion: ");
				op = sc.nextInt();
				if(op<1 || op>2) {
					System.out.println("Error..."+"\nNumero fuera de rango"+"\nVuelva a digitar...\n");
				}
			}while(op<1 || op>2);
			
			switch(op) {
			case 1: llenarRectangulo(); //rectangulos
					break;
			case 2: llenarTriangulo(); //Trinagulos
					break;
			}
			
			System.out.println("");
			System.out.print("Desea ingresar otro poligono? (s-n): ");
			r = sc.next().charAt(0);
			System.out.println("");
		}while(r=='s' || r=='S');
	}
	public static void llenarRectangulo() {
		double lado1,lado2;
		
		System.out.print("Digite el lado 1: ");
		lado1 =sc.nextDouble();
		System.out.print("Digite el lado 2: ");
		lado2 = sc.nextDouble();
		
		Rectangulos r = new Rectangulos(lado1,lado2);
		poligono.add(r);
	}
	public static void llenarTriangulo() {
		double lado1,lado2,lado3;
		
		System.out.print("Digite el lado 1: ");
		lado1 =sc.nextDouble();
		System.out.print("Digite el lado 2: ");
		lado2 = sc.nextDouble();
		System.out.print("Digite el lado 3: ");
		lado3 = sc.nextDouble();
		
		Triangulo t = new Triangulo(lado1,lado2,lado3);
		poligono.add(t);
	}
	public static void mostraResultado() {
		for(Poligono poli: poligono) {
			System.out.println(poli.toString());
			System.out.println("");
		}
	}
}
