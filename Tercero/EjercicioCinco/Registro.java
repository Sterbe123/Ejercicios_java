package EjercicioCinco;

import java.util.Scanner;

public class Registro {
	static Scanner sc = new Scanner(System.in);
	double base;
	double lado;
	int n;
	
	public void llenarTriangulo() {
		System.out.print("Cuantos triangulo quiere registrar: ");
		n=sc.nextInt();
		System.out.println("");
		Triangulo t[] = new Triangulo[n];
		
		for(int i=0;i<t.length;i++) {
			System.out.println("Triangulo N°"+(i+1));
			System.out.print("Digite la base: ");
			base=sc.nextDouble();
			System.out.print("Digite el lado: ");
			lado=sc.nextDouble();
			System.out.println("\nResultados");
			
			t[i] = new Triangulo(base,lado);
			System.out.println("El perimetro del trinagulo es: "+t[i].perimetro(base, lado));
			System.out.println("El area del triangulo es: "+t[i].area(base, lado));
			System.out.println("");
		}
		double indice=mayor(t);
		System.out.println("El tringulo de mayor area tiene: "+indice);
	}
	public double mayor(Triangulo t[]) {
		double mayorT =t[0].area(base, lado);
		for(int i=0;i<t.length;i++) {
			if(t[i].area(base, lado)> mayorT) {
				mayorT = t[i].area(base, lado);
			}
		}
		return mayorT;
	}
}
