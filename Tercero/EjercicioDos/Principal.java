package EjercicioDos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int x,y,nX,nY;
		char mov;
	
		Tablero tab = new Tablero(0,0);
		
		JOptionPane.showMessageDialog(null, "Bienvenido al tablero\n"+"El n�mero m�ximo de posiciones es 20");
		
	    do{
	        JOptionPane.showMessageDialog(null, "Su posici�n actual es: ("+tab.getEjeX()+","+tab.getEjeY()+")");
	        mov = JOptionPane.showInputDialog(""+"Digite la letra que corresponda para realizar un movimiento en el tablero \n"+
	                "\nA - Izquierda,  D - Derecha,  W - Arriba,  S - Abajo,  Q - Salir").charAt(0);
	                           
	        if(tab.getEjeX() >= 20 && mov == 'd'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa direcci�n,\n"+
	                    "verifique su posici�n y elija otra opci�n");
	        }
	        else if(tab.getEjeX() <= 0 && mov == 'a'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa direcci�n,\n"+
	                    "verifique su posici�n y elija otra opci�n");
	        }
	        else if(tab.getEjeY() >= 20 && mov == 'w'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa direcci�n,\n"+
	                    "verifique su posici�n y elija otra opci�n");
	        }
	        else if(tab.getEjeY() <= 0 && mov == 's'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa direcci�n,\n"+
	                    "verifique su posici�n y elija otra opci�n");
	        }
	        else{
	            switch(mov){
	                case 'a':
	                    nX = tab.getEjeX()-1;
	                    tab.setEjeX(nX);
	                    break;
	                case 'd':
	                    nX = tab.getEjeX() + 1;
	                    tab.setEjeX(nX);
	                    break;
	                case 'w':
	                    nY = tab.getEjeY() + 1;
	                    tab.setEjeY(nY);
	                    break;
	                case 's':
	                    nY = tab.getEjeY() - 1;
	                    tab.setEjeY(nY);
	                    break;
	                case 'q':
	                    JOptionPane.showMessageDialog(null, "Juego finalizado");
	                    break;
	                default:
	                    JOptionPane.showMessageDialog(null, "Caracter inv�lido!!, digite nuevamente");
	                    break;
	            }
	        }
	    }while((mov != 'q') || (mov == 'a') || (mov == 'd') || (mov == 'w') || (mov == 's')); 
	
	}
}
