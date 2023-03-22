package EjercicioCatorce;


public class Lavadora extends Electrodomestico{
	private double carga;
	
	public Lavadora(double precio,String color,char consumoElec,double peso,double carga) {
		super(precio,color,consumoElec,peso);
		this.carga = carga;
	}
	
	public double precioFinal() {
		double p;
		
		if(this.carga > 30) {
			p = super.precioFinal()+50;
		}
		else {
			p = super.precioFinal();
		}
		return (p+getPrecio());
	}

	double r = precioFinal();
	
	public String toString() {
		return "\nPrecio final: "+r+"\nColor: "+super.comprobarColor(getColor())+"\nConsumo Electrico: "+getConsumoElec()+
				"\nPeso: "+getPeso()+"\nCarga: "+carga;
	}
}
