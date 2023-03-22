package ArbolBinario;

public class ArbolMain {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
		
		arbol.insertar(4, "Naranja");
		arbol.insertar(8, "Manzana");
		arbol.insertar(1, "Pera");
		arbol.insertar(9, "Frutilla");
		arbol.insertar(7, "Durazno");
		
		arbol.recorrer(arbol.raiz);
	}

}
