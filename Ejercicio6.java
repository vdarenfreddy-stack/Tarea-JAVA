/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][4];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Ingrese un numero:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 4; j++){
                System.out.println(matriz[i][j] + "\t");
        }
            System.out.println();
        }
    }  
}
