import java.util.Scanner;

public class Ejercicio23 {

public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		System.out.println(ConteoNumeros());
	}
	
	public static int leerInteger() {
		System.out.println("Introduce un numero");
		return Integer.parseInt(teclado.nextLine());
	}

	public static int ConteoNumeros() {
		int contador=0;
		int numero=leerInteger();
		while(numero>0) {contador++;
		numero=leerInteger();
		}
		return contador;
	}
		
}