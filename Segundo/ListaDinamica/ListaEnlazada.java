package ListaDinamica;

public class ListaEnlazada {
	Nodo cabeza;
	int size;
	
	public ListaEnlazada() {
		this.cabeza = null;
		size = 0;
	}
	
	//devuelve un valor
	public Object obtenerValor(int indice) {
		int contador = 0;
		Nodo temporal = cabeza;
		while(contador < indice) {
			temporal = temporal.obtenerSiguiente();
			contador++;
		}
		return temporal.obtenerValor();
	}
	
	//Agrega un elemento 
	public void addPrimero(Object obj) {
		if(cabeza==null) {
			cabeza = new Nodo(obj);
		}else {
			Nodo temporal = cabeza;
			Nodo nuevo = new Nodo(obj);
			nuevo.enlazarSiguiente(temporal);
			cabeza = nuevo;
		}
		size++;
	}
	
	//corta los elementos
	public void cortar(int indice) {
		int contador=0;
		Nodo temporal = cabeza;
		while(contador<indice-1) {
			temporal = temporal.obtenerSiguiente();
			contador++;
		}
		temporal.enlazarSiguiente(null);
		size = indice;
	}
	
	//elimina un elemento
	public void eliminar(int indice) {
		if(indice==0) {
			cabeza = cabeza.obtenerSiguiente();
		}else {
			int contador=0;
			Nodo temporal = cabeza;
			while(contador<indice-1) {
				temporal = temporal.obtenerSiguiente();
				contador++;
			}
			temporal.enlazarSiguiente(temporal.obtenerSiguiente().obtenerSiguiente());
		}
		size--;
	}
	
	//elimina el primer elemento
	public void eliminarPrimero() {
		cabeza = cabeza.obtenerSiguiente();;
		size--;
	}
	
	//muestra el tamaño de la lista
	public int getSize() {
		return size;
	}
	
	//muestra si la lista esta vacia
	public boolean estaVacio() {
		return (cabeza==null)?true:false;
	}
}
