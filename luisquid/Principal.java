package com.luisquid11.Ejercicios;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
/*JAVA Basico
Crea una aplicaci�n que nos convierta un n�mero en base decimal a
 binario. Esto lo realizara un m�todo al que le 
 pasaremos el numero como par�metro, devolver� un 
 String con el numero convertido a binario. Para 
 convertir un numero decimal a binario, debemos dividir 
 entre 2 el numero y el resultado de esa divisi�n se 
 divide entre 2 de nuevo hasta que no se pueda dividir 
 mas, el resto que obtengamos de cada divisi�n formara 
 el numero binario, de abajo a arriba.

Veamos un ejemplo: si introducimos un 8 nos deber� 
devolver 1000*/

/*JAVA POO
Crea una clase Libro con los m�todos pr�stamo, 
devoluci�n y toString. La clase contendr� un 
constructor por defecto, un constructor 
con par�metros y los m�todos getters y setters.*/

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
