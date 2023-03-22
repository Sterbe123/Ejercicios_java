package ListaDinamica;

public class Nodo {
	Object valor;	//Se crea un valor de tipo objeto
	Nodo siguiente; // Se crea un variable nodo

	//Se crea un contructor
	public Nodo(Object valor) {
		this.valor = valor;
		this.siguiente = null;
	}
	
	public Object obtenerValor() {
		return valor;
	}
	//Es una manera de apuntar a otro nodo y mirar hacia afuera
	public void enlazarSiguiente(Nodo n) {
		siguiente = n;
	}
	
	//Va a regresar el enlace al siguiente nodo
	public Nodo obtenerSiguiente() {
		return siguiente;
	}
	
	
}
