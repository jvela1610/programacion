package Librería;

import java.util.Objects;

public class Fecha {
	private int dia;
	private int mes;
	private int anno;

	public Fecha(int dia, int mes, int anno) {
		this.dia = dia;
		this.mes = mes;
		this.anno = anno;
	}

	public boolean bisiesto() {
		boolean bisiesto = true;
		if (anno % 4 == 0 || anno % 100 == 0 || anno % 400 == 0) {
			bisiesto= true;
		} else {
			bisiesto = false;
		}
		return bisiesto;
	}
	public boolean ComprobarFecha() {
		boolean ComprobarFecha = true;
		if (bisiesto()==true || dia ==30 || dia == 28 || dia == 31 || mes <=12) {
			ComprobarFecha=true;
		} else {
			ComprobarFecha=false;
		}
		return ComprobarFecha;
	}
	public void addDias(int dia) {
		
		this.dia=dia;
		
	}
	

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(anno, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anno == other.anno && dia == other.dia && mes == other.mes;
	}

	@Override
	public String toString() {
		return "Libreria [dia=" + dia + ", mes=" + mes + ", anno=" + anno + "]";
	}

}
