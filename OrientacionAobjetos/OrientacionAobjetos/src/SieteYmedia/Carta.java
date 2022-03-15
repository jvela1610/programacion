package SieteYmedia;

import java.util.Objects;

public class Carta {
	private int number;
	private String palo;
	
	public Carta(int number, String palo) {
		super();
		this.number = number;
		this.palo = palo;
	}
	public double getValor() {
		double valor=0.5;
		if (this.number <=7) {
			valor=this.number;
		}
		return valor;
	}

	public int getNumber() {
		return number;
	}

	

	public String getPalo() {
		return palo;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(number, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return number == other.number && Objects.equals(palo, other.palo);
	}

	@Override
	public String toString() {
		return "Carta [number=" + number + ", palo=" + palo + "]";
	}

}
