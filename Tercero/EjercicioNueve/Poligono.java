//Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) 
//el programa debe ser capaz de almacenar en un arreglo N triángulos y rectángulos, 
//y al final mostrar el área y los datos de cada uno. Para ello se tendrá lo siguiente: 

//    - Una super clase llamada Polígono.
//    - Una sub clase llamada Rectángulo.
//    - Una sub clase llamada Triángulo.

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
