package EjercicioDos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int x,y,nX,nY;
		char mov;
	
		Tablero tab = new Tablero(0,0);
		
		JOptionPane.showMessageDialog(null, "Bienvenido al tablero\n"+"El número máximo de posiciones es 20");
		
	    do{
	        JOptionPane.showMessageDialog(null, "Su posición actual es: ("+tab.getEjeX()+","+tab.getEjeY()+")");
	        mov = JOptionPane.showInputDialog(""+"Digite la letra que corresponda para realizar un movimiento en el tablero \n"+
	                "\nA - Izquierda,  D - Derecha,  W - Arriba,  S - Abajo,  Q - Salir").charAt(0);
	                           
	        if(tab.getEjeX() >= 20 && mov == 'd'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"+
	                    "verifique su posición y elija otra opción");
	        }
	        else if(tab.getEjeX() <= 0 && mov == 'a'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"+
	                    "verifique su posición y elija otra opción");
	        }
	        else if(tab.getEjeY() >= 20 && mov == 'w'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"+
	                    "verifique su posición y elija otra opción");
	        }
	        else if(tab.getEjeY() <= 0 && mov == 's'){
	            JOptionPane.showMessageDialog(null, "No puede realizar movientos hacia esa dirección,\n"+
	                    "verifique su posición y elija otra opción");
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
	                    JOptionPane.showMessageDialog(null, "Caracter inválido!!, digite nuevamente");
	                    break;
	            }
	        }
	    }while((mov != 'q') || (mov == 'a') || (mov == 'd') || (mov == 'w') || (mov == 's')); 
	
	}
}
