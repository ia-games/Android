package com.rsofia.Animales;

public class Reptil extends Animal{

	private boolean Venenoso;
	
	public Reptil(String _nom, boolean _ven)
	{
		super(_nom);
		Venenoso = _ven;
	}

	public boolean isVenenoso() {
		return Venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		Venenoso = venenoso;
	}
	
	
}
