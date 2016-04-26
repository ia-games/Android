package com.rsofia.Animales;

public class Mamifero extends Animal {
	
	private String ubicacion;
	
	public Mamifero(String _nom, String _u)
	{
		super(_nom);
		ubicacion = _u;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

}
