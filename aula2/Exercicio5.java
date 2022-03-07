/*
* 5 - Elaborar um programa que simule um sorteio de números na faixa de um a
* cinquenta. Onde o usuário terá a oportunidade de tentar adivinhar o 
* número sorteado, cinco vezes.
*/
package aula2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        sorteio();
        
    }
    
    public static void sorteio() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int min = 1, max = 51;
        int sorteio = 1+random.nextInt(51-1);
        int chance = 1;
        int palpite;
        
        
        while(chance <= 5){
            System.out.println("Chance" + chance);
            System.out.println("Digite o palpite: ");
            palpite = teclado.nextInt();
            if(sorteio == palpite) {
                System.out.println("Parabens!");
                break;
            }else{
                System.out.println("Errou!");
            }
            chance++;
        }
        System.out.println("Valor sorteado " + sorteio);
    }
    
}
