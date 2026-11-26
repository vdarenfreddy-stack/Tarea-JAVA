/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int[][] matriz = new int[3][5];
       for (int i = 0; i < 3; i++){
           for ( int j = 0; j < 5; j++){
               System.out.println("Ingrese un numero:");
               int numero = entrada.nextInt();
               matriz[i][j] = numero + (i*j);
           }
       }
        System.out.println("Matriz modificada:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                System.out.println(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
