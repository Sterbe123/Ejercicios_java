package EjercicioVeintiuno;

import java.util.Scanner;

public class Apuesta {
	static Scanner sc = new Scanner(System.in);
	static Porra p = new Porra();
	
	String nombre;
	int dinero;
	String res;
	boolean win = false;
	int bote = 100;
	
	private int ingresoPlayer() {	
		int r;
		System.out.println("");
		System.out.println("Sistema de apuesta");
		System.out.print("Ingrese la cantidad de jugadores: ");
		r = sc.nextInt();
		sc.nextLine();
		return r;
	}
	int ra = ingresoPlayer();
	
	String apuesta1[] = new String[ra];
	String apuesta2[] = new String[ra];
	Jugador player[] = new Jugador[ra]; 
	
	public void ingresoNombre() {
		System.out.println("");
		for(int i=0;i<player.length;i++) {
			System.out.println("Jugador N°"+(i+1));
			System.out.print("Nombre: ");
			nombre = sc.nextLine();
			dinero = (int)(Math.random()*10+3);
			player[i] = new Jugador(nombre,dinero);
		}
	}
	
	public void mostrarJugadores() {
		System.out.println("");
		System.out.print("Quiere ver lo jugadores(s/n): ");
		res = sc.nextLine();
		if(res.equals("s")) {
			for(int i=0;i<player.length;i++) {
				System.out.println(player[i].toString());
			}
		}
	}
	
	public void participar() {
		System.out.println("");
		for(int i=0;i<player.length;i++) {
			if(player[i].getDinero()>0) {
			do {
				System.out.print("Desea participar "+player[i].getNombre()+" (s/n): ");
				res = sc.nextLine();
				if(res.equals("s")) {
					bote += 1;
					player[i].setDinero((player[i].getDinero()-1));
					System.out.print("Cual es su primera apuesta (local, visita o empate): ");
					apuesta1[i] = sc.nextLine();
					System.out.print("Cual es su segunda apesta (local, visita o empate): ");
					apuesta2[i] = sc.nextLine();
				}else if(res.equals("n")){
					System.out.println("No participa y espera a la siguinte ronda");
					apuesta1[i] = "null";
					apuesta2[i] = "null";
				}else {
					System.out.println("error vuelva a digitar...");
				}
			}while(!(res.equals("s") || res.equals("n")));
		}else {
				System.out.println("Ya no puedes apostar "+player[i].getNombre()+" por falta de dinero");
				apuesta1[i] = "null";
				apuesta2[i] = "null";
			}
		}
	}
			
	public void resultado() {
		System.out.println("");
		int i=0;
		int a=1;
		do {
			System.out.println("");
			p.fechaUno();
			System.out.println("");
			System.out.println("Apuesta N°"+(a));
			do {	
				i=0;
				while(win==false && i<player.length) {
					if(apuesta1[i].equals(p.getGanador1())) {
						if(apuesta2[i].equals(p.getGanador2())) {
							win = true;
						}else if(apuesta2[i].equals(p.getGanador3())) {
							win = true;
						}else {
							win = false;
						}
					}else if(apuesta1[i].equals(p.getGanador2())) {
							if(apuesta2[i].equals(p.getGanador3())) {
								win = true;
							}else if(apuesta2[i].equals(p.getGanador1())) {
								win = true;
							}else {
								win = false;
							}
					}else if(apuesta1[i].equals(p.getGanador3())){
						if(apuesta2[i].equals(p.getGanador1())) {
							win = true;
						}else if(apuesta2[i].equals(p.getGanador2())){
							win = true;
						}else {
							win = false;
						}
					}else {
						win = false;
					}
					i++;
				}
			}while(win==false && i<player.length);
			a++;
			if(win==false) {
				System.out.println("No hubo ganadores en esta apuesta");		
				System.out.println("se pasa a la siguiente ronda...");
				mostrarJugadores();
				participar();
			}else {
				System.out.println("Felicidades "+player[i-1].getNombre()+" fuiste el afortunado ganador");
				System.out.println("Te llevas nada mas ni nada menos $"+bote);
			}
		}while(win==false);
	}
}
