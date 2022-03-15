package Vehiculo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Vehiculo {
	private String matricula;
	private GamaEnumerado gama;
	private LocalDate fechaEntrada;
	private LocalDate fechaSalida;

	public enum GamaEnumerado {
		alta, media, baja;
	}

	public Vehiculo(String matricula, GamaEnumerado gama, LocalDate fechaSalida) {
		super();
		this.matricula = matricula;
		this.gama = GamaEnumerado.valueOf(gama.toUpperCase());
		this.fechaEntrada = LocalDate.now();
		if (fechaSalida.isBefore(this.fechaEntrada))
			throw new VehiculoException("Fecha de salida debe ser posterior a la de entrada");
		this.fechaSalida = fechaSalida;
	}

	public double getPrecio() {
		if (this.fechaSalida == null) {
			this.fechaSalida = LocalDate.now();
		}
		double resultado = gama.getPrecio() * (int) fechaSalida.until(fechaEntrada, ChronoUnit.DAYS);
		return resultado;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public GamaEnumerado getGama() {
		return gama;
	}

	public void setGama(GamaEnumerado gama) {
		this.gama = gama;
	}

	public LocalDate getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(LocalDate fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public LocalDate getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDate fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(fechaEntrada, fechaSalida, gama, matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(fechaEntrada, other.fechaEntrada) && Objects.equals(fechaSalida, other.fechaSalida)
				&& gama == other.gama && Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", gama=" + gama + ", fechaEntrada=" + fechaEntrada
				+ ", fechaSalida=" + fechaSalida + "]";
	}

}
