/**
 *
 * @author Daren Freddy Vasquez Bermeo
 */
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[15];
        for (int i = 0; i < 15; i++){
            System.out.println("Ingrese un numero:");
            numeros[i] = entrada.nextInt();
        }
        int mayor = numeros[0];
        int menor = numeros[0];
        int posMayor = 0;
        int posMenor = 0;
        for (int i = 1; i < 15; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
                posMayor = i;
            }
            if (numeros[i] < menor){
                menor = numeros[i];
                posMenor =i;
            }
        }
        System.out.println("Numero mayor:" + mayor);
        System.out.println("Posicion del mayor:" + posMayor);
        System.out.println("Numero menor:" + menor);
        System.out.println("Posicion del menor:" + posMenor);

    }
    
}
