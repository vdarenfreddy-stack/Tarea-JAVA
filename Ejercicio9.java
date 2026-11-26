/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("Ingrese un numero:");
                matriz[i][j] = entrada.nextInt(); 
            }
        }
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                if (matriz[i][j] > mayor){
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Numero mayor:" + mayor);
        System.out.println("Numero menor:" + menor);
    }
}
