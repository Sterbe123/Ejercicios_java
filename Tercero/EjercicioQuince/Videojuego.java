package EjercicioQuince;

public class Videojuego implements Entregable{
	private String titulo;
	private int horaEstimada;
	private boolean entregado = false;
	private String genero;
	private String compa�ia;
	
	public Videojuego() {
		
	}
	public Videojuego(String titulo,int horaEstimada) {
		this.titulo = titulo;
		this.horaEstimada = horaEstimada;
	}
	public Videojuego(String titulo,int horaEstimada,String genero,String compa�ia) {
		this.titulo = titulo;
		this.horaEstimada = horaEstimada;
		this.genero = genero;
		this.compa�ia = compa�ia;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public double getHoraEsimada() {
		return horaEstimada;
	}
	public String getGenero() {
		return genero;
	}
	public String getCompa�ia() {
		return compa�ia;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setHoraEstimada(int horaEstimada) {
		this.horaEstimada = horaEstimada;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}
	
	public String toString() {
		return "\nTitulo: "+titulo+"\nHora Estimada: "+horaEstimada+"\nGenero: "+genero+"\nCompa�ia: "+compa�ia;
	}
	
	@Override
	public void entregar() {
		entregado = true;
		
	}
	@Override
	public void devolver() {
		entregado = false;
	}
	@Override
	public boolean isEntragado() {
		if(entregado==true) {
			return true;
		} else {
			return false;
		}
	}
	@Override
	public int compareTo(Object a) {
		Serie s = new Serie();
		int b = -1;
		if(this.horaEstimada==s.getNtemporadas()) {
			return 0;
		} else if(this.horaEstimada<s.getNtemporadas()) {
			return 1;
		}
		return b;
	}	
}
