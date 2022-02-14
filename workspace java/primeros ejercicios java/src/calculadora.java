import java.util.Scanner;
public class calculadora {
	
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// Definimos las variables
		int num1,num2;
		int resultado;
		char opc;
		
		 System.out.println("¿que operacion desea realizar?(+/-/*//");
		 opc=teclado.nextLine().charAt(0);
		 
		 if (opc == '+') {
			 
			 System.out.println("has elegido sumar");
				System.out.println("introduce un numero entero");
				num1 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("introduce otro numero entero");
				num2 = Integer.parseInt(teclado.nextLine());
				
				resultado = num1 + num2;
				System.out.println(resultado);
				
			}
		 if (opc == '-') {
			 
			 System.out.println("has elegido restar");
				System.out.println("introduce un numero entero");
				num1 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("introduce otro numero entero");
				num2 = Integer.parseInt(teclado.nextLine());
				
				resultado = num1 - num2;
				System.out.println(resultado);
			 
		 }
		 
		 if (opc == '*') {
			 
			 System.out.println("has elegido multiplicar");
				System.out.println("introduce un numero entero");
				num1 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("introduce otro numero entero");
				num2 = Integer.parseInt(teclado.nextLine());
				
				resultado = num1 * num2;
				System.out.println(resultado);
		 
		 }
		 
		 if (opc == '/') {
			 
			 System.out.println("has elegido dividir");
				System.out.println("introduce un numero entero");
				num1 = Integer.parseInt(teclado.nextLine());
				
				System.out.println("introduce otro numero entero");
				num2 = Integer.parseInt(teclado.nextLine());
				
				resultado = num1 / num2;
				System.out.println(resultado);
		 }

}}
