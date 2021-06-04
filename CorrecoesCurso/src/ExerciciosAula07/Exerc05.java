/*
3. Faça um algoritmo que some o conteúdo de dois arrays 
   e armazene o resultado em um terceiro array. 
 */
package ExerciciosAula07;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc05 {
    public static void main(String[] args) {
        int [] a = new int []{1,3,1,1,3,1,1,3};
        int [] b = new int []{1,1,1,1,1,1,1,1};
        int [] c = new int [8];
        
        for (int i = 0; i < 5; i++) {
            c[i] = a[i] + b[i];
            System.out.println(" "+c[i]);
        }
    }
}
