/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercico8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int [4][4];
        int suma = 0;
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.println("Ingrese un numero:");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Diagonal principal:");
        for (int i = 0; i < 4; i++){
            if (i== i){
                System.out.println(matriz[i][i]);
                suma = suma + matriz[i][i];
            }
        }
        System.out.println("Suma de la diagonal:" + suma);
    }
}
