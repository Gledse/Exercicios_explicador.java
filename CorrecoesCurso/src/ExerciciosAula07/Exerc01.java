/*
 1. O sistema de admissão à UEM da maior parte dos cursos de engenharias é 
    composto por dois exames, Matemática e Física. Supondo que o primeiro exame 
    tem peso 70%, e o segundo tem peso 30%. Faça um porgrama para calcular a média 
    final de 10 alunos nestas disciplinas. 
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
public class Exerc01 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double media, exame1, exame2;
        double [] mediasEstudantes = new double[10];
        
        for(int i = 0; i < 10;i++){
            System.out.println("\nESTUDANTE ("+(i+1)+")\n---Digute as Notas---");
            System.out.print("Nota do Exame de Matemática: ");
            exame1 = Double.parseDouble(br.readLine());
            
            System.out.print("Nota do Exame de Física: ");
            exame2 = Double.parseDouble(br.readLine());
            
            media = (exame1 * 0.70) + (exame2 * 0.30);
            mediasEstudantes[i] = media;
        }
        System.out.print("\n");
        for(int i = 0; i < 10; i++){
            System.out.println("Média Geral ("+(i+1)+"): "+mediasEstudantes[i]);
        }
    }
}
