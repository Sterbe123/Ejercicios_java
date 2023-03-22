package ListaDinamica;

public class Main {

	public static void main(String[] args) {
		Nodo primero = new Nodo("Ejemplo");
		Nodo segundo = new Nodo(45);
		Nodo tercero = new Nodo("Hola");
		
		primero.enlazarSiguiente(segundo);
		primero.obtenerSiguiente().enlazarSiguiente(tercero);
		
		//hay que llamar a la funcion obtenerSiguiente() para imprimir los otros valores
		System.out.println(primero.obtenerValor().toString());
		
		//Lista enlazada de la clase lista enlazada
		ListaEnlazada lista = new ListaEnlazada();
		
		System.out.println("Lista vacia: "+lista.estaVacio());
		
		lista.addPrimero(6);
		lista.addPrimero(5);
		lista.addPrimero(4);
		lista.addPrimero(3);
		lista.addPrimero(2);
		lista.addPrimero(1);
		
		lista.eliminar(2);
		
		System.out.println("Primer elemento: "+lista.obtenerValor(0));
		System.out.println("Ultimo elemento: "+lista.obtenerValor(lista.getSize()-1));
		System.out.println("Segundo elemento: "+lista.obtenerValor(1));
		System.out.println("Lista vacia: "+lista.estaVacio());
		System.out.println("Tamaño: "+lista.getSize());
	}

}
