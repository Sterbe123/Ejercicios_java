package Ejercicioveinte;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String res;
		
		Usuario u = new Usuario();
		Carta c = new Carta();
		u.play();
		
		System.out.println("quiere ver la baraja (si-no):");
		res = sc.nextLine();
		if(res=="si") {
			c.mostrarTodaLaBaraja();
		}		
	}
}
