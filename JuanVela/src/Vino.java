
public class Vino {
	
	//Definimos las variables
	private String nombre;
	private double graduacion;
	private String descripcion;
	
	//Definimos los constructores
	public Vino(String descripcion) {
		super();
		this.setDescripcion(descripcion);

	}
	public Vino(String descripcion, double graduacion) {
		super();
		this.setDescripcion(descripcion);
		this.graduacion = graduacion;
	}
	
	//Definimos los métodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getGraduacion() {
		return graduacion;
	}
	public void setGraduacion(double graduacion) {
		this.graduacion = graduacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
