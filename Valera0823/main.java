package main;
import empleados.comerciales;
import empleados.repartidores;
import java.util.ArrayList;

import empleados.empleado;
public class main {

	
	public static ArrayList<empleado> lista = new ArrayList<empleado>();
	public static ArrayList<repartidores> repartidores = new ArrayList<repartidores>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		repartidores r_1 = new repartidores("juan","lopez",22,"matutino",1500,"moto","A14B452");
		repartidores r_2 = new repartidores("Pedro","Perez",22,"matutino",1500,"moto","BATE524");
		repartidores r_3 = new repartidores("Pancho","Gutierrez",22,"matutino",1500,"moto","WE4B452");
		comerciales c_1 = new comerciales("Fernando","Bazan",22,"matutino",1500,"Publico","Gerente",15);
		
		lista.add(r_1);
		lista.add(r_2);
		lista.add(r_3);
		lista.add(c_1);
		
		repartidores.add(r_1);
		repartidores.add(r_2);
		repartidores.add(r_3);
		System.out.println("Empieza el dia Todos registran Su entrada :");
		for(empleado EMP : lista)
		{
			System.out.print (EMP.getNombre()+" "+ EMP.getApellido()+" ");
			EMP.ChecarEntrar();
		}
		
		System.out.println("El genrente "+c_1.getNombre());
		c_1.Vender();
		System.out.println("El genrente "+c_1.getNombre());
		c_1.Orginizar();
		System.out.println("A los repartidores");
		
		System.out.println("Los repartidores Comienzan");
		for(repartidores EMP : repartidores)
		{
			System.out.print (EMP.getNombre()+" "+ EMP.getApellido()+" ");
			EMP.RecojerPaquete();
		}
		for(repartidores EMP : repartidores)
		{
			System.out.print (EMP.getNombre()+" "+ EMP.getApellido()+" ");
			EMP.Repartir();
		}
		System.out.println("Fin del dia");
		for(empleado EMP : lista)
		{
			System.out.print (EMP.getNombre()+" "+ EMP.getApellido()+" ");
			EMP.ChecarSalida();
		}
	}

}
