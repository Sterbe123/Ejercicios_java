package EstructuraDinamicas;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack pila = new Stack();
		
		// Stack<nombreDeUnaClase> pila = new Stack<nombreDeUnaClase>();  sirve para instanciar otras clase
		
		
		//PUSH	-- añadir un elemento a la pila en la ultima posicion
		//POP	-- es para sacar el ultimo elemento
		//PEEK	-- ver ultimo elemento
		//EMPTY -- saber si la pila esta vacia (boolean)
		
		pila.push("Hola mundo");
		pila.push("Hola");
		pila.push(45);
		pila.push(77);
		pila.push(1.5);
		
		// [Hola mundo, Hola, 45, 77, 1.5] asi quedaria la pila
		
		System.out.println(pila.peek());
	}

}
