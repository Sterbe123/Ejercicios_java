package EjercicioDieciocho;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula {
	static Scanner sc = new Scanner(System.in);
	static ArrayList <Persona> per = new ArrayList<Persona>();
	
	public String nombre;
	public int edad;
	public String sexo;
	public String materia;
	
	public void dato() {
		int op = 1;
		int x=0;
		
		System.out.println("");
		while(op<2) {
			System.out.println("Alumno N°"+(x+1));
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			do {
				System.out.print("Edad (8-15): ");
				edad = sc.nextInt();
				if(edad<8 || edad>15) {
					System.out.println("Error...");
					System.out.println("Edad fuera de rango");
					System.out.println("Vuelva a digitar");
				}
			}while(edad<8 || edad>15);	
			sc.nextLine();
			System.out.print("Sexo (Hombre-Mujer): ");
			sexo = sc.nextLine();
	
			Persona a = new Alumno(nombre,edad,sexo);
			per.add(a);
			
			System.out.print("Quiere ingresar otro alumno (si=1-no=2): ");
			op = sc.nextInt();
			System.out.println("");
			sc.nextLine();
			x++;
		}
		
		System.out.println("");
		System.out.println("Profesor");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		do {
			System.out.print("Edad (25-60): ");
			edad = sc.nextInt();
			if(edad<25 || edad>60) {
				System.out.println("Error...");
				System.out.println("Edad fuera de rango");
			}
		}while(edad<25 || edad>60);
			sc.nextLine();
			System.out.print("Sexo (Hombre-Mujer): ");
			sexo = sc.nextLine();
			System.out.println("Materia (Matematicas-Fisica-Filosofia)");
			System.out.print("materia: ");
			materia = sc.nextLine();
		
		Persona p = new Profesor(nombre,edad,sexo,materia);
		Persona a1 = new Alumno();
		
		boolean asis = false;
		
		if(a1.asistencia()>50) {
			asis = true;
		}
		System.out.println("");
		if(p.asistencia()>30) {
			if(asis==true) {
				if(materia=="Filosifia") {
					System.out.println("El profesor no puede dar clases");
				} else if(materia=="Matematicas") {
					System.out.println("El profesor puede dar clases");
				}else {
					System.out.println("El profesor puede dar clase");
				}
			}else {
				System.out.println("El profesor no puede dar clases alumnos insuficientes");
			}
		}else {
			System.out.println("El profesor no asistio a clase");
		}
		
		for(Persona perso:per) {
			System.out.println(perso.toString());
		}
		System.out.println("");
		System.out.println(p.toString());
		System.out.println("");
	}
}
