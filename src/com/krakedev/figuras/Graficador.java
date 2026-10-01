package com.krakedev.figuras;

public class Graficador {
	public void graficar (Figura fig) {
		
		System.out.println("Area: " + fig.calcularArea());
		System.out.println("Perimetro: " + fig.calcularPerimetro());
		
//		System.out.println(
//				"Graficando " + fig.getNombre()
//				+ " de color " + fig.getColor()
//				+ " con perimetro " + fig.calcularPerimetro()
//				+ " con área " + fig.calcularArea());
//				
		// Polimorfismo
		//Cuando ejecutamos algun metodo, no se ejecuta 
		//el metodo correspondiente al tipo real del objeto
		
		//Polimorfismo: Un mismo metodo puede comportarse de diferentes formas
		// dependiendo del objeto que lo utiliza.
		// Es palabras sencillas es solo un metodo, multiples comportamientos
		
	}
	
	
}
