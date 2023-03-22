package EjercicioOnce;

import java.util.Scanner;

public class Cajero {
	static Scanner sc = new Scanner(System.in);
	
	String titular;
	double cantidad;
	
	public void ingreso() {
		int op;
		double in,re;
		
		System.out.println("");
		System.out.println("Bienvenido al cajero");
		System.out.print("Titular: ");
		titular = sc.nextLine();
		System.out.print("Dinero: ");
		cantidad = sc.nextDouble();
		
		Cuenta c = new Cuenta(titular,cantidad);
		
		do {
			do {
				System.out.println("");
				System.out.println("Que desea hacer ");
				System.out.println("1.- Ingreso");
				System.out.println("2.- Retiro");
				System.out.println("3.- Salir");
				System.out.print("Digite la opcion: ");
				op = sc.nextInt();
			}while(op <1 || op>3);
			
			switch (op) {
				case 1: System.out.println("");
						System.out.print("Cuanto dinero quiere ingresar: ");
						in= sc.nextDouble();
						c.ingresar(in);
						break;
				case 2:	System.out.println("");
						System.out.print("Cuanto dinero quiere retirar: ");
						re = sc.nextDouble();
						c.retirar(re);
						break;
			}
			System.out.println("");
			System.out.println(c.toString());
			System.out.println("");
		}while(op!=3);
	}
}
