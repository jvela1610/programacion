import java.util.Scanner;
public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
	

		// crear variables

		char dia;
		
		dia = 0;
		
		System.out.println("Bienvenido");

		System.out.println("¿Qué día de la semana necesitas saber? L,M,X,J,V,S,D (si pulsas F cierras el programa)");
		dia = teclado.nextLine().charAt(0);

		

		while (dia != 'F') {

			if (dia == 'L') {
				System.out.println("lunes toca Entornos de desarrollo");
			} else if (dia == 'M') {
				System.out.println("martes toca Programación");
			} else if (dia == 'X') {
				System.out.println("miércoles toca Base de datos");
			} else if (dia == 'J') {
				System.out.println("jueves toca Sistemas informáticos");
			} else if (dia == 'V') {
				System.out.println("viernes toca Programación");
			} else if (dia == 'S') {
				System.out.println("No hay clase");
			} else if (dia == 'D') {
				System.out.println("No hay clasa");
			} else {
				System.out.println("Introduce un nuevo caracter");
			}
			System.out.println("¿Qué día de la semana necesitas detallar? L,M,X,J,V,S,D (si pulsas F cierras el programa)");
			dia = teclado.nextLine().charAt(0);
		}
		
		System.out.println("Adios");
	}

}
