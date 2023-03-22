//Diseñar un programa para trabajar con triángulos isósceles. 
//Para ello defina los atributos necesarios que se requieren, 
//proporcione métodos de consulta, 
//un método constructor e implemente métodos para calcular el perímetro y el área de un triángulo, 
//además implementar un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.

package EjercicioCinco;

public class Triangulo {
	private double base;
	private double lado;
	
	public Triangulo(double base,double lado) {
		this.base=base;
		this.lado=lado;
	}
	public double getBase() {
		return base;
	}
	public double getLado() {
		return lado;
	}
	
	public double perimetro(double base,double lado) {
		double result = (lado*2)+base;
		return result;
	}
	public double area(double base,double lado) {
		double h= Math.sqrt(Math.pow(lado, 2) - Math.pow((base/2), 2));
		double result = (base*h)/2;
		return result;
	}
}
