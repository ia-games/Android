package com.luisquid11.Examen;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repartidor rep = new Repartidor(1, "Luis", "Bazan", 34, 5000.00, "Mazda", 300);		
		rep.mostrarDatos();
		rep.cargarGas();
		rep.cobrar();
		
		Comercial com = new Comercial(1, "Bernardo", "Bravo", 21, 4500.00, "Plaza del Sol", 0);
		com.mostrarDatos();
		com.realizaVentas();
		com.numeroTotalVentas();
	}

}
