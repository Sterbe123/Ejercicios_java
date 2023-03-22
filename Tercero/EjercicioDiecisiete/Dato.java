package EjercicioDiecisiete;

import java.util.Scanner;

public class Dato {
	static Scanner sc = new Scanner(System.in);
	public double a,b,c;
	
	public void llenarDato() {
		System.out.println("");
		System.out.println("Coficientes");
		System.out.print("a: ");
		a = sc.nextDouble();
		System.out.print("b: ");
		b = sc.nextDouble();
		System.out.print("c: ");
		c = sc.nextDouble();
		System.out.println("");
		
		Raices r = new Raices(a,b,c);
		
		r.calcular();
	}
}
