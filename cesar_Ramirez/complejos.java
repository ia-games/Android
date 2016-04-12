package com.cesarramirez23.numeros_primos;

public class complejos {
	public double Parte_real1;
	public double Parte_imaginaria1;
	public double Parte_real2;
	public double Parte_imaginaria2;
	
	complejos(double REAL_1, double IMAG_1, double REAL_2, double IMAG_2)
	{
		this.Parte_real1=REAL_1;
		this.Parte_imaginaria1= IMAG_1;
		this.Parte_real2= REAL_2;
		this.Parte_imaginaria2= IMAG_2;
	}
	public void Suma()
	{
		double SumaR = 0;
		double SumaI = 0;
		SumaR = this.Parte_real1+ this.Parte_real2;
		SumaI = this.Parte_imaginaria1 + this.Parte_imaginaria2;
		
		if (SumaR == 0 && SumaI == 0){
			 System.out.println("tu suma es:   0\n");
		}
		 else if(SumaR == 0){
			 System.out.println( "tu suma es:   " + SumaI  +"i\n");
		}
		else if (SumaI == 0){
			 System.out.println( "tu suma es:   " +SumaR +"\n");
		}
		else if(SumaI<0){
			 System.out.println( "tu suma es:   "+SumaR + "" + SumaI + "i\n");
		}
		 
		else{
			 System.out.println( "tu suma es:" + SumaR +"+" + SumaI + "i\n");
		}
	}
	public void Restar()
	{
		double RestaR = 0;
		double RestaI = 0;
		RestaR = this.Parte_real1- this.Parte_real2;
		RestaI = this.Parte_imaginaria1 - this.Parte_imaginaria2;
		
		if (RestaR == 0 && RestaI == 0){
			System.out.println("tu resta es:   0\n");
		}
		else if (RestaR == 0){
			System.out.println("tu resta es:   " + RestaI + "i\n");
		}
		else if (RestaI == 0){
			System.out.println("tu resta es:   " + RestaR + "\n");
		}
		else if (RestaI < 0){
			System.out.println("tu resta es:   "+RestaR +"" + RestaI + "i\n");
		}
		else
			System.out.println("tu resta es:  "+ RestaR + "+" + RestaI + "i\n");
	
	}
	public void Multiplicar()
	{
		double BinomioR = 0;
		double BinomioI = 0;

		BinomioR = ((this.Parte_real1 * this.Parte_real2) - (this.Parte_imaginaria1 * this.Parte_imaginaria2) );
		BinomioI = ((this.Parte_real1 * this.Parte_imaginaria2) + (this.Parte_imaginaria1 * this.Parte_real2) );

		
		if (BinomioR == 0&& BinomioI==0){
			System.out.println("tu multiplicacion es:   0\n");
		}
		else if (BinomioR == 0){
			System.out.println("tu multiplicacion es:   " + BinomioI + "i\n");
		}
		else if (BinomioI == 0){
			System.out.println("tu multiplicacion es:   " + BinomioR + "\n");
		}
		else if (BinomioI<0){
			System.out.println("tu multiplicacion es:   " + BinomioR + "" + BinomioI + "i\n");
		}
		else{
			System.out.println( "tu multiplicacion es:"  + BinomioR + "+" + BinomioI + "i\n");
		}

	}
	public void Dividir()
	{
		double abajo = 0;


		double binomioR = 0;
		double binomioI = 0;
		abajo = 0;

		binomioR = ((this.Parte_real1 * this.Parte_real2) + (this.Parte_imaginaria1 * this.Parte_imaginaria2));
		binomioI = ((this.Parte_real2 * this.Parte_imaginaria1) - (this.Parte_imaginaria2 * this.Parte_real1));
		abajo = ((this.Parte_real2* this.Parte_real2) + (this.Parte_imaginaria2*this.Parte_imaginaria2));

		if (abajo <= 0){
			System.out.println("No se puede dividir un numero entre 0\n");
		}
		else if (binomioR == 0 && binomioI == 0){
			System.out.println("tu division es:   0\n");
		}
		else if (binomioR == 0){
			System.out.println( "tu division es:   (" + binomioI + "/" + abajo + "i\n");
		}
		else if (binomioI == 0){
			System.out.println("tu division es:   (" + binomioR + ")/" + abajo + "\n");
		}
		else if (binomioI<0){
			System.out.println( "tu division es:  [( " + binomioR + ")/" + abajo + "] +[(" + binomioI + ")/" + abajo + "i]\n");
		}
		else{
			System.out.println("tu division es:([" + binomioR+ "]/" + abajo + ") + [(" + binomioI + ")/" + abajo + "i]\n");
		}

	}
}
