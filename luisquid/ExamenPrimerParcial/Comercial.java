package com.luisquid11.Examen;

public class Comercial extends Empleado{
	
	private String tiendas;
	private int ventas;
	
	Comercial()
	{
		super();
	}
	
	Comercial(int id, String nombre, String apellido, int edad, double sueldo, String tiendas, int ventas)
	{
		super(id,nombre,apellido,edad,sueldo);
		this.tiendas= tiendas;
		this.ventas = ventas;
	}

	
	
	public String getTiendas() {
		return tiendas;
	}

	public void setTiendas(String tiendas) {
		this.tiendas = tiendas;
	}

	public int getVentas() {
		return ventas;
	}

	public void setVentas(int ventas) {
		this.ventas = ventas;
	}

	public void realizaVentas()
	{
		System.out.println("El comercial "+ getNombre() + getApellido() +" realizo una venta");
		this.ventas++;
	}
	
	public void numeroTotalVentas()
	{
		System.out.println("El repartidor "+ getNombre() + getApellido() + " realizo un numero total de " + getVentas() + " ventas");
	}
	
	public void mostrarDatos()
	{
		System.out.println("Id = " + getId());
		System.out.println("Nombre = " + getNombre());
		System.out.println("Apellido = " + getApellido());
		System.out.println("Edad = " + getEdad());
		System.out.println("Sueldo  = " + getSueldo());
		System.out.println("Tiendas  = " + getTiendas());
		System.out.println("Ventas  = " + getVentas());
	}
}
