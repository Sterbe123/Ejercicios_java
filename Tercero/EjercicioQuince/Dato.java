package EjercicioQuince;

import java.util.Scanner;

public class Dato {
	static Scanner sc = new Scanner(System.in);
	static Serie s[] = new Serie[5];
	static Videojuego v[] = new Videojuego[5];
	
	public void LlenarDatosSerie() {
		String titulo;
		int nTemporadas;
		String genero;
		String creador;
			
		for(int i=0;i<5;i++) {
			System.out.println("");
			System.out.println("Series");
			System.out.print("Titulo: ");
			titulo = sc.nextLine();
			System.out.print("N° de Temporadas: ");
			nTemporadas = sc.nextInt();
			sc.nextLine();
			System.out.print("Genero: ");
			genero = sc.nextLine();
			System.out.print("Creador: ");
			creador = sc.nextLine();
			
			s[i] = new Serie(titulo,nTemporadas,genero,creador);			
		}		
	}
	
	public void LlenarDatoVideojuego() {
		String titulo;
		int horaEstimada;
		String genero;
		String compañia;
			
		for(int i=0;i<5;i++) {
			System.out.println("");
			System.out.println("Video Juego");
			System.out.print("Titulo: ");
			titulo = sc.nextLine();
			System.out.print("Hora Estimada de juego: ");
			horaEstimada = sc.nextInt();
			sc.nextLine();
			System.out.print("Genero: ");
			genero = sc.nextLine();
			System.out.print("Compañia: ");
			compañia = sc.nextLine();
			
			v[i] = new Videojuego(titulo,horaEstimada,genero,compañia);
		}
	}
	
	public void mostrarDato() {		
		for(int i=0;i<5;i++) {
			System.out.println("");
			System.out.println("Serie N°"+(i+1));
			System.out.println(s[i].toString());
			System.out.println("");
		}
		System.out.println("");
		for(int i=0;i<5;i++) {
			System.out.println("");
			System.out.println("Video Juego N°"+(i+1));
			System.out.println(v[i].toString());
			System.out.println("");
		}
		System.out.println("");
	}	
}
