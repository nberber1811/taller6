package logica;

/**
 * @author nberb
 */

//Código para calcular las sumas, restas, multiplicaciones y divisiones
public class CalculosAritmeticos {
	
	/**
     * Realiza la suma de dos números.
     * 
     * @param numero1 el primer número para la suma
     * @param numero2 el segundo número para la suma
     * @return el resultado de sumar numero1 y numero2
     */
	
    public static double sumar(double numero1, double numero2) {
        double resultado = 0;
        resultado = numero1 + numero2;
        return resultado;
    }

    /**
     * Realiza la resta de dos números.
     * 
     * @param numero1 el número del cual se va a restar (minuendo)
     * @param numero2 el número que se va a restar (sustraendo)
     * @return el resultado de restar numero2 de numero1
     */
    public static double restar(double numero1, double numero2) {
        double resultado = 0;
        resultado = numero1 - numero2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de dos números.
     * 
     * @param numero1 el primer número para la multiplicación
     * @param numero2 el segundo número para la multiplicación
     * @return el resultado de multiplicar numero1 y numero2
     */
    
    public static double multiplicar(double numero1, double numero2) {
        double resultado = 0;
        resultado = numero1 * numero2;
        return resultado;
    }

    /**
     * Realiza la división de dos números.
     * 
     * @param numero1 el dividendo (número que se va a dividir)
     * @param numero2 el divisor (número por el cual se divide)
     * @return el resultado de dividir numero1 entre numero2
     */
    
    public static double dividir(double numero1, double numero2) {
        double resultado = 0;
        
        //Comprobamos que el numero no sea 0
        if (numero1 == 0 || numero2 == 0) {
        	System.out.println("No se puede dividir entre 0");
        	return 0;
        	
        } else {
        	resultado = numero1 / numero2;
        	return resultado;        	
        }        
    }
}