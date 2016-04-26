package com.rsofia.Animales;

public class Pez extends Animal{
	
	private String tipoAgua;
	
	public Pez(String _nom, String _agua)
	{
		super(_nom);
		tipoAgua = _agua;
	}

	
	
	public String getTipoAgua() {
		return tipoAgua;
	}


	public void setTipoAgua(String tipoAgua) {
		this.tipoAgua = tipoAgua;
	}



	public void NumeroPatas()
	{
		System.out.println("No tengo patas: pez");
	}
}
