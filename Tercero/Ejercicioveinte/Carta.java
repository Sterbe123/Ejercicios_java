/*Vamos a hacer una baraja de cartas españolas orientado a objetos.

Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas)
 
La baraja estará compuesta por un conjunto de cartas, 40 exactamente.

Las operaciones que podrá realizar la baraja son:

barajar: cambia de posición todas las cartas aleatoriamente
siguienteCarta: devuelve la siguiente carta que está en la baraja, 
cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.
cartasDisponibles: indica el número de cartas que aún puede repartir
darCartas: dado un número de cartas que nos pidan, 
le devolveremos ese número de cartas (piensa que puedes devolver). 
En caso de que haya menos cartas que las pedidas, no devolveremos nada pero debemos indicárselo al usuario.
cartasMonton: mostramos aquellas cartas que ya han salido, 
si no ha salido ninguna indicárselo al usuario
mostrarBaraja: muestra todas las cartas hasta el final. 
Es decir, si se saca una carta y luego se llama al método, este no mostrara esa primera carta.*/


package Ejercicioveinte;

public class Carta {
	 public String carta[] = {"1 de espada","2 de espadas","3 de espadas","4 de espadas","5 de espadas",
					   		   "6 de espadas","7 de espadas","10 de espadas","11 de espadas","12 de espadas",
					   		   "1 de bastos","2 de bastos","3 de bastos","4 de bastos","5 de bastos",
					   		   "6 de bastos","7 de bastos","10 de bastos","11 de bastos","12 de bastos",
					   		   "1 de oros","2 de oros","3 de oros","4 de oros","5 de oros",
					   		   "6 de oros","7 de oros","10 de oros","11 de oros","12 de oros",
					   		   "1 de copas","2 de copas","3 de copas","4 de copas","5 de copas",
					   		   "6 de copas","7 de copas","10 de copas","11 de copas","12 de copas"};
	
	 public String cartaBarajadas[] = new String[40];
	 
	 
	private void barajar() {
		int a;
		String aux = "null";
		
		// este ciclo for son las veces que vamos a barajar
		for(int n=0;n<5;n++) {
			// cambiamos las cartas aleatoriamente
			for(int i=0;i<40;i++) {
				for(int j=0;j<36;j++) {
					a = (int) (Math.random()*4+1);	
					if(a==1) {
						aux = carta[j];
						carta[j] = carta[j+1];
						carta[j+1] = aux;
					}else if(a==2) {
						aux = carta[j];
						carta[j] = carta[j+2];
						carta[j+2] = aux;
					}else if(a==3) {
						aux = carta[j];
						carta[j] = carta[j+3];
						carta[j+3] = aux;
					}else {
						aux = carta[j];
						carta[j] = carta[j+4];
						carta[j+4] = aux;
					}
				}
			}
		}		
	}
	
	public void nuevaBaraja() {
		barajar();
		for(int i=0;i<40;i++) {
			cartaBarajadas[i] = carta[i];
		}
	}
	
	public void mostrarTodaLaBaraja() {
		nuevaBaraja();
		// este metodo muestra toda la baraja
		System.out.println("");
		for(int i=0;i<40;i++) {
			System.out.print(" "+cartaBarajadas[i]+",");
			if(i==9) {
				System.out.println("");
			}else if(i==19) {
				System.out.println("");
			}else if(i==29) {
				System.out.println("");
			}else if(i==39) {
				System.out.println("");
			}
		}
		System.out.println("");
	}	
}
