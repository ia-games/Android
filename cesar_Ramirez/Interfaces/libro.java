package com.cesarramirez23.OnlineShop;

public class libro extends Product{

	private String publicacion;
	private int a�o_publicacion;
	
	public libro(double regularprice, String publicacion, int year)
	{
		super(regularprice);
		this.publicacion=publicacion;
		this.a�o_publicacion=year;
	}

	public double preciodeventa()
	{
		return super.getRegularprice()* 15;
	}

	public String getPublicacion() {
		return publicacion;
	}

	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}

	public int getA�o_publicacion() {
		return a�o_publicacion;
	}

	public void setA�o_publicacion(int a�o_publicacion) {
		this.a�o_publicacion = a�o_publicacion;
	}
	
}
