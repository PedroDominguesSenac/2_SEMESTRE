package aula4;

import java.text.DecimalFormat;
import java.util.Random;

/*
Elabore um algoritmo que insira valores aleatorios do tipos double
para uma matriz quadrada de ordem cem. Exiba todos os valores da 
diagonal secundaria.
*/

public class Exemplo2 {
    public static void main(String[] args) {
        Random rd = new Random();
        DecimalFormat df = new DecimalFormat("#.0");
        double[][] matriz = new double[2][2];
        
        for(int i=0; i<matriz.length; i++) {
          for(int j=0; j<matriz[0].length; j++) {
              matriz[i][j] = 1 + rd.nextDouble() * (10 - 1);
              System.out.println(df.format(matriz[i][j]) + " ");
          }
              System.out.println("");
        }
        
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                if(i+j == matriz.length - 1) {      
                }
                    
            }
        }       
    } 
}

