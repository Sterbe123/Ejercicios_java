//Haz una clase llamada Password que siga las siguientes condiciones:

//Que tenga los atributos longitud y contrase�a . Por defecto, la longitud sera de 8.
//Los constructores ser�n los siguiente:
//Un constructor por defecto.
//Un constructor con la longitud que nosotros le pasemos. Generara una contrase�a aleatoria con esa longitud.
//Los m�todos que implementa ser�n:
//esFuerte(): devuelve un booleano si es fuerte o no, para que sea fuerte debe tener mas de 2 may�sculas, mas de 1 min�scula y mas de 5 n�meros.
//generarPassword():  genera la contrase�a del objeto con la longitud que tenga.
//M�todo get para contrase�a y longitud.
//M�todo set para longitud.
//Ahora, crea una clase clase ejecutable:

//Crea un array de Passwords con el tama�o que tu le indiques por teclado.
//Crea un bucle que cree un objeto para cada posici�n del array.
//Indica tambi�n por teclado la longitud de los Passwords (antes de bucle).
//Crea otro array de booleanos donde se almacene si el password del array de Password es o no fuerte (usa el bucle anterior).
//Al final, muestra la contrase�a y si es o no fuerte (usa el bucle anterior). Usa este simple formato:
//contrase�a1 valor_booleano1

//contrase�a2 valor_bololeano2

package EjercicioTrece;

public class Password {
	private static final int LONGITUD_DEF = 8;
	
	private String contrase�a;
	private int longitud;
	
	public Password() {
		this(LONGITUD_DEF);
	}
	public Password(int longitud) {
		this.longitud = longitud;
	}
	
	public boolean esFuerte() {
		int cuentanumeros=0;
        int cuentaminusculas=0;
        int cuentamayusculas=0;
        
        //Vamos caracter a caracter y comprobamos que tipo de caracter es
        
        for (int i=0;i<contrase�a.length();i++){
                if (contrase�a.charAt(i)>=97 && contrase�a.charAt(i)<=122){
                    cuentaminusculas+=1;
                }
                else{
                    if (contrase�a.charAt(i)>=65 && contrase�a.charAt(i)<=90){
                        cuentamayusculas+=1;
                }
                    else{
                    cuentanumeros+=1;
                    }
                }
            }
        
            //Si la constrase�a tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
        
            if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
            	return true;
            }
            	else{
            		return false;
            	}
		}
	
	public String generarPassword() {
		String password="";
        for (int i=0;i<longitud;i++){
        	
            //Generamos un numero aleatorio, segun este elige si a�adir una minuscula, mayuscula o numero
        	
            int eleccion=((int)Math.floor(Math.random()*3+1));
  
            if (eleccion==1){
                char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
                password+=minusculas;
            }
            else{
                if(eleccion==2){
                    char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    password+=mayusculas;
                }
                else{
                    char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
                    password+=numeros;
                }
            }
        }
        return password;
	}
	public String getContrase�a() {
		return contrase�a;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
}
