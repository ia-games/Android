package empleados;

public class comerciales extends empleado {

	private String giro;
	private String puesto;
	private int comicion;
	
	public comerciales(String _n,String _a ,int _ed , String _t , int _s,String _g , String _p , int _c){
		super(_n,_a,_ed,_t,_s);
		this.giro = _g;
		this.puesto = _p;
		this.comicion = _c;
	}
	public String getGiro() {
		return giro;
	}
	public void setGiro(String giro) {
		this.giro = giro;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public int getComicion() {
		return comicion;
	}
	public void setComicion(int comicion) {
		this.comicion = comicion;
	}
	public void Vender()
	{
		System.out.println("Empieza una venta");
	}
	public void hacerpublicidad()
	{
		System.out.println("El comerciante intenta crear publicidad");
	}
	public void Orginizar()
	{
		System.out.println("Organiza");
	}

	
}
