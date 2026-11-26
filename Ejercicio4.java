/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
             Scanner entrada;
        entrada = new Scanner(System.in);
        int[] numeros = new int[20];
        int pares = 0;
        int impares = 0;
        int sumaPares = 0;
        int sumaImpares = 0;
        for (int i = 0; i < 20; i++){
            System.out.println("Ingrese un numero:");
            numeros[i] = entrada.nextInt();
            if (numeros[i] % 2 ==0 ){
                pares++;
                sumaPares = sumaPares + numeros [i];
            } else { 
                impares++;
                sumaImpares = sumaImpares + numeros [i];
            }
        }
        System.out.println("Cantidad de pares:" + pares);
        System.out.println("Cantidad de impares:" + impares);
        System.out.println("Suma de pares:" + sumaPares);
        System.out.println("Suma de impares:" + sumaImpares);
    }
}
