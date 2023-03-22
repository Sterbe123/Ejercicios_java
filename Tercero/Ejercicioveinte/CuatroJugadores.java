package Ejercicioveinte;

import java.util.Scanner;

public class CuatroJugadores {
	static Scanner sc = new Scanner(System.in);
	Carta c1 = new Carta();
	public String manoUno[] = new String[9];
	public String manoDos[] = new String[9];
	public String manoTres[] = new String[9];
	public String manoCuatro[] = new String[9];
	private String basura[] = new String[40];
	private int c=16,d=0,k=0;
	
	public void repartirCarta() {
		int a=0,b=8,c=12,d=20;
		int i=0;
		
		//Primer Jugador
		while(i<8) {
			manoUno[i] = c1.cartaBarajadas[a];
			i++;
			a++;
		}
		//Segundo Jugador
		i=0;
		while(i<8) {
			manoDos[i] = c1.cartaBarajadas[b];
			i++;
			b++;
		}
		//Terce Jugador
		i=0;
		while(i<8) {
			manoTres[i] = c1.cartaBarajadas[c];
			i++;
			c++;
		}
		//Cuarto Jugador
		i=0;
		while(i<8) {
			manoCuatro[i] = c1.cartaBarajadas[d];
			i++;
			d++;
		}
	}
	
	public void juego() {
		int op;
		boolean pass = false;
		repartirCarta();
		System.out.println("");
		do {
			do {
				System.out.println("Jugador Uno");
				System.out.println("1. Sacar cartas");
				System.out.println("2. botar cartas");
				System.out.println("3. ver mano 1");
				System.out.print("Elija la opcion: ");
				op = sc.nextInt();
					switch(op) {
						case 1: sacarCartasUno();
								break;
						case 2: botarCartasUno();
								pass = true;
								break;
						case 3: verMano1();
								break;
					}
			}while(pass = false);
			pass =  false;
			System.out.println("");
			System.out.println("Siguiente turno");
			System.out.println("");
			op=0;
			do {
				System.out.println("Jugador Dos");
				System.out.println("1. Sacar cartas");
				System.out.println("2. botar cartas");
				System.out.println("3. ver mano 2");
				System.out.print("Elija la opcion: ");
				op = sc.nextInt();
					switch(op) {
						case 1: sacarCartasDos();
								break;
						case 2: botarCartasDos();
								pass = true;
								break;
						case 3: verMano2();
								break;
					}
			}while(pass = false);
			op=0;
			do {
				System.out.println("Jugador Tres");
				System.out.println("1. Sacar cartas");
				System.out.println("2. botar cartas");
				System.out.println("3. ver mano 2");
				System.out.print("Elija la opcion: ");
				op = sc.nextInt();
					switch(op) {
						case 1: sacarCartasTres();
								break;
						case 2: botarCartasTres();
								pass = true;
								break;
						case 3: verMano3();
								break;
					}
			}while(pass = false);
			op=0;
			do {
				System.out.println("Jugador Cuatro");
				System.out.println("1. Sacar cartas");
				System.out.println("2. botar cartas");
				System.out.println("3. ver mano 2");
				System.out.print("Elija la opcion: ");
				op = sc.nextInt();
					switch(op) {
						case 1: sacarCartasCuatro();
								break;
						case 2: botarCartasCuatro();
								pass = true;
								break;
						case 3: verMano3();
								break;
					}
			}while(pass = false);
			if(k>40) {
				System.out.println("");
				System.out.println("Fin del juego");
				System.out.println("");
			}else {
				System.out.println("");
				System.out.println("Siguiente turno");
				System.out.println("");
			}
		}while(k<40);
	}
	
	private void sacarCartasUno() {
		c1.nuevaBaraja();
		System.out.println("");
		if(d<1) {
			while(d<1) {
				System.out.println("salio la carta: "+c1.cartaBarajadas[c]);
				manoUno[8] = c1.cartaBarajadas[c];
				c++;
				d++;
			}
		}else {
			System.out.println("Ya no puede sacar mas cartas");
			juego();
		}		
	}
	
	private void sacarCartasDos() {
		c1.nuevaBaraja();
		System.out.println("");
		if(d<1) {
			while(d<1) {
				System.out.println("salio la carta: "+c1.cartaBarajadas[c]);
				manoDos[8] = c1.cartaBarajadas[c];
				c++;
				d++;
			}
		}else {
			System.out.println("Ya no puede sacar mas cartas");
			juego();
		}
		
	}
	
