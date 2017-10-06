package Aula46ex;

public class Cilindro extends Figura3D {

	private int altura;
	private double raio;
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	@Override
	public double calculaVolume() {
		return Math.PI * Math.pow(raio, 2) * altura;
	}

	@Override
	public double calculaArea() {
		double areaDaBase = Math.PI * Math.pow(raio, 2);
		double areaLateral = 2 * Math.PI * raio * altura;
		double areaTotal = 2 * areaDaBase + areaLateral;
		return areaTotal;
	}
}
