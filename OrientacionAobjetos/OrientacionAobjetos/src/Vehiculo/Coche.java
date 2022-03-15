package Vehiculo;

import java.time.LocalDate;
public class Coche extends Vehiculo {

	private CarburanteEnumerado carburante;

	public Coche(String matricula, String gama, LocalDate fechaSalida, String carburante) {
		throws VehiculoException{
			super(matricula, gama, fechaSalida);
			this.carburante = CarburanteEnumerado.valueOf(carburante.toUpperCase());
			
		}
	}

}
