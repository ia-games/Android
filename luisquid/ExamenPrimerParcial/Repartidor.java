package com.luisquid11.Examen;

public class Repartidor extends Empleado{
	
	private String modeloAuto;
	private int kilometros;
	
	Repartidor()
	{
		super();
	}
	
	Repartidor(int id, String nombre, String apellido, int edad, double sueldo, String modeloAuto, int kilometros)
	{
		super(id,nombre,apellido,edad,sueldo);
		this.modeloAuto = modeloAuto;
		this.kilometros = kilometros;
	}

	public String getModeloAuto() {
		return modeloAuto;
	}

	public void setModeloAuto(String modeloAuto) {
		this.modeloAuto = modeloAuto;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}
	
	public void realizarEntrega()
	{
		System.out.println("El repartidor "+ getNombre() + getApellido() +" salio a realizar entrega");
	}
	
	public void cargarGas()
	{
		System.out.println("El repartidor "+ getNombre() + getApellido() + " cargo gasolina");
	}
	
	public void mostrarDatos()
	{
		System.out.println("Id = " + getId());
		System.out.println("Nombre = " + getNombre());
		System.out.println("Apellido = " + getApellido());
		System.out.println("Edad = " + getEdad());
		System.out.println("Sueldo  = " + getSueldo());
		System.out.println("Modelo Auto  = " + getModeloAuto());
		System.out.println("Tiendas  = " + getKilometros());
	}
}
