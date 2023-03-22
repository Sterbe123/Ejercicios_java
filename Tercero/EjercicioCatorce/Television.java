package EjercicioCatorce;

public class Television extends Electrodomestico{
	private double resolucion;
	private int DTD;
	
	public Television(double precio,String color,char consumoElec,double peso,double resolucion,int DTD){
		super(precio,color,consumoElec,peso);
		this.resolucion = resolucion;
		this.DTD = DTD;
	}
	public double getResolucion() {
		return resolucion;
	}
	public int getDTD() {
		return DTD;
	}
	
	public double precioFinal() {
		double a = super.precioFinal();
		double resul = 0;
		if(this.resolucion>=40) {
	           resul = ((a*30)/100)+a;	
			if(this.DTD==1) {
				return resul+50;
			}
		}
		else {
			return a+0;
		}
		return resul;
	}
	
	
	double r = precioFinal();
	
	public String toString() {
		return "\nPrecio final: "+(getPrecio()+r)+"\nColor: "+super.comprobarColor(getColor())+"\nConsumo Electrico: "+getConsumoElec()+
				"\nPeso: "+getPeso()+"\nResolucion: "+resolucion;
	}
}
