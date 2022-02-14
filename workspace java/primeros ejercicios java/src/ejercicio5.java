import java.util.Scanner;
public class ejercicio5 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		String resultado = tramosHorarios();
		System.out.println(resultado);
			
		}
	public static String tramosHorarios() {
		double hora;
		System.out.println("Dime una hora");
		hora = Double.parseDouble(teclado.nextLine());
		String resultado;
		if (hora>=6 && hora<=12) {resultado="buenos dias";}
		else if(hora>=13 && hora<=20) {resultado="buenas tardes";}
		else if(hora>=21 && hora<=5) {resultado="buenas noches";}
		else {resultado="error";}
		return resultado;
		
	}

	}

