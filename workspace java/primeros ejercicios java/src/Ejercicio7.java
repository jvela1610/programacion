
public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println(del1al100()); 
	

	}
	public static String del1al100() {
		int num;
		String resultado="";
		for( num = 1; num<=100;num++) {
			resultado=resultado+num+"\n";
		}
		return resultado;
		
	}

}
