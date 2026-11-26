/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner entrada;
        entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero de la posicion" + i + ":");
            numeros[i] = entrada.nextInt();
        }
        System.out.println("\nNumeros almacenados");
        for (int i = 0; i < 10; i++){
            System.out.println("Posicion" + i + ":" + numeros[i]);
        }
    }  
}           
