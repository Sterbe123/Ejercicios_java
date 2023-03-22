package EjercicioCuatro;

import java.util.Scanner;

public class Carrera {
	static Scanner sc = new Scanner(System.in);
	String nombre;
	String dorsal;
	float tiempo;
	int n;
	
	public void llenarCarrera() {
		int indice;
		System.out.print("Cuantos atletas son: ");
		n=sc.nextInt();
		System.out.println("");
		Atleta a[] = new Atleta[n];
		
		for(int i=0;i<a.length;i++) {
			sc.nextLine();
			System.out.println("Atleta N°"+(i+1));
			System.out.print("Nombre del atleta: ");
			nombre=sc.nextLine();
			System.out.print("Dorsal: ");
			dorsal=sc.nextLine();
			System.out.print("Tiempo: ");
			tiempo=sc.nextFloat();
			System.out.println("");
			
			a[i] = new Atleta(nombre,dorsal,tiempo);
		}
		indice=resultado(a);
		System.out.println("EL ganador es");
		System.out.println(a[indice].mostrarResultado());
	}
	public int resultado(Atleta a[]) {
		float tiempo;
		int indice=0;
		
		tiempo=a[0].getTiempo();
		
		for(int i=0;i<a.length;i++) {
			if(a[i].getTiempo()<tiempo) {
				tiempo = a[i].getTiempo();
				indice=i;
			}
		}
		return indice;
	}
}
