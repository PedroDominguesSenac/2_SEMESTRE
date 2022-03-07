/*
* 2 - Escreva um projeto Java completo. Defina um array unidimensional do
* tipo int e escreva um método que receba o array, como parâmetro, e
* retorne a quantidade de valores maiores do que a média aritmética.
*/

package ado1;

import java.util.Scanner;

public class Exercicio2 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        MetodoEx2.mostrar();
        
        int[] array = {5, 10, 40, 35, 31};
        
        int j = 0;
        
        int valores[] = MetodoEx2.medAritm(array);
               
        System.out.println("\nVALORES MAIORES QUE A MEDIA: ");
    
        for(int i = 0; i < valores.length; i++){
            if(valores[i] != 0){
                j++;
                
                System.out.println(valores[i]);
                
            }   
        }
        
        System.out.println("\nQUANTIDADE DE NUMEROS ACIMA DA MEDIA: " + j);  
    }   
}
