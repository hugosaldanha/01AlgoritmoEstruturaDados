package lista2;

public class Circulo {

	private double raio;
		
	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double calculaArea() {
		return Math.PI*(raio*raio);
	}
		
}
