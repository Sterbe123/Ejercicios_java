package EjercicioUno;

public class Rectangulo {
	
	public Rectangulo() {
		
	}
	
	public double perimetroRectangulo(double lado1,double lado2) {
		double result=(lado1*2)+(lado2*2);
		return result;
	}
	public double areaRectangulo(double lado1,double lado2) {
		double result=lado1*lado2;
		return result;
	}
}
