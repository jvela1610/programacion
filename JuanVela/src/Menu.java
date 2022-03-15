import java.util.Scanner;

public class Menu {
	private int opc;
	private String plato;
	private double precio;
	private Scanner leer;
	
	
	public void elegir() {
		
	do {	
		System.out.println("1. dar de alta un plato");
		System.out.println("2. modificar precio plato");
		System.out.println("3. asignar un vino a un plato");
		System.out.println("4. mostrar informacion de un plato");
		System.out.println("5. mostrar informacion de todos los platos");
		System.out.println("6. salir");
		opc = leer.nextInt();
		switch (opc) {
		case 1:
			System.out.println("dime un plato");
			System.out.println("dime el precio del plato");
		case 2:
			
		case 3:
			System.out.println("nombre del plato");
			System.out.println("nombre del vino");
			System.out.println("graduacion");
			
		case 4:
			
		case 5:

				
			}
	}while(opc!=6);
		}
	}
	





