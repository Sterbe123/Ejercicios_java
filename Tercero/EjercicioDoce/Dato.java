package EjercicioDoce;

import java.util.Scanner;

public class Dato {
	static Scanner sc = new Scanner(System.in);
	
	public void llenarDato() {
		String nombre;
		int edad;
		char sexo;
		double peso,altura;
		
		System.out.println("Primera Persona");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("Sexo (H-M): ");
		sexo = sc.next().charAt(0);
		System.out.print("Peso: ");
		peso = sc.nextDouble();
		System.out.print("Altura: ");
		altura = sc.nextDouble();
		
		Persona p1 = new Persona(nombre,edad,sexo,peso,altura);
		
		sc.nextLine();
		System.out.println("");
		System.out.println("Segunda Persona");
		System.out.print("Nombre: ");
		nombre = sc.nextLine();
		System.out.print("Edad: ");
		edad = sc.nextInt();
		System.out.print("Sexo (H-M): ");
		sexo = sc.next().charAt(0);
			
		Persona p2 = new Persona(nombre,edad,sexo);
		Persona p3 = new Persona();
		
		p3.setNombre("Alicia");
		p3.setEdad(26);
		p3.setSexo('M');
		p3.setPeso(56.5);
		p3.setAltura(1.66);
		
		//Mayor de edad
		System.out.println("");
		if(p1.esMayorEdad(edad)==true) {
			System.out.println("La Persona "+p1.getNombre()+" es mayor de edad");
		}
		else{
			System.out.println("La Persona "+p1.getNombre()+" es menor de edad");
		}
		if(p2.esMayorEdad(edad)==true) {
			System.out.println("\nLa Persona "+p2.getNombre()+" es mayor de edad");
		}
		else {
			System.out.println("\nLa Persona "+p2.getNombre()+" es menor de edad");
		}
		if(p3.esMayorEdad(edad)==true) {
			System.out.println("\nLa Persona "+p3.getNombre()+" es mayor de edad");
		}
		else {
			System.out.println("\nLa Persona "+p3.getNombre()+" es menor de edad");
		}
		
		//IMC
		if(p1.calcularIMC(peso, altura)== -1) {
			System.out.println("\nLa Persona "+p1.getNombre()+" esta por debajo de su peso ideal");
		}
		if(p1.calcularIMC(peso, altura)== 0) {
			System.out.println("\nLa Persona "+p1.getNombre()+" esta normal");
		}
		if(p1.calcularIMC(peso, altura)==1){
			System.out.println("\nLa Persona "+p1.getNombre()+" se encuentra con sobre peso");
		}
		
		
		if(p3.calcularIMC(peso, altura)== -1) {
			System.out.println("\nLa Persona "+p3.getNombre()+" esta por debajo de su peso ideal");
		}
		if(p3.calcularIMC(peso, altura)== 0) {
			System.out.println("\nLa Persona "+p3.getNombre()+" esta normal");
		}
		if(p3.calcularIMC(peso, altura)== 1) {
			System.out.println("\nLa Persona "+p3.getNombre()+" se encuentra con sobre peso");
		}
		
		//DNI
		char op;
		System.out.println("");
			System.out.print("Desea ver su DNI "+p1.getNombre()+" (s-n): ");
		    op = sc.next().charAt(0);
		
		if(op=='s') {
			p1.generarDNI();
		}
		
			System.out.print("Desea ver su DNI "+p2.getNombre()+" (s-n): ");
		    op = sc.next().charAt(0);
		
		if(op=='s') {
			p2.generarDNI();
		}
		
			System.out.print("Desea ver su DNI "+p3.getNombre()+" (s-n): ");
		    op = sc.next().charAt(0);
		
		if(op=='s') {
			p3.generarDNI();
		}
		
		
		//Mostar datos
		System.out.println("");
		System.out.println(p1.toString());
		System.out.println("\n"+p2.toString());
		System.out.println("\n"+p3.toString());
		
	}
}
