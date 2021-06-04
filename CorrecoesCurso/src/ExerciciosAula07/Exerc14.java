/*
14. Criar um array A com 5 elementos inteiros. Construir um array B de mesmo 
    tipo e tamanho e com os "mesmos" elementos do array A, ou seja, B[i] = A[i]. 
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
public class Exerc14 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int[] b = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor ("+i+"): ");
            a[i] =  Integer.parseInt(br.readLine());
        }
        System.arraycopy(a, 0, b, 0, 5);
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor A("+i+"): "+a[i]);
        }
    }
}
