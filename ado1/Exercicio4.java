/*
* 4 - Dada uma matriz valores reais de simples precisão (float),
* escreva um algoritmo que determine a soma dos elementos de cada
* uma das linhas dessa matriz.
*/

package ado1;

public class Exercicio4 {
    
    public static void main(String[] args) {
     
        float[][] matriz = new float[3][4];
               
        matriz[0][0] = 55.5f;
        matriz[0][1] = 78.2f;
        matriz[0][2] = 89.6f;
        matriz[0][3] = 98.7f;
        matriz[1][0] = 11.0f;
        matriz[1][1] = 43.4f;
        matriz[1][2] = 27.5f;
        matriz[1][3] = 39.3f;
        matriz[2][0] = 5.2f;
        matriz[2][1] = 12.7f;
        matriz[2][2] = 70.9f;
        matriz[2][3] = 85.3f;
        
        for (int l=0; l<matriz.length; l++) {
            float soma = 0;
           for (int c=0; c<matriz[l].length; c++) {
               soma += matriz[l][c];
            }
            System.out.println("A soma dos elementos da linha " + l + " = " + soma);
        }
    }
}