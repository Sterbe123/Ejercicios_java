package EjercicioUno;

public class Triangulo {
	public Triangulo() {
		
	}
	public double perimetroTriangulo(double base,double lado1,double lado2) {
		double result=base+lado1+lado2;
		return result;
	}
	public double areaTringulo(double base,double altura) {
		double result=(base*altura)/2;
		return result;
	}
	
}
