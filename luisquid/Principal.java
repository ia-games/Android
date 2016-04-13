package com.luisquid11.Ejercicios;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
/*JAVA Basico
Crea una aplicación que nos convierta un número en base decimal a
 binario. Esto lo realizara un método al que le 
 pasaremos el numero como parámetro, devolverá un 
 String con el numero convertido a binario. Para 
 convertir un numero decimal a binario, debemos dividir 
 entre 2 el numero y el resultado de esa división se 
 divide entre 2 de nuevo hasta que no se pueda dividir 
 mas, el resto que obtengamos de cada división formara 
 el numero binario, de abajo a arriba.

Veamos un ejemplo: si introducimos un 8 nos deberá 
devolver 1000*/

/*JAVA POO
Crea una clase Libro con los métodos préstamo, 
devolución y toString. La clase contendrá un 
constructor por defecto, un constructor 
con parámetros y los métodos getters y setters.*/

public class Principal extends JFrame{

	private JFrame f;
	private JPanel p;
	private JButton b1;
	private JLabel lab;
	private JTextField field;
	public Principal()
	{
		gui();
	}
	
	public void gui()
	{
		f = new JFrame("Conversion binaria");
		f.setVisible(true);
		f.setSize(600, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.black);
		
		b1 = new JButton("Convert");
		lab = new JLabel("Dame el numero a convertir");
		field = new JTextField(10);
		
		p.add(lab);
		p.add(b1);
		//p.add(field);
		f.add(p);
	}
	
	public static void main(String[] args) {
		System.out.println("Dame un numero para convertir a binario: ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		System.out.println(returnBinary(n));
		reader.close();
	}

	public static String returnBinary(int n)
	{
		int residuo;
		String strRes = "";
		
		while(n >=1)
		{
			residuo = n%2;
			strRes = residuo +strRes;
			n = n/2;
		}
        //strRes = Integer.toBinaryString(n);
        
        return strRes;
	}
}
