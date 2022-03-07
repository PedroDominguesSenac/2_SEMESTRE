/*
* 3 - Leia dois arrays do tipo real com simples precisão (float) e tamanho
* igual a cem, some os valores entre os vetores, índice a índice e armazene
* em um terceiro vetor de igual tamanho. 
*/

package aula2;

import java.util.Arrays;
import java.util.Random;

public class Exercicio3 {
    
    public static void main(String[] args) {
     
        int tam=10;
        float[] v1 = new float[tam];
        float[] v2 = new float[tam];
        float[] v3 = new float[tam];
        
        Random random = new Random();
        
        for(int i=0; i<v1.length; i++) {
            v1[i] = 1 + random.nextFloat() * (11-1);
            v2[i] = random.nextFloat() * (11-1);
            v3[i] = v1[i] + v2[i];
        }
        
        
        System.out.println(" ========= Vetor 1 =========");
        System.out.println(Arrays.toString(v1));
        System.out.println(" ========= Vetor 2 =========");
        System.out.println(Arrays.toString(v2));
        System.out.println(" ========= Vetor 3 =========");
        System.out.println(Arrays.toString(v3));
    }
}