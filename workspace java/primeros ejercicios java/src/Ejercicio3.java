import java.util.Scanner;
public class Ejercicio3 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int caracter;
		
		System.out.println("introduce un caracter");
		caracter = teclado.nextLine().charAt(0);
		
		
		if (caracter >=65 && caracter <=90) {
			System.out.println("Es una letra mayuscula");
		}
		else if (caracter >=97 && caracter <=122) {
			System.out.println("Es una letra minuscula");
		}
		else if (caracter >=48 && caracter<=57 ) {
			System.out.println("es un número entre 0 y 9");
			
		}
		else if (caracter ==44 || caracter==46 || caracter==58 || caracter==59) {
			System.out.println("Signos de puntuiación");
		}
		else if (caracter==32) {
			System.out.println("Espacio");
		}
		else if (caracter ==40 || caracter==41 || caracter==123 || caracter==125) {
			System.out.println("parentesis o llave");
		}
		else {
			System.out.println("otro caracter");
		}
		
		
		}

}
