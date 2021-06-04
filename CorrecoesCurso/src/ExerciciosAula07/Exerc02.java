/*
2. Escreva um programa que leia 10 valores reais do teclado e armazene-os num 
   array d e permita que sejam impressos quanto solicitados. 
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
public class Exerc02 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double [] d = new double[10];
        char resposta;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite Valor ("+(i+1)+"): ");
            d[i] = Double.parseDouble(br.readLine());
        }
        System.out.print("Deseja Imprimir os Valores do Array D? S/N: ");
        resposta = br.readLine().toLowerCase().charAt(0); 
        if(resposta == 's'){
            for (int i = 0; i < 10; i++) {
                System.out.println("Valor ("+i+"): "+d[i]);
            }
        } else {
            System.out.println("Terminado. Obrigado!");
        }
    }
}
