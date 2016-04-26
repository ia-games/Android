package com.cesarramirez23.OnlineShop;

public abstract class Electronic  extends Product {

	private String Manufactura;
	
	public Electronic(double regularprice, String manufactura)
	{
		super(regularprice);
		this.Manufactura= manufactura;
	}

	public String getManufactura() {
		return Manufactura;
	}

	public void setManufactura(String manufactura) {
		Manufactura = manufactura;
	}
	
	
}
