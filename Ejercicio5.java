/**
 *
 * @author Daren Freddy Vasquez Bermeo
 * 
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner entrada;
        entrada = new Scanner(System.in);
        int[] numeros = new int[12];
        for (int i = 0; i < 12; i++){
            System.out.println("Ingrese un numero positivo:");
            int numero = entrada.nextInt();
            numeros[i] = numero + i;
        }
        System.out.println("Arreglo modificado:");
        for (int i = 0; i < 12; i++){
            System.out.println("Posicion" + i + ":" + numeros[i]);
        }
    }
}
