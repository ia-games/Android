package com.rsofia.Animales;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cualquierAnimal = new Animal("Un Animal");
		Mamifero cualquierMamifero = new Mamifero("Un Mamifero", "India");
		Pez pez1 = new Pez("Dory", "Agua Dulce");
		Reptil reptil1 = new Reptil("Brutus", false);
		Humano humano1 = new Humano("Perla", "Alaska", 687);
		Mamifero humano2 = new Humano("Scott", "Canada", 356);
		Elefante elefante1 = new Elefante("Jumbo", "India", "Matriarcado");
		Mamifero elefante2 = new Elefante("Dexter", "Congo", "Matriarcado");
		
		cualquierAnimal.NumeroPatas();
		cualquierMamifero.NumeroPatas();
		pez1.NumeroPatas();
		reptil1.NumeroPatas();
		humano1.NumeroPatas();
		humano2.NumeroPatas();
		elefante1.NumeroPatas();
		elefante2.NumeroPatas();
		

	}

}
