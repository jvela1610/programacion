import java.util.Scanner;
public class Ejercicio4 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double npractica, nproblema, nteorica, resultado;

		npractica = 0;
		nproblema = 0;
		nteorica = 0;
		resultado = 0;

		System.out.println("Bienvenido, aquí conocerás tu nota de este año");

		System.out.println("¿Qué nota has sacado en la parte práctica?");
		npractica = Integer.parseInt(teclado.nextLine());

		System.out.println("¿Qué nota has sacado en la parte de problemas?");
		nproblema = Integer.parseInt(teclado.nextLine());

		System.out.println("¿Qué nota has sacado en la parte teórica?");
		nteorica = Integer.parseInt(teclado.nextLine());

		while (npractica > 10 || nproblema > 10 || nteorica > 10 || npractica < 0 || nproblema < 0 || nteorica < 0) {

			System.out.println("¿Qué nota has sacado en la parte práctica?");
			npractica = Integer.parseInt(teclado.nextLine());

			System.out.println("¿Qué nota has sacado en la parte de problemas?");
			nproblema = Integer.parseInt(teclado.nextLine());

			System.out.println("¿Qué nota has sacado en la parte teórica?");
			nteorica = Integer.parseInt(teclado.nextLine());
		}

		resultado = (npractica * 0.1) + (nproblema * 0.5) + (nteorica * 0.4);

		if (resultado < 5) {
			System.out.println("Su nota es un insuficiente");
		}
		else if (resultado < 6) {
			System.out.println("Su nota es un suficiente");
		}
		else if (resultado < 7) {
			System.out.println("Su nota es un bien");
		}
		else if (resultado < 9) {
			System.out.println("Su nota es un notable");
		}
		else if (resultado <= 10) {
			System.out.println("Su nota es un sobresaliente");
		}
		else {
			System.out.println("ERROR DEL SISTEMA");
		}
		
		System.out.println("Tienes un " + resultado + ", espero haberte ayudado");
	}

}
