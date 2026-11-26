/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma = 0;
        for (int i =0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Ingrese un numero:");
                matriz[i][j] = entrada.nextInt();
                suma = suma + matriz[i][j];
            }
        }
        System.out.println("La suma total es:" + suma);
    }
}
