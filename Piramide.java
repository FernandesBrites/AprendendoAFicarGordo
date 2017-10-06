package Aula46ex;

public class Piramide extends Figura3D {

	private double altura;
	private double arestaBase;
	private double apotema;
	private int numPoliBase;
	private Figura2D base;
	
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getApotema() {
		return apotema;
	}
	public void setApotema(double apotema) {
		this.apotema = apotema;
	}
	
	public double getArestaBase() {
		return arestaBase;
	}
	
	public void setArestaBase(double arestaBase) {
		this.arestaBase = arestaBase;
	}
	
	public Figura2D getBase() {
		return base;
	}
	
	public void setBase(Figura2D base) {
		this.base = base;
	}
	
	public int getNumPoliBase() {
		return numPoliBase;
	}
	
	public void setNumPoliBase(int numPoliBase) {
		this.numPoliBase = numPoliBase;
	}
	
	@Override
	public double calculaVolume() {
		if (base != null) {
		return (numPoliBase * ((arestaBase * apotema)/2) + base.calculaArea());
	}
		return 0;
	}

	@Override
	public double calculaArea() {
		if (base != null) {
		return (base.calculaArea() * altura)/3;
	}
		return 0;
	}
}
