import java.util.Scanner;
public class Ejercicio6 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		int dia=0, mes=0;
		

		System.out.println("¿en qué mes estamos?");
		mes=Integer.parseInt(teclado.nextLine());

		while (mes < 1 || mes > 12) {
			System.out.println("ERROR");
			System.out.println("¿En qué mes estamos?");
			mes=Integer.parseInt(teclado.nextLine());

		}

		if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {

			System.out.println("dime el día");
			dia=Integer.parseInt(teclado.nextLine());

			while (dia < 1 || dia > 31) {
				System.out.println("ERROR");
				System.out.println("¿Qué día es hoy?");
				dia=Integer.parseInt(teclado.nextLine());
			}
		}
		else if (mes==2) {
			System.out.println("dime el día");
			dia=Integer.parseInt(teclado.nextLine());

			while (dia < 1 || dia > 29) {
				System.out.println("ERROR");
				System.out.println("¿Qué día es hoy?");
				dia=Integer.parseInt(teclado.nextLine());
			}
		}

		else {
			System.out.println("dime el día");
			dia=Integer.parseInt(teclado.nextLine());

			while (dia < 1 || dia > 30) {
				System.out.println("ERROR");
				System.out.println("¿Qué día es hoy?");
				dia=Integer.parseInt(teclado.nextLine());
			}
		}

		

System.out.println(temperatura(dia,mes));
	}
	public static String temperatura (int dia, int mes) {

		String resultado="";
		int grados=0;
		
			if (mes==1 || mes==2 || mes==3 && dia<22 || mes==12 && dia>21) {
				grados=19;
		resultado= "Estamos en invierno, regula la temperatura a estos grados centígrados: " + grados;
		}
			else if (mes==4 || mes==5 || mes==6 && dia<22 || mes==3) {
				grados=20;
				resultado= "Estamos en primavera, regula la temperatura a estos grados centígrados: " + grados;
			}
			else if (mes==7 || mes==8 || mes==9 && dia<22 || mes==6 ) {
				grados=24;
				resultado= "Estamos en verano, regula la temperatura a estos grados centígrados: " + grados;
			}
			else {
				grados=19;
				resultado= "Estamos en otoño, regula la temperatura a estos grados centígrados: " + grados;
			}
		return resultado;	
	}


		
		

	}


