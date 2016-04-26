package com.cesarramirez23.OnlineShop;

public class Tv extends Electronic{

 int tamaño; 
	
	private String color;
	
	public Tv(double regularprice,String manufactura, int tamaño)
	{
		super(regularprice, manufactura);
		this.tamaño=tamaño;
	}
	
	public double preciodeventa()
	{
		return super.getRegularprice()* 100;
	}
	
}
