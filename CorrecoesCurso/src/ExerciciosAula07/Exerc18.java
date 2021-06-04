/*
18. Faça um programa de consulta pela  posição pessoas, numérica da pessoa:  
    leia nomes  de sendo  a quantidade determinada pelo  usuário. Logo após  a 
    entrada  pergunte ao usuário  o número  do  nome que ele gostaria de consultar.  
    Após  sua resposta,  exiba o nome que fica na  posição informada. Chame atenção  
    do usuário em caso de  uma consulta inválida,  ou seja,  com  números menores  ou  
    iguais  a  zero, ou maiores  do  que a  quantidade cadastrada.
 */
package ExerciciosAula07;

import java.util.Scanner;

/**
 *
 * @author José Seie
 * @author Filipe Mangue
 */
public class Exerc18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd, numero;
        
        System.out.println("Digite a quantidade: ");
        qtd = scanner.nextInt();
         
        String[] nomes = new String[qtd];
        
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite nome("+i+"): ");
            nomes[i] = scanner.next();
        }
        System.out.println("Digite o número  do  nome que deseja consultar: ");
        numero = scanner.nextInt();
        for(int i = 0; i < qtd; i++){
            if(i == numero){
                System.out.println("Nome: "+nomes[i]); 
            }
        }
    }
}
