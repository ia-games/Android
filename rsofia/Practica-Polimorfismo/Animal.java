package com.rsofia.Animales;

public class Animal {
	
	private String nombre;
	
	public Animal(String _nombre)
	{
		nombre = _nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void NumeroPatas()
	{
		System.out.println("Tengo 4 patas: animal " + nombre);
	}

}
