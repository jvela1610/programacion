package examen;
import java.util.Scanner;
public class ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		
	
		
	
		// declaramos las variables y las funciones que utilizaremos para el programa
		int añoActual;
		int edad;
		int frecuenciaMax;
		int frecuencia;
		System.out.println("en que año estamos");
		añoActual=Integer.parseInt(teclado.nextLine());
		System.out.println("que edad tienes");
		edad=Integer.parseInt(teclado.nextLine());
		
		frecuencia= edad - 220;
		frecuenciaMax=frecuencia*85 %100;
		
		System.out.println("la frecuencia maxima es " + frecuenciaMax);
		
		
		
		
		
	}

}
