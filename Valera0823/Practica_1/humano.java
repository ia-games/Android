package com.Valera0823.P1;

public class humano extends mamifero{

	public String Nombre;
	public String Nacionalidad;
	
	public humano(int _patas, String _ali,String _nc,String _n)
	{
		super(_patas,_ali);
		this.Nacionalidad = _nc;
		this.Nombre = _n;
	}

	public String getNacionalidad() {
		return Nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		Nacionalidad = nacionalidad;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public void mostrardatos()
	{
		System.out.println("Humano:->"+this.getNombre()+" Numero Patas:"+this.getPatas()+" Alimentacion:"+this.getAlimentacion()+" Nacionalidad:"+this.getNacionalidad());
	}
	
}
