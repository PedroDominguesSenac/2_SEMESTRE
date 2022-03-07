/*
 * 1)	Elabore um projeto Java que gere a sequência numérica:
 *
 * 1 3 5 7 9 11... Até o termo informado, via teclado, pelo usuário.
 * 
 * Deve-se utilizar estruturas de repetição/decisão e a classe Scanner.
 * Pontuação: 2,0
 */

package prova1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int limit;
                              
        System.out.println("Digite o numero limite: ");
        limit = scan.nextInt();
        
        for(int i = 0; i < limit; i++) {
            i++;
            
            System.out.println(i);
        }
    }
}
