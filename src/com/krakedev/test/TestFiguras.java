package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figura figura = new Figura ("Figura", "Rojo");
		Cuadrado cuadrado = new Cuadrado ("Cuadrado","Verde");
		Triangulo triangulo = new Triangulo ("Triangulo", "Azul");
		
		System.out.println(figura);
		System.out.println(cuadrado);
		System.out.println(triangulo);
		
		Graficador grfcador = new Graficador();
		
		grfcador.graficar(figura);
		grfcador.graficar(cuadrado);
		grfcador.graficar(triangulo);

	}

}
