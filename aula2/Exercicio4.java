/*
* 4 - Dada a série de Fibonacci: 1 1 2 3 5 8 ... 
* Armazene-a em um array de tamanho igual a quinze.
*/

package aula2;

import java.util.Arrays;

public class Exercicio4 {
    public static void main(String[] args) {
        
        int[] v = new int[15];
        v[0] = 1;
        v[1] = 1;
        for(int i=2; i<v.length; i++) {
        v[i]=v[i-1]+v[i-2];
        }
        System.out.println(Arrays.toString(v));
    
    }
}