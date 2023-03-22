/*Estando en un grupo de amigos, se planea hacer una porra de la liga de fútbol. 
A nosotros se nos ocurre hacer un programa en POO para simular como podría desarrollarse la porra.
Cada jugador de la porra, pone un 1 euro cada jornada y decide el resultado de los partidos acordados.
Si nadie acierta en una jornada los resultados, el bote se acumula.
En principio, deben acertar el resultado de dos partidos para llevarse el dinero del bote de la porra.
Todos empiezan con un dinero inicial que será decidido por el programador 
(ya sea como parámetro o como constante). Si el jugador no tiene dinero en una jornada no podrá jugar la porra.
Para esta versión, entre jugadores podrán repetir resultados repetidos, 
por lo que el jugador que primero diga ese resultado (tal como estén de orden) se llevara primero el bote.
Los resultados de la porra serán generados aleatoriamente,
tanto los de jugador como los de los partidos (no es necesario nombre, solo resultados).
Al final del programa, se deberá mostrar el dinero que tienen los jugadores y el número de veces que han ganado.
Para este ejercicio, recomiendo usar interfaces (no hablo de interfaces gráficas) para las constantes y métodos que sean necesarios.*/

package EjercicioVeintiuno;

public class Porra {
	
	private int colocolo;
	private int uDeChile;
	private int uCatolica;
	private int dLaSerena;
	private int coquimboUnido;
	private int unionEspañola;
	private String ganador1;
	private String ganador2;
	private String ganador3;
	
	public String getGanador1() {
		return ganador1;
	}
	public String getGanador2() {
		return ganador2;
	}
	public String getGanador3() {
		return ganador3;
	}
	
	private  void goles() {
		colocolo = (int) (Math.random()*5+0);
		uDeChile = (int) (Math.random()*5+0);
		uCatolica = (int) (Math.random()*5+0);
		dLaSerena = (int) (Math.random()*5+0);
		coquimboUnido = (int) (Math.random()*5+0);
		unionEspañola = (int) (Math.random()*5+0);
	}
	
	public void fechaUno() {
		goles();
		System.out.println("");
		System.out.println("Resultado de los partidos ");
		System.out.println("Partido 1");
		System.out.println("ColoColo: "+colocolo);
		System.out.println("U. de Chile: "+uDeChile);
		if(colocolo>uDeChile) {
			System.out.println("\nColo Colo fue el ganador del partido");
			ganador1 = "local";
		}else if(uDeChile>colocolo) {
			System.out.println("\nU. de chile fue el ganador del partido");
			ganador1 = "visita";
		}else {
			System.out.println("\nEl partido termino en empate");
			ganador1 = "empate";
		}
		System.out.println("");
		System.out.println("Partido 2");
		System.out.println("U. Catolica: "+uCatolica);
		System.out.println("Union Española: "+unionEspañola);
		if(uCatolica>unionEspañola) {
			System.out.println("\nU. Catolica fue el ganador del partido");
			ganador2 = "local";
		}else if(unionEspañola>uCatolica) {
			System.out.println("\nUnion Española fue el ganador del partido");
			ganador2 = "visita";
		}else {
			System.out.println("\nEl partido termino en empate");
			ganador3 = "empate";
		}
		System.out.println("");
		System.out.println("Partido 3");
		System.out.println("D. La serena: "+dLaSerena);
		System.out.println("Coquimbo Unido: "+coquimboUnido);
		if(dLaSerena>coquimboUnido) {
			System.out.println("\nD.La Serena fue el ganador del partido");
			ganador3 = "local";
		}else if(coquimboUnido>dLaSerena) {
			System.out.println("\nCoquimbo Unido fue el ganador del partido");
			ganador3 = "visita";
		}else {
			System.out.println("\nEl partido termino en empate");
			ganador3 = "empate";
		}
		System.out.println("");
	}
}





