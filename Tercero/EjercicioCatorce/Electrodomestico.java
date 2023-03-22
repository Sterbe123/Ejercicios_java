//Crearemos una supeclase llamada Electrodomestico con las siguientes características:

//Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso. Indica que se podrán heredar.
//Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
//Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre esta en mayúsculas o en minúsculas.
//Los constructores que se implementaran serán
//Un constructor por defecto.
//Un constructor con el precio y peso. El resto por defecto.
//Un constructor con todos los atributos.
//Los métodos que implementara serán:
//Métodos get de todos los atributos.
//comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. 
//Se invocara al crear el objeto y no sera visible.
//comprobarColor(String color): comprueba que el color es correcto, 
//sino lo es usa el color por defecto. Se invocara al crear el objeto y no sera visible.
//precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:

//Crearemos una subclase llamada Lavadora con las siguientes características:
//Su atributo es carga, ademas de los atributos heredados.
//Por defecto, la carga es de 5 kg. Usa una constante para ello.
//Los constructores que se implementaran serán:
//Un constructor por defecto.
//Un constructor con el precio y peso. El resto por defecto.
//Un constructor con la carga y el resto de atributos heredados. Recuerda que debes llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//Método get de carga.
//precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, 
//sino es así no se incrementara el precio. Llama al método padre y añade el código necesario. 
//Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.

//Crearemos una subclase llamada Television con las siguientes características:
//Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano), ademas de los atributos heredados.
//Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
//Los constructores que se implementaran serán:
//Un constructor por defecto.
//Un constructor con el precio y peso. El resto por defecto.
//Un constructor con la resolución, sintonizador TDT y el resto de atributos heredados. 
//Recuerda que debes llamar al constructor de la clase padre.
//Los métodos que se implementara serán:
//Método get de resolución y sintonizador TDT.
//precioFinal(): si tiene una resolución mayor de 40 pulgadas, 
//se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado, 
//aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
//Ahora crea una clase ejecutable que realice lo siguiente:

//Crea un array de Electrodomesticos de 10 posiciones.
//Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
//Ahora, recorre este array y ejecuta el método precioFinal().
//Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado, 
//el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico, 
	//	pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
//Por ejemplo, si tenemos un Electrodomestico con un precio final de 300, 
//una lavadora de 200 y una televisión de 500, el resultado final sera de 1000 (300+200+500) para electrodomésticos, 
//200 para lavadora y 500 para televisión.

package EjercicioCatorce;

public class Electrodomestico {
	private double precio;
	private String color;
	private char consumoElec;
	private double peso;
	
	public Electrodomestico() {
		
	}
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}
	public Electrodomestico(double precio,String color,char consumoElec,double peso) {
		this.precio = precio;
		this.color = color;
		this.consumoElec = consumoElec;
		this.peso = peso;
	}
	public double getPrecio() {
		return precio;
	}
	public String getColor() {
		return color;
	}
	public char getConsumoElec() {
		return consumoElec;
	}
	public double getPeso() {
		return peso;
	}
	
	public char consumoEnergetico(char consumoElec) {
		char letra = 'F';
		if(this.consumoElec == 'A') {
			letra = 'A';
		}
		else if(this.consumoElec=='B') {
			letra = 'B';
		}
		else if(this.consumoElec=='C') {
			letra = 'C';
		}
		else if(this.consumoElec=='D') {
			letra = 'D';
		}
		else if(this.consumoElec=='E') {
			letra = 'E';
		}
		return letra;
	}
	
	public String comprobarColor(String color) {
		String c = "Blanco";
		if(this.color=="negro") {
			c = "Negro";
		}
		else if(this.color=="rojo") {
			c = "Rojo";
		}
		else if(this.color=="azul") {
			c = "Azul";
		}
		else if(this.color=="gris") {
			c = "Gris";
		}
		return c;
	}
	
	public double precioFinal() {		
		char r = consumoEnergetico(consumoElec);
		double producto = 0;
		
		if(r=='A') {
			producto = 100;
			if(this.peso>=0 && this.peso<=19) {
				producto += 10;
			}
			else if(this.peso>=20 && this.peso<=49) {
				producto += 50;
			}
			else if(this.peso>=50 && this.peso<=79) {
				producto += 80;
			}
			else if(this.peso>80) {
				producto += 100;
			}
		}
		
		if(r=='B') {
			producto = 80;
			if(this.peso>=0 && this.peso<=19) {
				producto += 10;
			}
			else if(this.peso>=20 && this.peso<=49) {
				producto += 50;
			}
			else if(this.peso>=50 && this.peso<=79) {
				producto += 80;
			}
			else if(this.peso>80) {
				producto += 100;
			}
		}
		
		if(r=='C') {
			producto = 60;
			if(this.peso>=0 && this.peso<=19) {
				producto += 10;
			}
			else if(this.peso>=20 && this.peso<=49) {
				producto += 50;
			}
			else if(this.peso>=50 && this.peso<=79) {
				producto += 80;
			}
			else if(this.peso>80) {
				producto += 100;
			}
		}
		
		if(r=='D') {
			producto = 50;
			if(this.peso>=0 && this.peso<=19) {
				producto += 10;
			}
			else if(this.peso>=20 && this.peso<=49) {
				producto += 50;
			}
			else if(this.peso>=50 && this.peso<=79) {
				producto += 80;
			}
			else if(this.peso>80) {
				producto += 100;
			}
		}
		
		if(r=='E') {
			producto = 30;
			if(this.peso>=0 && this.peso<=19) {
				producto += 10;
			}
			else if(this.peso>=20 && this.peso<=49) {
				producto += 50;
			}
			else if(this.peso>=50 && this.peso<=79) {
				producto += 80;
			}
			else if(this.peso>80) {
				producto += 100;
			}
		}
		
		if(r=='F') {
			producto = 10;
			if(this.peso>=0 && this.peso<=19) {
				producto += 10;
			}
			else if(this.peso>=20 && this.peso<=49) {
				producto += 50;
			}
			else if(this.peso>=50 && this.peso<=79) {
				producto += 80;
			}
			else if(this.peso>80) {
				producto += 100;
			}
		}
		
		return producto;
	}
	
	public String toString() {
		return "\nPrecio: "+precio+"\nColor: "+color+"\nConsumo Electrico: "+consumoElec+
				"\nPeso: "+peso+"\n";
	}
}
