package ArbolBinario;

public class Arbol {
	Nodo raiz;
	
	public Arbol() {
		raiz = null;
	}
	
	public void insertar(int i, Object fruta) {
		Nodo n = new Nodo(i);
		n.contenido = fruta;
		
		if(raiz==null) {
			raiz = n;
		}else {
			Nodo aux = raiz;
			while(aux!=null) {
				n.padre = aux;
				if(n.llave >= aux.llave) {
					aux = aux.derecha;
				}else {
					aux = aux.izquerda;
				}
			}
			if(n.llave < n.padre.llave) {
				n.padre.izquerda = n;
			}else {
				n.padre.derecha = n;
			}
		}
	}
	
	public void recorrer(Nodo n) {
		if(n != null) {
			recorrer(n.izquerda);
			System.out.println("Indice "+n.llave+" Fruta: "+n.contenido);
			recorrer(n.derecha);
		}
	}
	
	private class Nodo{
		public Nodo padre;
		public Nodo derecha;
		public Nodo izquerda;
		public int llave;
		public Object contenido;
		
		public Nodo(int indice) {
			llave = indice;
			derecha = null;
			izquerda = null;
			padre = null;
			contenido = null;
		}
	}
}
