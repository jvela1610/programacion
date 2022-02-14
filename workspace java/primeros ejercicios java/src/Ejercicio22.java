import java.util.Scanner;

public class Ejercicio22 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		int num1 = leerInteger();
		System.out.println(cuadradoNumero(num1));
	}
	
	public static int leerInteger() {
		System.out.println("Introduce un numero");
		return Integer.parseInt(teclado.nextLine());
	}

	public static double cuadradoNumero(double numero) {
		double resultado;
		resultado=Math.pow(numero,2);
		return resultado;
		}
		
	}