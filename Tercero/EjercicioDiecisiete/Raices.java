
package EjercicioDiecisiete;

public class Raices {
	private double a,b,c;
	private double z1,z2,z3;
	
	public Raices(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void obtenerRaices() {
		System.out.println("");
		System.out.println("2 solucion");
		System.out.println("Primera: "+z1);
		System.out.println("Segunda: "+z2);
		System.out.println("");
	}
	public  void obtenerRaiz() {
		System.out.println("");
		System.out.println("1 solucion");
		System.out.println("Primera: "+z3);
		System.out.println("");
	}
	public double getDiscriminante() {
		return (Math.pow(b, 2)-4*a*c);
	}
	public boolean tieneRaices() {
		if(getDiscriminante()>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean tieneRaiz() {
		if(getDiscriminante()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void calcular() {
		if(tieneRaices()==true) {
			z1 = (-b-(Math.sqrt(getDiscriminante())))/(2*a);
			z2 = (-b+(Math.sqrt(getDiscriminante())))/(2*a);
			obtenerRaices();
		}else if(tieneRaiz()==true) {
			z3 = (-b-(Math.sqrt(getDiscriminante())))/(2*a);
			obtenerRaiz();
		}else {
			System.out.println("No tiene solucion");
		}
	}	
}
