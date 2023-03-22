package EjercicioDiez;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
	static ArrayList<Persona> persona = new ArrayList<Persona>(); 
	static Scanner sc = new Scanner(System.in);
	
	public void llenarEquipo() {
		int op;
		
		do {
			do {
				System.out.println("");
				System.out.println("Opciones");
				System.out.println("1.- Jugador");
				System.out.println("2.- Entrenador");
				System.out.println("3.- Doctor");
				System.out.println("4.- Salir");
				System.out.print("Digite la opcion: ");
				op = sc.nextInt();
				if(op<1 || op>4) {
					System.out.println("Error..."+"\nNumero fuera de rango"+"\nVuelva a digitar...\n");
				}
			}while(op <1 || op>4);
			
			switch (op) {
				case 1: llenarJugador();
						break;
				case 2: llenarEntrenador();
						break;
				case 3: llenarDoctor();
						break;
			}			
		}while(op != 4);
	}
	
	public void llenarJugador() {
		String nombre,apellido,posicion;
		int edad,dorsal;
		
		sc.nextLine();
		System.out.println("");
		System.out.println("Jugador");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("Dorsal: ");
		dorsal = sc.nextInt();
		sc.nextLine();
		System.out.print("Posicion: ");
		posicion = sc.nextLine();
		
		Jugador j = new Jugador(nombre,apellido,edad,dorsal,posicion);
		
		persona.add(j);
	}
	public void llenarEntrenador() {
		String nombre,apellido,estrategia;
		int edad;
		
		sc.nextLine();
		System.out.println("");
		System.out.println("Entrenador");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.print("Estrategia: ");
		estrategia = sc.nextLine();
		
		Entrenador e = new Entrenador(nombre,apellido,edad,estrategia);
		persona.add(e);
		
	}
	public void llenarDoctor() {
		String nombre,apellido,titulacion;
		int edad,añoex;
		
		sc.nextLine();
		System.out.println("");
		System.out.println("Doctor");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Apellido: ");
		apellido = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		sc.nextLine();
		System.out.print("Titulacion: ");
		titulacion = sc.nextLine();
		System.out.print("Año de experiencia: ");
		añoex = sc.nextInt();
		
		Doctor d = new Doctor(nombre,apellido,edad,titulacion,añoex);
		persona.add(d);
		
	}
	
	public void mostrarDato() {
		for(Persona equipo : persona) {
			System.out.println(equipo.toString());
			System.out.println("");
		}
	}
}
