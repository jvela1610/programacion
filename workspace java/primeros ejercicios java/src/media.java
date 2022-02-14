import java.util.Scanner;

public class media {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		//
		int i = 0;
		int numeros;
		int acumulador=0;
		double resultado=0;
		
		while (i++ < 10) {
			System.out.println("dame un numero: ");
			numeros = Integer.parseInt(teclado.nextLine());
			acumulador = acumulador + numeros;
			
			
		}
		System.out.println(acumulador);
		resultado = (double) acumulador/10;
		
		
		System.out.println("la media es " + resultado);
	}

}
