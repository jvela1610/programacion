import java.util.Scanner;

public class Ejercicio24 {

public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println(Maximode10numeros());
	}
	
	public static int leerInteger() {
		System.out.println("Introduce un numero");
		return Integer.parseInt(teclado.nextLine());
	}

	public static int Maximode10numeros() {
		int numero;
		int mayor=0;
		for(int i=0;i<10;i++) {
			numero=leerInteger();
			if(mayor<numero) {mayor=numero;}
		}
		return mayor;
		
		}
		

	}