/*
7. Criar um array A com 10 elementos inteiros. Implementar um programa 
   que determine a soma dos elementos armazenados neste array que são múltiplos de 5. 
 */
package ExerciciosAula07;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc09 {
    public static void main(String[] args) {
        int [] a = new int []{5,5,5,5,5,5,5,5,5,5};
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += a[i];
        }
        if (soma % 5 == 0) {
           System.out.println("A soma dos elementos do Array: "+soma+" e é múltiplo de 5.");
        } else {
           System.out.println("A soma dos elementos do Array: "+soma+" e não é múltiplo de 5.");
        }
        
    }
}
