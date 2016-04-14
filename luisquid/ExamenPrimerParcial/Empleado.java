package com.luisquid11.Examen;

public class Empleado {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldo;
	
	Empleado()
	{
		
	}
	
	Empleado(int id, String nombre, String apellido, int edad, double sueldo)
	{
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public void cobrar()
	{
		System.out.println("El empleado" + getNombre() + getApellido() + "cobro su sueldo de " + getSueldo());
	}
	
	public void reunion()
	{
		System.out.println("El empleado " + getNombre() + getApellido() + "ha atendido la reunion");
	}
	
	
	
	
}
