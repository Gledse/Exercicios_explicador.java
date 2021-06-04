/*
11. Ler um array A com 10 elementos inteiros correspondentes as 
    idades de um grupo de pessoas. Escreva um programa que determine e 
    escreva a quantidade de pessoas que possuem idade superior a 35 anos. 
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
public class Exerc11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] idades = new int[5];
        int qtd_idade = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite a Idade ("+i+"): ");
            idades[i] = Integer.parseInt(br.readLine());
            if(idades[i] < 35){
                qtd_idade += 1;
            }
        }
        System.out.println("Quantidade de pessoas que possuem idade superior a 35 anos: "+qtd_idade);
    }
}
