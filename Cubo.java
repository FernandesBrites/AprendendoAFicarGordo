package Aula46ex;

public class Cubo extends Figura3D {

	private int aresta;
	
	public int getAresta() {
		return aresta;
	}
	
	public void setAresta(int aresta) {
		this.aresta = aresta;
	}
	
	@Override
	public double calculaVolume() {
		return Math.pow(aresta, 3);
	}

	@Override
	public double calculaArea() {
		return 6 * Math.pow(aresta, 2);
	}
}
