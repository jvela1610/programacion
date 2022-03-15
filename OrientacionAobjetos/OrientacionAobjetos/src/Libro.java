
import java.util.Objects;

/**
 * 
 * @author estudiante
 *
 */

public class Libro{
	private String titulo;
	private String editorial;
	private double precio= 0;
	private double IVA=0;
	private String fecha;
	private String Isbn;
	private Autor a;
/**
 * 	
 * @param titulo
 * @param editorial
 * @param precio
 * @param isbn
 */
	
	public Libro(String titulo, String editorial, double precio, String isbn) {
		super();
		this.titulo = titulo;
		this.editorial = editorial;
		this.precio = precio;
		Isbn = isbn;
	}
	public Libro(String titulo, String nombre, String apellido, double precio) {
		super();
		a = new Autor(apellido,nombre);
		this.IVA=0.21;
		
		
	
	}
	private String Isbn() {
		return this.titulo.substring(0, 1)+this.a.getNombre().subSequence(0, 1);
		
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
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
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getIsbn() {
		return Isbn;
	}
	public void setIsbn(String isbn) {
		Isbn = isbn;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Isbn, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(Isbn, other.Isbn) && Objects.equals(titulo, other.titulo);
	}







}

