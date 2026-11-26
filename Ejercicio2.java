/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double promedio;
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese un numero;");
            numeros[i] = entrada.nextDouble();
            suma = suma + numeros[i];
        }
        promedio = suma / 10;
        System.out.println("Suma total:" + suma);
        System.out.println("Promedio:" + promedio);

    }
    
}