	private void sacarCartasTres() {
		c1.nuevaBaraja();
		System.out.println("");
		if(d<1) {
			while(d<1) {
				System.out.println("salio la carta: "+c1.cartaBarajadas[c]);
				manoTres[8] = c1.cartaBarajadas[c];
				c++;
				d++;
			}
		}else {
			System.out.println("Ya no puede sacar mas cartas");
			juego();
		}		
	}
	private void sacarCartasCuatro() {
		c1.nuevaBaraja();
		System.out.println("");
		if(d<1) {
			while(d<1) {
				System.out.println("salio la carta: "+c1.cartaBarajadas[c]);
				manoTres[8] = c1.cartaBarajadas[c];
				c++;
				d++;
			}
		}else {
			System.out.println("Ya no puede sacar mas cartas");
			juego();
		}		
	}
	
	private void botarCartasUno() {
		int l=0+k;
		sc.nextLine();
		int op;
		String aux = "null";
		String op2;
		System.out.println("");
		System.out.print("quiere ver mano:");
		op2 = sc.nextLine();
		if(op2 == "si") {
			verMano1();
		}
		System.out.print("Que cartas quieres botar: ");
		op = sc.nextInt();
		
		aux = manoUno[op];
		
		for(int i=7;i>=op;i--) {
			manoUno[i+1] = manoUno[i];
		}
		
		while(l<40) {
			basura[k] = aux;
			l++;
		}
		k++;
		
	}
	
	private void botarCartasDos() {
		int l=0+k;
		sc.nextLine();
		int op;
		String aux = "null";
		String op2;
		System.out.println("");
		System.out.print("quiere ver mano:");
		op2 = sc.nextLine();
		if(op2 == "si") {
			verMano2();
		}
		System.out.print("Que cartas quieres botar: ");
		op = sc.nextInt();
		
		aux = manoDos[op];
		
		for(int i=7;i>=op;i--) {
			manoDos[i+1] = manoDos[i];
		}
		
		while(l<40) {
			basura[k] = aux;
			l++;
		}
		k++;
	}
	
	private void botarCartasTres() {
		int l=0+k;
		sc.nextLine();
		int op;
		String aux = "null";
		String op2;
		System.out.println("");
		System.out.print("quiere ver mano:");
		op2 = sc.nextLine();
		if(op2 == "si") {
			verMano3();
		}
		System.out.print("Que cartas quieres botar: ");
		op = sc.nextInt();
		
		aux = manoTres[op];
		
		for(int i=7;i>=op;i--) {
			manoTres[i+1] = manoTres[i];
		}
		
		while(l<40) {
			basura[k] = aux;
			l++;
		}
		k++;
	}
	private void botarCartasCuatro() {
		int l=0+k;
		sc.nextLine();
		int op;
		String aux = "null";
		String op2;
		System.out.println("");
		System.out.print("quiere ver mano:");
		op2 = sc.nextLine();
		if(op2 == "si") {
			verMano4();
		}
		System.out.print("Que cartas quieres botar: ");
		op = sc.nextInt();
		
		aux = manoCuatro[op];
		
		for(int i=7;i>=op;i--) {
			manoCuatro[i+1] = manoCuatro[i];
		}
		
		while(l<40) {
			basura[k] = aux;
			l++;
		}
		k++;
	}
	
	private void verMano1() {
		repartirCarta();		
		System.out.println("\nMano Uno");
		for(int i=0;i<manoUno.length;i++) {		
			System.out.print(" "+manoUno[i]+" ");
		}		
		System.out.println("");
	}
	
	private void verMano2() {
		System.out.println("\nMano Dos");
		for(int i=0;i<manoDos.length;i++) {		
			System.out.print(" "+manoDos[i]+" ");
		}
		System.out.println("");
	}
	
	private void verMano3() {
		System.out.println("\nMano Tres");
		for(int i=0;i<manoTres.length;i++) {		
			System.out.print(" "+manoTres[i]+" ");
		}
		System.out.println("");
	}
	private void verMano4() {
		System.out.println("\nMano Cuatro");
		for(int i=0;i<manoCuatro.length;i++) {		
			System.out.print(" "+manoCuatro[i]+" ");
		}
		System.out.println("");
	}
}
