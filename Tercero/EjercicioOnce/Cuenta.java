//Crea una clase llamada Cuenta que tendr� los siguientes atributos: titular y cantidad (puede tener decimales)
//l titular ser� obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

//Crea sus m�todos get, set y toString.

//Tendr� dos m�todos especiales:

//ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
//si la cantidad introducida es negativa, no se har� nada.

//retirar(double cantidad): se retira una cantidad a la cuenta, 
//si restando la cantidad actual a la que nos pasan es negativa, la cantidad de la cuenta pasa a ser 0.

package EjercicioOnce;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular,double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.cantidad += cantidad;   
        }
    }
	public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } 
        else {
            this.cantidad -= cantidad;
        }
	}

	
	public String toString() {
		return "Titular: "+titular+"\nEstado de cuenta: "+cantidad;
	}
}
