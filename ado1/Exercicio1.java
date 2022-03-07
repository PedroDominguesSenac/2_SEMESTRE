/*
* 1 - Dada a série numérica dos números triangulares: 1 3 6 10 15...
* Armazene-a em um array de tamanho igual a quinze.
*/

package ado1;

public class Exercicio1 {
    
    public static void main(String[] args) {
        int num[] = new int[15];
        
        int numtriang = 1, soma = 1;
        
        for(int i=0; i < 15; i++) {
            num[i] = soma;
            numtriang++;
            soma = num[i] + numtriang;
            
            System.out.println(num[i]);
        }
    }
}
