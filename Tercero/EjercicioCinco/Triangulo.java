//Dise�ar un programa para trabajar con tri�ngulos is�sceles. 
//Para ello defina los atributos necesarios que se requieren, 
//proporcione m�todos de consulta, 
//un m�todo constructor e implemente m�todos para calcular el per�metro y el �rea de un tri�ngulo, 
//adem�s implementar un m�todo que a partir de un arreglo de tri�ngulos devuelva el �rea del tri�ngulo de mayor superficie.

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
