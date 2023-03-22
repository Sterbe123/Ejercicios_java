package EjercicioTrece;

import javax.swing.JOptionPane;

public class Dato {
	
	public void llenarDato() {
		
		String texto = JOptionPane.showInputDialog("Introduze El tamaño del arreglo: ");
		int tamaño = Integer.parseInt(texto);
		
		texto = JOptionPane.showInputDialog("Introduze la longituda de la contraseña: ");
		int longitud = Integer.parseInt(texto);
		
		Password lista[] = new Password[tamaño];
		boolean fortaleza [] = new boolean [tamaño];
		
		for(int i=0;i<lista.length;i++) {
			lista[i] = new Password(longitud);
			fortaleza[i] = lista[i].esFuerte();
			JOptionPane.showMessageDialog(null, lista[i].getContraseña()+" "+fortaleza[i]);
		}
	}
}
