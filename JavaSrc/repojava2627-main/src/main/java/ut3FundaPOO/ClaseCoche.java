package ut3FundaPOO;

public class ClaseCoche {
	/*atributos en min y privados
	 * 
	 */
	private String sColor;
	private int iVelocidad;
	private double dTamanyo;
	
	///constructir para poder construir los objetos: publico alt + sift + s + click en generete getters and setters
	public ClaseCoche(String paramColorCoche, int paramVelCoche, double paramTamayo) {
		this.sColor = paramColorCoche;
		this.iVelocidad = paramVelCoche;
		this.dTamanyo = paramTamayo;
	}
	///Para crear esto automaticamente alt + sift + s + click en generete getters and setters
	
	public void setColor (String elNuevoColorQueQuieroPoner) {
		this.sColor = elNuevoColorQueQuieroPoner;
	}
	
	public void setVelocidad (int laVelocidad) {
		this.iVelocidad = laVelocidad;
	}
	
	public void setTamanyo (double elTamanyo) {
		this.dTamanyo = elTamanyo;
	}
	
	public String getsColor() {
		return sColor;
	}
	
	public int getiVelocidad() {
		return iVelocidad;
	}
	
	public double getdTamanyo() {
		return dTamanyo;
	}

	///Se genera automaticamente con alt + sift + s click en Generateto String()
	public String toString() {
		return "ClaseCoche [Color=" + sColor + ", Velocidad=" + iVelocidad + ", Tamanyo=" + dTamanyo + "]";
	}
	
	//Métodos propios
	public void acelerar () {
		iVelocidad += 20;
	}
	
	public void pintar() {
		sColor = "Negro";
	}
	
	public void tunear() {
		sColor = "Amarillo";
		iVelocidad += 40;
		dTamanyo -= 1;
	}
}


