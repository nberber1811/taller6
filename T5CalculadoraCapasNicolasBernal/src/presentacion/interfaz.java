package presentacion;

import java.util.Scanner;

//Importamos el paquete de logica para que los métodos dentro de la clase funcionen
import logica.logica;

/**
 * @author nberb
 */

public class interfaz {
	
	/**
	 * Menú de bienvenida
	 */
	
	public static void bienvenida() {
		System.out.println("==================================");
		System.out.println("Bienvenido a la calculadora");
		System.out.println("==================================");
		System.out.println("");
		
		//Llamamos al método menu()
		menu();
	}
	
	/**
	 * Menú principal
	 */
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		
		//Variable boolean para que funcione el bucle
		boolean bucle = true;
		
		//Estamos en un bucle para verificar constantemente que el usuario introduzca datos correctos
		while (bucle) {
			System.out.println("");
			System.out.println("MENÚ PRINCIPAL");
			System.out.println("");
			System.out.println("1. Operación aritmética");
			System.out.println("2. Áreas de figuras");
			System.out.println("3. Volúmenes de figuras");
			System.out.println("4. Salir");
			System.out.println("");
			String opcion = sc.next();
			
			//Creamos un switch, que dependiendo de la opcion, nos llevará a un método u otro
            switch (opcion) {
                case "1":
                    menuOperacionAritmetica();
                    break;
                case "2":
                    menuAreasFiguras();
                    break;
                case "3":
                    menuVolumenFiguras();
                    break;
                case "4":
                	
                	//En este caso el programa finalizará
                    System.out.println("¡Gracias por usar la calculadora!");
                    bucle = false;
                    break;
                default:
                	
                	//Mensaje en caso de dato erroneo
                    System.out.println("Opción inválida. Intente de nuevo.");
            }		
		}
	}
	
	/**
	 * Menú de las operaciones aritmeticas
	 */
	
	public static void menuOperacionAritmetica() {
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;
		
		while(bucle) {
			
			System.out.println("");
			System.out.println("MENÚ OPERACIÓN ARTIMÉTICA");
			System.out.println("");
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Dividir");
			System.out.println("5. Volver");
			System.out.println("");
			String opcion = sc.next();
			
			switch (opcion) {
			case "1":
				logica.OperacionAritmetica(opcion);
				bucle = false;
				break;
			case "2":
				logica.OperacionAritmetica(opcion);
				bucle = false;
				break;
			case "3":
				logica.OperacionAritmetica(opcion);
				bucle = false;
				break;
			case "4":
				logica.OperacionAritmetica(opcion);
				bucle = false;
				break;
			case "5":
				return;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
			
		}
		
	}
	
	/**
	 * Menú del area de las figuras
	 */
	
	public static void menuAreasFiguras() {
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;
		
		while(bucle) {
			System.out.println("");
			System.out.println("MENÚ ÁREAS DE FIGURAS");
			System.out.println("");
			System.out.println("1. Cuadrado");
			System.out.println("2. Rectángulo");
			System.out.println("3. Triángulo");
			System.out.println("4. Circunferencia");
			System.out.println("5. Volver");
			System.out.println("");
			String opcion = sc.next();
			
			switch (opcion) {
			case "1":
				logica.realizarCalculoArea(opcion);
				bucle = false;
				break;
			case "2":
				logica.realizarCalculoArea(opcion);
				bucle = false;
				break;
			case "3":
				logica.realizarCalculoArea(opcion);
				bucle = false;
				break;
			case "4":
				logica.realizarCalculoArea(opcion);
				bucle = false;
				break;
			case "5":
				return;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		}
	}
	
	/**
	 * Menú del volumen de as figuras
	 */
	
	public static void menuVolumenFiguras() {
		Scanner sc = new Scanner(System.in);
		boolean bucle = true;

		while(bucle) {
			System.out.println("");
			System.out.println("MENÚ VOLUMEN DE FIGURAS");
			System.out.println("");
			System.out.println("1. Cubo");
			System.out.println("2. Prisma rectangular");
			System.out.println("3. Cono");
			System.out.println("4. Circunferencia");
			System.out.println("5. Esfera");
			System.out.println("6. Volver");
			System.out.println("");
			String opcion = sc.next();
			
			switch (opcion) {
			case "1":
				logica.realizarCalculoVolumen(opcion);
				bucle = false;
				break;
			case "2":
				logica.realizarCalculoVolumen(opcion);
				bucle = false;
				break;
			case "3":
				logica.realizarCalculoVolumen(opcion);
				bucle = false;
				break;
			case "4":
				logica.realizarCalculoVolumen(opcion);
				bucle = false;
				break;
			case "5":
				logica.realizarCalculoVolumen(opcion);
				bucle = false;
				break;
			case "6":
				return;
			default:
				System.out.println("Opción inválida. Intente de nuevo.");
			}
		}
	}
}