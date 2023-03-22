//Hacer un programa para calcular el �rea de Pol�gonos (Tri�ngulos y Rect�ngulos) 
//el programa debe ser capaz de almacenar en un arreglo N tri�ngulos y rect�ngulos, 
//y al final mostrar el �rea y los datos de cada uno. Para ello se tendr� lo siguiente: 

//    - Una super clase llamada Pol�gono.
//    - Una sub clase llamada Rect�ngulo.
//    - Una sub clase llamada Tri�ngulo.

package EjercicioNueve;

public abstract class Poligono {
	protected int nLado;
	
	public Poligono(int nLado) {
		this.nLado = nLado;
	}
	public int getNlado() {
		return nLado;
	}
	public String toString() {
		return "\nNumeros de lados es: "+nLado;
	}
	
	public abstract double area();
			
}
