package com.rsofia.Animales;

public class Humano extends Mamifero {
	
	private int numSocial;
	
	public Humano(String _nom, String _ubicacion, int _numSocial)
	{
		super(_nom, _ubicacion);
		numSocial = _numSocial;
	}

	public int getNumSocial() {
		return numSocial;
	}

	public void setNumSocial(int numSocial) {
		this.numSocial = numSocial;
	}
	
	public void NumeroPatas()
	{
		System.out.println("Tengo 2 patas: humano " + this.getNombre());
	}


}
