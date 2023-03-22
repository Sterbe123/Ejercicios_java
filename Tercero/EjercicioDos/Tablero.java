//Construir un programa que permita dirigir 
//el movimiento de un objeto dentro de un tablero y actualice su posici�n dentro del mismo. 
//Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. 
//Tras cada movimiento el programa mostrar� 
//la nueva direcci�n elegida y las coordenadas de situaci�n del objeto dentro del tablero.

package EjercicioDos;


public class Tablero {
	private int ejeX;
	private int ejeY;
	
	public Tablero(int ejeX,int ejeY) {
		this.ejeX=ejeX;
		this.ejeY=ejeY;
	}
	
	public int getEjeY() {
		return ejeY;
	}
	public void setEjeY(int ejeY) {
		this.ejeY = ejeY;
	}
	public void setEjeX(int ejeX) {
		this.ejeX = ejeX;
	}
	public int getEjeX() {
		return ejeX;
	}
}
