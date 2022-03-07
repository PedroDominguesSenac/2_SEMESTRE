/*
* 2 - Armazene em um array cem números inteiros aleatórios (faixa de 1 a 200),
* determine o maior e o menor valor armazenado.
*/

package aula2;

import java.util.Random;

public class Exercicio2 {
    public static void main(String[] args) {
       int[] v = new int[5];
       maiorMenor(v);
    }
    
    public static void maiorMenor(int[] v) {
       Random random = new Random();
       
       for(int i=0; i<v.length; i++){
           v[i] = 1+random.nextInt(201);           
       }
       
       int maior = v[0];
       for(int i=0; i<v.length; i++){
           if(maior < v[i]) {
               maior =v[i];
       }
        int menor = v[0];
        if(menor >v[i]){
        menor=v[i];
        }
           
       }
       System.out.println("Maior: " + maior);
    }   
}