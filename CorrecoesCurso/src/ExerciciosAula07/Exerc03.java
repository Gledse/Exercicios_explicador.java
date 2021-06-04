/*
1. Crie um array capaz de armazenar 50 números inteiros. Em seguida 
   faça o seu preenchimento automático com os números de 101 a 150, 
   ou seja, na posição número 0 ponha 101, na posição 1 ponha o número 102, 
   e assim sucessivamente. Em seguida exiba os valores deste vector. 
 */
package ExerciciosAula07;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc03 {
    public static void main(String[] args) {
        int [] numeros = new int [50];
        int num = 101;
        
        for(int i = 0; i < 50; i++){
            numeros[i] = num;
            System.out.println(" "+numeros[i]);
            num++;
        }
    }
}
