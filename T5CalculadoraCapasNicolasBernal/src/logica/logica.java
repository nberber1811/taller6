package logica;

import java.util.Scanner;

import calculos.area;
import calculos.volumen;

//Importamos las librerias para que funcionen
//import calculos.area;
//import calculos.volumen;

/**
 * @author nberb
 */


//Métodos que permiten funcionar la aplicación haciendo
//comunicar los menús con las acciones a realizar
public class logica {
	
	/**
     * Realiza la gestion de las operaciones aritmeticas.
     * 
     * @param opcion numero elegido por el usuario para poder elegir las opciones en el menú
     */
	
	public static void OperacionAritmetica(String opcion) {
		Scanner sc = new Scanner(System.in);
		
		//Variable double donde guardaremos los resultados
		double resultado;
		
		//Pedimos al usuario que ingrese el primer número
		System.out.println("Ingrese el primer número:");
        double num1 = sc.nextDouble();
        
        //Pedimos al usuario que ingrese el segundo
        System.out.println("Ingrese el segundo número:");
        double num2 = sc.nextDouble();

        //Dependiendo la opcion que haya elegido el usuario, hará una operación u otra
        switch (opcion) {
        
        	//Por ejemplo en el caso de haber puesto "1", llamamos al método que nos realiza la operacion
        	//en este caso la suma. Nos imprime el resultado y termina el switch.
            case "1":
            	
            	//Suma
                resultado = CalculosAritmeticos.sumar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case "2":
            	
            	//Resta
                resultado = CalculosAritmeticos.restar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case "3":
            	
            	//Multiplicacion
                resultado = CalculosAritmeticos.multiplicar(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            case "4":
            	
            	//Division
            	resultado = CalculosAritmeticos.dividir(num1, num2);
            	System.out.println("Resultado: " + resultado);
                break;
            default:
            	
            	//En el caso de que el usuario haya puesto una opcion erronea, nos imprime el siguiente mensaje y volvemos del nuevo al menú
                System.out.println("Opción inválida.");
        }
    }
	
	/**
     * Realiza la gestion de las operaciones de las areas.
     * 
     * @param opcion numero elegido por el usuario para poder elegir las opciones en el menú
     */

    public static void realizarCalculoArea(String opcion) {
		Scanner sc = new Scanner(System.in);
    	
		//Similar al anterior método, creamos un switch, el cual dependerá de la opción que hayamos elegido anteriormente
        switch (opcion) {
            case "1":
            	
            	//Cuadrado
                System.out.println("Ingrese el lado del cuadrado:");
                double lado = sc.nextDouble();
                System.out.println("Área del cuadrado: " + area.areaCuadrado(lado));
                break;
            case "2":
            	
            	//Rectángulo
                System.out.println("Ingrese la base del rectángulo:");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del rectángulo:");
                double altura = sc.nextDouble();
                System.out.println("Área del rectángulo: " + area.areaRectangulo(base, altura));
                break;
            case "3":
            	
            	//Triangulo
                System.out.println("Ingrese la base del triángulo:");
                base = sc.nextDouble();
                System.out.println("Ingrese la altura del triángulo:");
                altura = sc.nextDouble();
                System.out.println("Área del triángulo: " + area.areaTriangulo(base, altura));
                break;
            case "4":
            	
            	//Circunferencia
                System.out.println("Ingrese el radio de la circunferencia:");
                double radio = sc.nextDouble();
                System.out.println("Área de la circunferencia: " + area.areaCircunferencia(radio));
                break;
            default:
            	
            	//En el caso de no haber puesto un dato correcto nos imprime el siguiente mensaje
                System.out.println("Opción inválida.");
        }
    }
    
    /**
     * Realiza la gestion de las operaciones de los volumenes.
     * 
     * @param opcion numero elegido por el usuario para poder elegir las opciones en el menú
     */
    
    public static void realizarCalculoVolumen(String opcion) {
		Scanner sc = new Scanner(System.in);
    	
        switch (opcion) {
            case "1":
            	
            	//Cubo
                System.out.println("Ingrese el lado del cubo:");
                double lado = sc.nextDouble();
                System.out.println("Volumen del cubo: " + volumen.volumenCubo(lado));
                break;
            case "2":
            	
            	//Prisma
                System.out.println("Ingrese la base del prisma:");
                double base = sc.nextDouble();
                System.out.println("Ingrese la altura del prisma:");
                double altura = sc.nextDouble();
                System.out.println("Ingrese la profundidad del prisma:");
                double profundidad = sc.nextDouble();
                System.out.println("Volumen del prisma rectangular: " + volumen.volumenPrisma(base, altura, profundidad));
                break;
            case "3":
            	
            	//Cono
                System.out.println("Ingrese el radio del cono:");
                double radio = sc.nextDouble();
                System.out.println("Ingrese la altura del cono:");
                altura = sc.nextDouble();
                System.out.println("Volumen del cono: " + volumen.volumenCono(radio, altura));
                break;
            case "4":
            	
            	//Esfera
                System.out.println("Ingrese el radio de la esfera:");
                radio = sc.nextDouble();
                System.out.println("Volumen de la esfera: " + volumen.volumenEsfera(radio));
                break;
            default:
            	
            	//Nos imprime el siguiente mensaje en caso de un dato erroneo
                System.out.println("Opción inválida.");
        }
    }
}