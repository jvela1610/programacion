import java.util.Objects;

/**
 * 
 * @author estudiante
 *
 */
public class Autor {

		private String nombre;
		private String apellido;
		private String seudonimo;
		private String nacionalidad;
		
		/**
		 * 
		 * @param nombre
		 * @param apellido
		 */
		
		public Autor(String nombre, String apellido) {
			super();
			this.nombre = nombre;
			this.apellido = apellido;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		public String getSeudonimo() {
			return seudonimo;
		}
		public void setSeudonimo(String seudonimo) {
			this.seudonimo = seudonimo;
		}
		public String getNacionalidad() {
			return nacionalidad;
		}
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
		
		
}



	
