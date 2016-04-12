package com.cesarramirez23.numeros_primos;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
Scanner ingresa= new Scanner(System.in);
double R_1;
double I_1;
double R_2;
double I_2;
System.out.println("Ingresa la parte real del primer binomio");	
R_1= ingresa.nextDouble();
System.out.println("Ingresa la parte imaginaria del primer binomio");
I_1= ingresa.nextDouble();
System.out.println("Ingresa la parte real del segundo binomio");	
R_2= ingresa.nextDouble();
System.out.println("Ingresa la parte imaginaria del segundo binomio");
I_2= ingresa.nextDouble();

complejos NUMERO;
NUMERO= new complejos(R_1,I_1,R_2,I_2 );
 NUMERO.Suma();
NUMERO.Restar();
NUMERO.Multiplicar();
NUMERO.Dividir();

ingresa.close();
	}

}
