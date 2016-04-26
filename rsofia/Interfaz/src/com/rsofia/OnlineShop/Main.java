package com.rsofia.OnlineShop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Product[] pa = new Product[4];
	
	pa[0] = new TV(500.0, "LG", 26);
	pa[1] = new TV(1500.0, "Samnsung", 40);
	pa[2] = new Ipod(5000.0, "Apple", "verde");
	pa[3] = new Libro(100.0, "Alfaguara", 2001);
	
	double totalRegularPrice = 0;
	double totalPrecioDeVenta = 0;
	
	for(int i = 0; i < pa.length; i++)
	{
		totalRegularPrice += pa[i].getRegularPrice();
		totalPrecioDeVenta += pa[i].PrecioDeVenta();
		System.out.println("Item: " + i + " Tipo: " + pa[i].getClass().getName() + " \nPrecio Regular: " + pa[i].getRegularPrice() + "\nPrecio de Venta: " + pa[i].PrecioDeVenta() + "\n");
		
	}

	System.out.println("Total Precio Regular: " + totalRegularPrice);
	System.out.println("Total Precio de Venta: " + totalPrecioDeVenta + "\n");
	
	}

}
