package EjercicioVeintidos;

import java.util.Scanner;

public class Juego {
	static Scanner sc = new Scanner(System.in);
	private String nombre;
	private int player = conteoJugador();
	private int id=1;
	Revolver r = new Revolver();
	private String res;
	
	private int conteoJugador() {
		int j;
		do {
		System.out.print("Cuantos Jugadores son (1-6): ");
		j = sc.nextInt();
		if(j<1 || j>6) {
			j=6;
		}
		}while(j<1 || j>6);
		return j;
	}
	
	Jugador jugador[] = new Jugador[player];
	
	private void ingresoJugador() {
		sc.nextLine();
		System.out.println("");
		for(int i=0;i<jugador.length;i++) {
			id += i;
			System.out.println("Jugador N°"+(i+1));
			System.out.print("Nombre: ");
			nombre = sc.nextLine();		
			jugador[i] = new Jugador(id,nombre);
		}
		System.out.println("");
	}
	
	private boolean finJuego() {
		int a=0;
		boolean fin = false;
			while(jugador[a].getDead()==true && a<jugador.length) {
				fin = true;
				a++;
			}
		if(fin==true) {
			System.out.println("\nSe acabo el juego.");
		}
		return fin;
	}
	
	public void ronda() {
		int a=1,i;
		ingresoJugador();
		System.out.println("");
		do {
			System.out.println("Ronda N°"+(a));
			i=0;
			while(jugador[i].getDead()==false && i<jugador.length) {
				System.out.println("El jugador "+jugador[i].getNombre()+" se apunto, disparo...");				
				jugador[i].disparar();
				do {
					System.out.print("Saber posicion de la bala (s-n): ");
					res = sc.nextLine();
				}while(!(res.equals("s") || res.equals("n")));
				if(res.equals("s")) {
					System.out.println(r.toString());
				}
				i++;
			}		
			a++;
		}while(finJuego()==false);
	}
}
