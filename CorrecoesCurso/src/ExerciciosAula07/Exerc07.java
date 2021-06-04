/*
5. Criar dois arrays A e B cada um com 10 elementos inteiros. 
   Construir um array C, onde cada elemento de C é a soma dos 
   respectivos elementos em A e B, ou seja: C[i] = A[i] + B[i]. 
 */
package ExerciciosAula07;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc07 {
    public static void main(String[] args) {
        int [] a = new int []{5,5,5,5,5,5,5,5};
        int [] b = new int []{1,1,1,1,1,1,1,1};
        int [] c = new int [16];
        
        for (int i = 0; i < 8; i++) {
            c[i] = a[i] + b[i];
        }
        for (int i = 0; i < 8; i++) {
            System.out.println(""+c[i]);
        }
    }
}
