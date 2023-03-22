package EjercicioUno;

public class Respuestas {
	private String respuestas;
	private boolean correcta;
	
	public Respuestas(String respuestas) {
		this.respuestas = respuestas;
	}
	
	public void setRespuestas(String respuestas) {
		this.respuestas = respuestas;
	}
	public String getRespuestas() {
		return respuestas;
	}
	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}
	public boolean getCorrecta() {
		return correcta;
	}
	
	public String toString() {
		return respuestas;
	}
}
