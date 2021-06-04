/*
15. Criar um array A com 8 elementos inteiros. Construir um array B de mesmo 
    tipo e tamanho e com os elementos do array A multiplicados por 2, 
    ou seja: B[i] = A[i] * 2. 
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
public class Exerc15 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[8];
        int[] b = new int[8];
        
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o valor ("+i+"): ");
            a[i] =  Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < 8; i++) {
            b[i] = a[i]*2;
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Valor B("+i+"): "+b[i]);
        }
    }
}
