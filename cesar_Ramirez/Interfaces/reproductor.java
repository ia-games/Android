package com.cesarramirez23.OnlineShop;

public class reproductor extends Electronic {

	private String color;
	
	public reproductor(double regularprice,String manufactura, String color)
	{
		super(regularprice, manufactura);
		this.color=color;
	}
	
	public double preciodeventa()
	{
		return super.getRegularprice()* 10;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
