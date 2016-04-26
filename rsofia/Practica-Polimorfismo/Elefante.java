package com.rsofia.Animales;

public class Elefante extends Mamifero{

	private String lider;
	
	public Elefante(String _nom, String _ubicacion,  String _lider)
	{
		super(_nom, _ubicacion);
		lider = _lider;
	}

	public String getLider() {
		return lider;
	}

	public void setLider(String lider) {
		this.lider = lider;
	}

	
	
}
