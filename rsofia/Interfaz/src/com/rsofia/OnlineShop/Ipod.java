package com.rsofia.OnlineShop;

public class Ipod extends Electronic{
	
	private String color;
	
	public Ipod(double _precio, String _man, String _color)
	{
		super(_precio, _man);
		color = _color;
	}
	
	//Se implementa el metoddo abstracto
	public double PrecioDeVenta()
	{
		return super.getRegularPrice() * 17;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
