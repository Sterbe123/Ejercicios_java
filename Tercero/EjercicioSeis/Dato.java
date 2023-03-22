package EjercicioSeis;

import java.util.Scanner;

public class Dato {
	static Scanner sc = new Scanner(System.in);
	String nombre;
	String apellido;
	int edad;
	int codigoEstudiante;
	float notaFinal;
	
	public void resultado() {
		System.out.println();
		System.out.println("Llene los datos");
		System.out.print("Nombre del estudiante: ");
		nombre = sc.nextLine();
		System.out.print("apellido del estudiante: ");
		apellido = sc.nextLine();
		System.out.print("Edad del estudiante: ");
		edad = sc.nextInt();
		System.out.print("Codigo: ");
		codigoEstudiante = sc.nextInt();
		System.out.print("Nota final del estudiante: ");
		notaFinal = sc.nextFloat();
		
		Estudiante es = new Estudiante(nombre,apellido,edad,codigoEstudiante,notaFinal);
		
		es.mostrarDato();
	}
}
