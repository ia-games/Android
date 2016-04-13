package com.luisquid11.Ejercicios;

public class Libro {

	private String titulo;
	private String autor;
	private int numPaginas;
	private String editorial;
	private int edicion;
	private int anio;
	private boolean prestado;
	//Constructor normal
	Libro()
	{
		
	}
	
	//Constructor con parametros
	Libro(String titulo, String autor, String editorial, int numPaginas, int edicion, int anio, boolean prestado)
	{
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
		this.numPaginas = numPaginas;
		this.edicion = edicion;
		this.anio = anio;
		this.prestado = prestado;
	}
	
	//Vuelve prestado a true
	public void prestamo()
	{
		this.prestado = true;
	}
	
	//Vuelve prestado a false
	public void devolucion()
	{
		this.prestado = false;
	}
	
	//Set y Get
	public void setTitulo(String _titulo)
	{
		this.titulo = _titulo;
	}
	
	public String getTitulo()
	{
		return this.titulo;
	}
	
	public void setAutor(String _autor)
	{
		this.autor = _autor;
	}
	
	public String getAutor()
	{
		return this.autor;
	}
	
	public void setEditorial(String _editorial)
	{
		this.editorial = _editorial;
	}
	
	public String getEditorial()
	{
		return this.editorial;
	}
	
	public void setNumPaginas(int numPaginas)
	{
		this.numPaginas = numPaginas;
	}
	
	public int getNumPaginas()
	{
		return this.numPaginas;
	}
	
	public void setAnio(int anio)
	{
		this.anio = anio;
	}
	
	public int getAnio()
	{
		return this.anio;
	}
	
	//Metodo toString con int
	public String toString(int elemento)
	{
		String _elemento = "" + elemento;
		return _elemento;
	}
	
	//Metodo toString con float
	public String toString(float  elemento)
	{
		String _elemento = "" + elemento;
		return _elemento;
	}
}

