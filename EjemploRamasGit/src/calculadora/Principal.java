package calculadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String aux;
		int op, salir=0, num1, num2, result;
		
		
		do {
			System.out.println("""
					Seleccione una opción:
					 1. Sumar
					 2. Restar
					 0. Salir
					""");
			aux=sc.nextLine();
			op=Integer.parseInt(aux);
			
			switch(op){
			case 1:
				break;
				
			case 2:
				break;
				
			case 0:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.err.println("Opción no válida.");
				break;
			}
		}while(op!=salir);
		
		System.out.println("Gracias por usar el programa.");

	}

}
