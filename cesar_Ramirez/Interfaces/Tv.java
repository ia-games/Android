package com.cesarramirez23.OnlineShop;

public class Tv extends Electronic{

 int tama�o; 
	
	private String color;
	
	public Tv(double regularprice,String manufactura, int tama�o)
	{
		super(regularprice, manufactura);
		this.tama�o=tama�o;
	}
	
	public double preciodeventa()
	{
		return super.getRegularprice()* 100;
	}
	
}
