
public class Ejercicio13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String resultado = multiplo5();
		System.out.println(resultado);
		

	}
	public static String multiplo5() {
		String resultado="";
		for (int num=0; num<=100;num=num+5) {
			resultado=resultado+String.valueOf(num)+ "\n";
			 
				
			}
		return resultado;
		}
	}


