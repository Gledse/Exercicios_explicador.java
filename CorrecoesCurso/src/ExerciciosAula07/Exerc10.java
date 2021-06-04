/*
10. Criar um array A com 10 elementos inteiros. Escrever um programa que calcule e 
    escreva: a) a soma de elementos armazenados neste array que são inferiores a 15; 
    b) a quantidade de elementos armazenados no array que são iguais a 15; e c) a 
    média dos elementos armazenados no array que são superiores a 15. 
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
public class Exerc10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[10];
        int qtd_igual15 = 0, qtd_maior15 = 0;
        double media, somam = 0,somaM = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite valor ("+i+"): ");
            a[i] = Integer.parseInt(br.readLine());
            if(a[i] < 15){
                somam += a[i];
            }
            if(a[i] == 15){
                qtd_igual15 += 1;
            }
            if(a[i] > 15){
                qtd_maior15 += 1;
                somaM += a[i];
            }
        }
        media = somaM/qtd_maior15;
        System.out.println("Soma de elementos armazenados neste array que são inferiores a 15: "+somam);
        System.out.println("Quantidade de elementos armazenados no array que são iguais a 15: "+qtd_igual15);
        System.out.println("Média dos elementos armazenados no array que são superiores a 15: "+media);
    }
}
