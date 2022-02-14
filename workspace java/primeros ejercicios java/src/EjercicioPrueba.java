import java.util.Scanner;

public class EjercicioPrueba {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double npractica, nproblema, nteorica, resultado;

		npractica = 0;
		nproblema = 0;
		nteorica = 0;
		resultado = 0;
		int otraNota;
		
		do {
			System.out.println("Bienvenido, aquí conocerás tu nota de este año");

			System.out.println("¿Qué nota has sacado en la parte práctica?");
			npractica = Double.parseDouble(teclado.nextLine());

			System.out.println("¿Qué nota has sacado en la parte de problemas?");
			nproblema = Double.parseDouble(teclado.nextLine());

			System.out.println("¿Qué nota has sacado en la parte teórica?");
			nteorica = Double.parseDouble(teclado.nextLine());
			resultado = (npractica * 0.1) + (nproblema * 0.5) + (nteorica * 0.4);
			if (resultado < 5) {
				System.out.println("Su nota es un insuficiente");
			} else if (resultado < 6) {
				System.out.println("Su nota es un suficiente");
			} else if (resultado < 7) {
				System.out.println("Su nota es un bien");
			} else if (resultado < 9) {
				System.out.println("Su nota es un notable");
			} else if (resultado <= 10) {
				System.out.println("Su nota es un sobresaliente");
			} else {
				System.out.println("ERROR DEL SISTEMA");
			}

			System.out.println("Tienes un " + resultado + ", espero haberte ayudado");
			
			System.out.println("¿Quieres introducir otra nota? (s/n)");
			otraNota = teclado.nextLine().charAt(0);

		
			
		} while(otraNota=='S');
		
		if (otraNota == 'N') {
			System.out.println("Adios");

			
		}

		


		}

		
	}


