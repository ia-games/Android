package com.Valera0823.P1;

public class animal {

	private int patas;
	private String alimentacion;
	
	public animal()
	{
		this.patas = 0;
		this.alimentacion = "";
	}
	
	public animal(int _patas, String _ali)
	{
		this.patas = _patas;
		this.alimentacion = _ali;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	
	
}
