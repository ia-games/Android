package empleados;

public class empleado {

	private String Nombre;
	private String Apellido;
	private int Edad;
	private String Turno;
	private int Sueldo;
	
	public empleado(){
		
	}
	
	public empleado(String _n,String _a ,int _ed , String _t , int _s){
		this.Nombre = _n;
		this.Apellido = _a;
		this.Edad = _ed;
		this.Turno = _t;
		this.Sueldo = _s;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String _nombre) {
		Nombre = _nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String _apellido) {
		Apellido = _apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int _edad) {
		Edad = _edad;
	}
	public String getTurno() {
		return Turno;
	}
	public void setTurno(String _turno) {
		Turno = _turno;
	}
	public int getSueldo() {
		return Sueldo;
	}
	public void setSueldo(int _sueldo) {
		Sueldo = _sueldo;
	}
	public void ChecarEntrar()
	{
		System.out.println("Checar datos de Entrada");
	}
	public void ChecarSalida()
	{
		System.out.println("Checar datos de Salida");
	}
	public void Descanso()
	{
		System.out.println("Descansar");
	}
	
}
