import java.util.Scanner;
public class HolaMundo {
	
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// Declaracion de variables
		int a;
		char opc;
		double real,resultado;
		System.out.println("hola mundo");
		
		System.out.println("¿quieres calcular la suma(S/N)");
		opc=teclado.nextLine().charAt(0);
		
		System.out.println("introduce un numero");
		a=teclado.nextInt();
		
		System.out.println("introduce otro numero");
		real = Double.parseDouble(teclado.nextLine());
		
		resultado = a+real;
		System.out.println(resultado + " el valor de a" + a); 
		System.out.println("la opcion leida es:" + opc);
	}

}
