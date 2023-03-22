package Ejercicioveinte;

import java.util.Scanner;

public class Usuario {
	static Scanner sc = new Scanner(System.in);
	
	public void play() {
		int op;
		DosJugadores j2 = new DosJugadores();
		TresJugadores j3 = new TresJugadores();
		CuatroJugadores j4 = new CuatroJugadores();
		String r;
		boolean pass = false;
		boolean pass2;
		
		do {
			do {
				System.out.println("");
				do {
					System.out.print("Cuantos jugadores son: ");
					op = sc.nextInt();
					if(op<=1 || op>=5) {
						System.out.println("jugador fuera de rango...");
						System.out.println("vuelva a digitar");
					}
				}while(op<=1 || op>=5);							
				switch(op) {
					case 2: j2.juego();
							break;
					case 3: j3.juego();
							break;
					case 4: j4.juego();
							break;
				}
			}while(pass == true);			
			System.out.println("");
			System.out.print("Quiere jugar otra partida (si-no): ");
			r = sc.nextLine();
			if(r=="si") {
				pass2 = true;
			}else {
				pass2 = false;
			}			
		}while(pass2 == false);
	}
}
