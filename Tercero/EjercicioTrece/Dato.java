package EjercicioTrece;

import javax.swing.JOptionPane;

public class Dato {
	
	public void llenarDato() {
		
		String texto = JOptionPane.showInputDialog("Introduze El tama�o del arreglo: ");
		int tama�o = Integer.parseInt(texto);
		
		texto = JOptionPane.showInputDialog("Introduze la longituda de la contrase�a: ");
		int longitud = Integer.parseInt(texto);
		
		Password lista[] = new Password[tama�o];
		boolean fortaleza [] = new boolean [tama�o];
		
		for(int i=0;i<lista.length;i++) {
			lista[i] = new Password(longitud);
			fortaleza[i] = lista[i].esFuerte();
			JOptionPane.showMessageDialog(null, lista[i].getContrase�a()+" "+fortaleza[i]);
		}
	}
}
