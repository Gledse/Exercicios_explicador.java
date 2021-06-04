/*
13. Criar um array A com 10 elementos inteiros. Implementar um programa que 
    defina e escreva a quantidade de elementos armazenados neste vetor que são pares. 
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
public class Exerc13 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] valor = new int[5];
        int qtdPares = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor ("+i+"): ");
            valor[i] = Integer.parseInt(br.readLine());
            if(valor[i] % 2 == 0){
                qtdPares += 1;
            }
        }
        System.out.println("Quantidade de pares: "+qtdPares);
    }
}
