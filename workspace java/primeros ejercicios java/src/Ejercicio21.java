import java.util.Scanner;

public class Ejercicio21 {

	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = leerInteger("Introduce un numero");
		
		System.out.println(sumar100(num1));
	}
	
	public static int leerInteger(String texto) {
		System.out.println(texto);
		return Integer.parseInt(teclado.nextLine());
	}

	public static int sumar100(int numero) {
		while (numero > 0) {
			int cont;
			for (cont = 0; cont <= 100; cont++) {
				numero = numero + (numero+1);
			}
		}
		return numero;
	}
}
