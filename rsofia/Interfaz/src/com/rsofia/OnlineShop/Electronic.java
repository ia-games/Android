package com.rsofia.OnlineShop;

public abstract class Electronic extends Product{
	
	private String manufacture;
	
	public Electronic(double _precio, String _man)
	{
		super(_precio);
		manufacture = _man;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	

}
