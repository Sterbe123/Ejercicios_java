package Cola;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {

	public static void main(String[] args) {
		Queue<Integer> cola = new LinkedList();
		
		for(int i=0;i<10;i++) {
			cola.offer(i);	//el offer sirve para agregar datos
		}
		
		cola.remove(); //Esto quita el primer elemento
		
		System.out.println(cola);
		System.out.println(cola.peek()); //el peek solo muestra el primer elemento
	}

}
