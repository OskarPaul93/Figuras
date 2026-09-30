package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c= new Cuadrado ("Cuadrado", "Azul", 5);
		Rectangulo r = new Rectangulo ("Rectangulo", "Amarillo", 10, 5);
		
		System.out.println ("Perimetro del cuadrado: " + c.calcularPerimetro());
		System.out.println ("Perimetro del rectangulo: " + r.calcularPerimetro());
		

	}

}
