import java.util.Scanner;
public class Ejercicio25 {
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		
		int numero;
		int contadorImpares=0,mayor=0;
		for (int i = 0;i<=numero;i++) {
			numero=Leernumero();
			contadorImpares=contadorImpares+contadorImpares(numero);
			mayor = mayorPares(mayor, numero);
			
			
		}
			
			System.out.println(contadorImpares());
		System.out.println(mayorPares());
		System.out.println(contadorNumeros());
	}
		
		public static int contadorImpares(int numero) {
			if(numero%2!=0) {
				return 1;
			}else 
			return 0;
		}
		
		public static int mayorPares(int mayor, int numero) {
			int  numero;
			int mayor=0;
			
			for (int i =0; i<=numero;i++) {
				if(numero%2==0 && mayor<numero) {
					mayor=numero;
					
					
					
				}
				
			}
			return mayor;
		}
		
		public static int contadorNumeros() {
			int contador=0;
			int numero;
			numero=Leernumero();
			while(numero>0) {
				contador++;
				numero=Leernumero();
				
			}
			return contador;
		}
		public static int Leernumero() {
			int numero;
			System.out.println("introduce un numero");
			numero=Integer.parseInt(teclado.nextLine());
			return numero;
			
		
		
		

	}

}
