package Vehiculo;

import java.time.LocalDate;

import Vehiculo.Vehiculo;
import Vehiculo.VehiculoException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Vehiculo v = new Vehiculo("4579hts", "baja", null);
			System.out.println(v);
			v.setFechaSalida(LocalDate.of(2022, 3, 15));
			System.out.println(v.getPrecio());

		} catch (VehiculoException e) {
			System.out.println(e.getMessage());
		}

	}

}
