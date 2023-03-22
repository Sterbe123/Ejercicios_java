package EjercicioVeinticuatro;

public class Perecedero extends Producto{
	private int diaCaducar;
	
	public Perecedero(String nombre,double precio,int diaCaducar) {
		super(nombre,precio);
		this.diaCaducar = diaCaducar;
	}
	public int getDiaCaducar() {
		return diaCaducar;
	}
	public void setDiaCaducar(int diaCaducar) {
		this.diaCaducar = diaCaducar;
	}
	
	private double nuevoPrecio() {
		double pre = precio;
		if(diaCaducar==3) {
			pre /= 2;
		}else if(diaCaducar==2) {
			pre /= 3;
		}else if(diaCaducar==1) {
			pre /= 4;
		}
		return pre;
	}
	
	public String toString() {
		return "\nNombre: "+nombre+"\nPrecio: "+nuevoPrecio()+"\nDia de caducidad: "+diaCaducar;
	}
}
