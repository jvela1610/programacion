package examen;
import java.util.Scanner;

public class ejercicio1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// declaramos las variables
		
		int precioGeneral=8;
		int precioDiaEspectador=5;
		int numeroEntradas=0;
		int Npersonas;
		int precioTotal=0;
		
		char dia;
		
		
		//Declaramos un bucle do while para llevar acabo el programa y usamos un switch para determinar los dias
		do {
			System.out.println("dime el dia que es?(l/m/x/j/v/s/d)");
			dia = teclado.nextLine().charAt(0);
			System.out.println("dime el numero de personas");
			Npersonas=Integer.parseInt(teclado.nextLine());
			System.out.println("dime el numero de entradas");
			numeroEntradas=Integer.parseInt(teclado.nextLine());
			
			
			 
			switch(dia) {
			 
			 case 'l':{
				 System.out.println("es el precio general");
				 precioTotal=precioGeneral*numeroEntradas;
				 
				 
				 System.out.println(precioTotal);
				 
				 
			 }
			 case 'm':{
				 System.out.println("es el precio general");
				 precioTotal=precioGeneral*numeroEntradas;
				 
				 System.out.println(precioTotal);
				 
				 
			 }
			 case 'x':{
				 System.out.println("es el dia del espectador");
				 precioTotal=precioDiaEspectador*numeroEntradas;
				 
				 System.out.println(precioTotal);
				 
			 }
			 case 'j':{
				 System.out.println("es el dia de la pareja");
				 if (Npersonas%2==0) {
				 precioTotal=11*numeroEntradas;
				 
				 System.out.println(precioTotal);
				 }else if(Npersonas%2!=0) {
					 precioTotal=precioDiaEspectador*numeroEntradas;
					 
					 System.out.println(precioTotal);
					 
				 }
			 }
			 
			 
			 case 'v':{
				 System.out.println("es el precio general");
				 precioTotal=precioGeneral*numeroEntradas;
				 
				 System.out.println(precioTotal);
				 
				 
			 }
			 case 's':{
				 System.out.println("es el precio general");
				 precioTotal=precioGeneral*numeroEntradas;
				 
				 System.out.println(precioTotal);
				 
				 
			 }
			 case 'd':{
				 System.out.println("es el precio general");
				 precioTotal=precioGeneral*numeroEntradas;
				 
				 System.out.println(precioTotal);
				 
				 
			 }
				 
			 
			 }
			
		
		//declaramos que el bucle se repita solo si el numero de entradas es mayor a 0

	}while(numeroEntradas>0);

}}
