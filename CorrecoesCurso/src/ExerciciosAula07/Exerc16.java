/*
16. Criar um array A com 15 elementos inteiros. Construir um array B 
    de mesmo tipo e tamanho, sendo que cada elemento do array B deverá 
    ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] * A[I]. 
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
public class Exerc16 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[15];
        int[] b = new int[15];
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o valor ("+i+"): ");
            a[i] =  Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 15; i++) {
            b[i] = a[i] * a[i];
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("Valor B("+i+"): "+b[i]);
        }
    }
}
