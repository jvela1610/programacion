import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Password {

	private static final int LONGITUD = 8;
	private String contrasenna;
	private int longitud;

	public Password() {
		super();
		this.contrasenna = generarPassword();
	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.contrasenna = generarPassword();
	}

	public boolean esFuerte() {
		boolean fuerte = false;
		int contadorMayusculas = 0, contadorMinusculas = 0, contadorNumeros = 0;
		for (int i = 0; i < contrasenna.length(); i++) {
			if (this.contrasenna.charAt(i) >= 65 && this.contrasenna.charAt(i) <= 90) {
				contadorMayusculas++;
			}
			if (this.contrasenna.charAt(i) >= 97 && this.contrasenna.charAt(i) <= 122) {
				contadorMinusculas++;
			}
			if (this.contrasenna.charAt(i) >= 48 && this.contrasenna.charAt(i) <= 57) {
				contadorNumeros++;
			}
		}
		if (contadorMayusculas == 2 && contadorMinusculas == 1 && contadorNumeros == 5) {
			fuerte = true;
		}
		return fuerte;
	}

	public String generarPassword() {
		String contrasenaCreada = "";
		for (int i = 0; contrasenaCreada.length() < longitud; i++) {
			int numero = (int) ThreadLocalRandom.current().nextInt(48, 123);
			char caracter = (char) numero;
			contrasenaCreada += caracter;
		}
		return contrasenaCreada;
	}

	private String getContrasenna() {
		return contrasenna;
	}

	private int getLONGITUD() {
		return longitud;
	}

	@Override
	public int hashCode() {
		return Objects.hash(longitud, contrasenna);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Password other = (Password) obj;
		return Objects.equals(contrasenna, other.contrasenna) && longitud == other.longitud;
	}

	@Override
	public String toString() {
		return "Password [contrasenna=" + contrasenna + ", longitud=" + longitud + "]";
	}

}
