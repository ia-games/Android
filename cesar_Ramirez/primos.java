package com.cesarramirez23.numeros_primos;
import java.util.Scanner;

public class primos {

	public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
	double numero=0;
	double cantidad=0;
	System.out.println("Ingresa un numero");
	
	numero= in.nextDouble();  
       for(int i=1;i<(numero+1);i++){  
       if(numero%i==0){  
           cantidad++;  
          }  
       }  
       if(cantidad!=2){  
    	   System.out.println(numero+" No es Primo");  
          }else{  
        	  System.out.println(numero+" Es primo");
          }

       in.close();
	}

}
