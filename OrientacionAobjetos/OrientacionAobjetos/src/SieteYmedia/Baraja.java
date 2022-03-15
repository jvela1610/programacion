package SieteYmedia;

public class Baraja {
	private int siguiente;
	private int numCartas = 40;
	private Carta[] cartas = new Carta[numCartas];

	public Baraja(int numCartas, int siguiente) {
		super();
		this.numCartas = numCartas;
		this.siguiente = siguiente;
	}

	public void barajar() {
		int i=0;
		while (i<numCartas) {
			Carta c=new Carta(generarNumero(),generarPalo());
		for (int j = 0; j < numCartas; j++) {
			
			
		}

	}
	}

	public int getNumCartas() {
		return numCartas;
	}

	public void setNumCartas(int numCartas) {
		this.numCartas = numCartas;
	}

	public Carta[] getSiguiente() {
		return this.cartas;
	}

	public void setSiguiente(int siguiente) {
		this.siguiente = siguiente;
	}

	private String generarPalo() {
		for (int i = 0; i < numCartas; i++) {
			cartas[i] = new Carta(i, generarPalo());
		}
		return null;
		

	}

	private int generarNumero() {
		for (int i = 0; i < numCartas; i++) {
			cartas[i] = new Carta(generarNumero(), null);
		}
		return numCartas;

	}

	@Override
	public String toString() {
		return "Baraja [numCartas=" + numCartas + ", siguiente=" + siguiente + "]";
	}

}
