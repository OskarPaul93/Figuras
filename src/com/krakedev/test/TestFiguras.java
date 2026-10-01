package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura fig = new Cuadrado ("Figura", "Rojo",5);
//		Cuadrado cuadrado = new Cuadrado ("Cuadrado","Verde", 5);
		Triangulo triangulo = new Triangulo ("Triangulo", "Azul");
		TrianguloRectangulo tr = new TrianguloRectangulo ("Triangulo rectangulo", "Celeste", 3,4);
		
		Figura hex = new Hexagono ("Figura","Rojo",5);
		System.out.println("Area Hexagono: "+ hex.calcularArea());
		System.out.println("Perimetro Hexagono: " + hex.calcularPerimetro());
		
				
				
		System.out.println(fig);
		//System.out.println(cuadrado);
		System.out.println(triangulo);
		System.out.println(tr);
		
		Graficador grfcador = new Graficador();
		
		grfcador.graficar(fig);
		//grfcador.graficar(cuadrado);
		grfcador.graficar(triangulo);
		grfcador.graficar(tr);
		grfcador.graficar(hex);

	}

}
