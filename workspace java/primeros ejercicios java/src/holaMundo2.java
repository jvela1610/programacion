import java.util.Scanner;
public class holaMundo2 {
		
	public static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// Declaracion de variables
		int num1,num2;
		int resultado;
		char opc;
		
		System.out.println("Hola mundo");
		
		System.out.println("quieres realizar la suma");
		opc = teclado.nextLine().charAt(0);
		if (opc == 's') {
			System.out.println("introduce un numero entero");
			num1 = Integer.parseInt(teclado.nextLine());
			
			System.out.println("introduce otro numero entero");
			num2 = Integer.parseInt(teclado.nextLine());
			
			resultado = num1 + num2;
			System.out.println(resultado);
			
		}
		else if (opc == 'n') {
			System.out.println("Entoces para que me ejecutas");
			
		}
		

	}

}
