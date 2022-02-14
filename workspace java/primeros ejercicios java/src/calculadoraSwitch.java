import java.util.Scanner;
public class calculadoraSwitch {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		int num1,num2, resultado=0;
		
		
		char opc;
		char opc2 = 's';
		
		while (opc2 == 's') {
			boolean error =false;
			System.out.println("introduce el primer numero");
			num1 = Integer.parseInt(teclado.nextLine());
			
			System.out.println("introduce el segundo numero");
			num2 = Integer.parseInt(teclado.nextLine());
			
			System.out.println("introduce la opcion (+,-,*,/");
			opc = teclado.nextLine().charAt(0);
			
			switch (opc) {
			case '+': {
				resultado = num1 + num2;
				break;
			}
			
			case '-': {
				resultado = num1 - num2;
				break;
			}
			
			case '*': {
				resultado = num1 * num2;
				break;
			}
			
			case '/': {
				resultado = num1 / num2;
				break;
			}
			default:
				error=true;
			
			}
			if (error==true) {
				System.out.println("error");
			}
			else { System.out.println(resultado);}
		
			System.out.println("introduce la opcion (s,n");
			opc2 = teclado.nextLine().charAt(0);
		}	
	}
	

}
