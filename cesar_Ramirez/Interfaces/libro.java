package com.cesarramirez23.OnlineShop;

public class libro extends Product{

	private String publicacion;
	private int año_publicacion;
	
	public libro(double regularprice, String publicacion, int year)
	{
		super(regularprice);
		this.publicacion=publicacion;
		this.año_publicacion=year;
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

	public int getAño_publicacion() {
		return año_publicacion;
	}

	public void setAño_publicacion(int año_publicacion) {
		this.año_publicacion = año_publicacion;
	}
	
}
