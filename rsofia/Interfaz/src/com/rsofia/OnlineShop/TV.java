package com.rsofia.OnlineShop;

public class TV extends Electronic{

	private int screenSize;
	
	public TV(double _precio, String _man, int _screenSize)
	{
		super(_precio, _man);
		screenSize = _screenSize;
	}
	
	//Se implementa el metoddo abstracto
	public double PrecioDeVenta()
	{
		return super.getRegularPrice() * 15;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	
	
}
