package EstructuraDinamicas;

public class Pila {
	String arr[];	//arreglo
	int maxSide;	//Tamaño del arreglo
	int top;		//indice que empieza en 0
	
	public Pila(int n) {
		maxSide = n;
		arr = new String[maxSide];
		top = 0;
	}
	
	public boolean empty() {
		if(top==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(String str) {
		if(top<maxSide) {
			arr[top] = str;
			top++;
		}		
	}
	
	public String peek() {
		if(top>0) {
			return arr[top-1];
		}else {
			return null;
		}
	}
	
	public String pop() {
		String temporal = null;
		if(top>0) {
			temporal = arr[top-1];
			temporal = null;
			top--;
		}
		return temporal;
	}
}
