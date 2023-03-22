package EjercicioUno;

import java.util.Scanner;

public class Dato {
	static Scanner sc=new Scanner(System.in);
	
	double lado1,lado2,lado3;
	int op;
	int op2;
	
	Triangulo t=new Triangulo();
	Rectangulo r=new Rectangulo();
	
	public void leerDato(){
			
		do {
			System.out.println("Opciones: 1-Triangulos");
			System.out.println("          2-Rectangulos");
			System.out.println("          3-Salida");
			System.out.println("");
			System.out.print("Digite la opcion: ");
			op=sc.nextInt();
			
			if(op<1 || op>3) {
				System.out.println("Error...");
				System.out.println("Opcion fuera de rango...");
				System.out.println("Vuelva a digitar");
				System.out.println("");
			}
			
			switch(op) {
			case 1:		do {
							System.out.println("Opcion Triangulos");
							System.out.println("Eliga la opcion: 1-Area");
							System.out.println("                 2-Perimetro");
							System.out.println("                 3-Salida");
							System.out.println("");
							System.out.print("digite la opcion: ");
							op2=sc.nextInt();
							System.out.println("");
							switch(op2) {
							case 1: System.out.println("Area del Triangulo");
									System.out.print("Digite la base: ");
									lado1=sc.nextDouble();
									System.out.print("Digite la altura: ");
									lado2=sc.nextDouble();
									System.out.print("El area es "+t.areaTringulo(lado1, lado2));
									System.out.println("");
									break;
							case 2: System.out.println("Perimetro del Triangulo");
									System.out.print("Digite la base: ");
									lado1=sc.nextDouble();
									System.out.print("Digite el lado 1: ");
									lado2=sc.nextDouble();
									System.out.print("Digite el lado 2: ");
									lado3=sc.nextDouble();
									System.out.println("El perimetro es: "+t.perimetroTriangulo(lado1, lado2, lado3));
									System.out.println("");
									break;
							}
						}while(op2!=3);
						break;
			case 2:	do {
						System.out.println("Opcion de Rectangulo");
						System.out.println("Eliga la opcion: 1-Area");
						System.out.println("                 2-Perimetro");
						System.out.println("                 3-Salida");
						System.out.println("");
						System.out.print("digite la opcion: ");
						op2=sc.nextInt();
						System.out.println("");
						switch(op2) {
						case 1: System.out.println("Area del Rectangulo");
								System.out.print("Digite el lado 1: ");
								lado1=sc.nextDouble();
								System.out.print("Digite el lado 2: ");
								lado2=sc.nextDouble();
								System.out.print("El area es "+r.areaRectangulo(lado1, lado2));
								System.out.println("");
								break;
						case 2: System.out.println("Perimetro de un Rectangulo");
								System.out.print("Digite la lado 1: ");
								lado1=sc.nextDouble();
								System.out.print("Digite el lado 2: ");
								lado2=sc.nextDouble();
								System.out.println("El perimetro es: "+r.perimetroRectangulo(lado1, lado2));
								System.out.println("");
								break;
						}
					}while(op2!=3);
					break;
			}
		}while(op!=3);
	}
}
