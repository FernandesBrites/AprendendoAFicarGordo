package Aula46ex;

public class Circulo extends Figura2D {

	private double raio;
	
	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaArea() {
		return raio * raio * Math.PI;
	}
}
