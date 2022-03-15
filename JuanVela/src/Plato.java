
public class Plato {
	//Definimos las variables
	private String nombre;
	private double precio = 0;
	private double IVA = 21;
	
	//Definimos los constructores
	public Plato(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public Plato(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		
	}


	//Definimos los métodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getIVA() {
		return IVA;
	}
	public void setIVA(double iVA) {
		IVA = iVA;
	}
	public double getPrecioBase() {
		return precio;
	}
	public double getPrecioVentaPublico() {
		return precio * IVA %100;
	}
	public void incrementaPrecio(double incremento) {
		
	}
	

}
