package com.Valera0823.P1;

public class elefante extends mamifero{

	private String color;
	
	public elefante(int _patas, String _ali,String _cl)
	{
		super(_patas, _ali);
		this.setColor(_cl);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void MostrarDatos()
	{
		System.out.println("Elefante-> Color:"+this.getColor()+" Numero Patas:"+this.getPatas()+" Alimetnacion:"+this.getAlimentacion());
	}
}
