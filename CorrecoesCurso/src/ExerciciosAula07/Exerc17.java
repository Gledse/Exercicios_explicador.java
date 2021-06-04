/*
17. Arrays A e  B  cada um com 10  elementos  inteiros. Construir um array C, 
    Criar dois onde cada elemento de  C  é a divisão dos  respectivos  elementos  
    em  A e  B,  ou seja: C[i] = A[i] / float(B[i]).
 */
package ExerciciosAula07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc17 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[10];
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o valor A ("+i+"): ");
            a[i] =  Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o valor B ("+i+"): ");
            b[i] =  Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 15; i++) {
            c[i] = a[i] / b[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Valor C("+i+"): "+c[i]);
        }
    }
}
