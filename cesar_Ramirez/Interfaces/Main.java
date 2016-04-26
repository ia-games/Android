package com.cesarramirez23.OnlineShop;

public class Main {

	public static void main(String[] args) 
	{
	Product [] pa= new Product[4];
		pa[0]= new Tv( 2000, "marca", 23);
		pa[1]= new Tv( 2234, "marca1", 14);
		pa[2]= new reproductor( 2570, "reprodcutor1", "rojo");
		pa[3]= new libro( 2670, "publicacion hgu234", 1943);
		
		double totalprecioregular=0;
		double totalpreciodeventa=0;
		
		
		for (int i =0; i<pa.length; i++)
		{
			totalprecioregular += pa[i].getRegularprice();
			totalpreciodeventa += pa[i].preciodeventa();
			System.out.println("item :" + i +" tipo " + pa[i].getClass().getName() + " precioregular "+ pa[i].getRegularprice() + "precio de venta "+ pa[i].preciodeventa()  );
		}
		
		System.out.println("precio regular= "+totalprecioregular);
		System.out.println("precio de venta= "+totalpreciodeventa);
	}

}
