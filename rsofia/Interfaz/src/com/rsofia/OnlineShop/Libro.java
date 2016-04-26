package com.rsofia.OnlineShop;

public class Libro extends Product {
	
	private String published;
	private int yearPublished;
	
	public Libro(double _precio, String _published, int _year)
	{
		super(_precio);
		published = _published;
		yearPublished = _year;
	}
	
	public double PrecioDeVenta()
	{
		return super.getRegularPrice() * 4;
	}

	public String getPublished() {
		return published;
	}

	public void setPublished(String published) {
		this.published = published;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	
	

}
