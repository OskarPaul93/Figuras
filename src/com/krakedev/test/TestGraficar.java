package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graficador graf = new Graficador ();
		Figura fig = new Figura("Figura","Amarillo");
		Cuadrado cuadr = new Cuadrado("Cuadrado", "Verde", 5);
		Rectangulo recta = new Rectangulo("Rectangulo", "Azul", 10,3);

		graf.graficar(fig);
		graf.graficar(cuadr);
		graf.graficar(recta);
		

	}

}
