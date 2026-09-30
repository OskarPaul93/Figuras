package com.krakedev.figuras;

public class Rectangulo extends Figura {
	private int base;
	private int altura;
	
	public Rectangulo(String nombre, String color, int base, int altura) {
		super (nombre, color);
		this.base = base;
		this.altura = altura;
	}
	
	//Este método ya existe en mi clase padre Figura, 
	//pero aquí en Rectangulo quiero darle mi propia implementación
	
	@Override
	public int calcularPerimetro () {
		return 2*base + 2*altura;
	}

}
