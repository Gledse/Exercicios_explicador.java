/*
6. Criar um array A com 10 elementos inteiros. Implementar um programa 
   que defina e escreva a soma de todos os elementos armazenados neste array. 
 */
package ExerciciosAula07;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc08 {
    public static void main(String[] args) {
        int [] a = new int []{5,5,5,5,5,5,5,5,5,5};
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += a[i];
        }
        System.out.println("A soma dos elementos do Array: "+soma);
    }
}
