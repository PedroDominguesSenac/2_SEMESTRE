/*
* 1 - Ler notas de provas dos dez alunos. Calcular a média e determinar a quantidade
* de alunos que ficaram acima/igual ou abaixo da média.
*/
package aula2;

import java.util.Scanner;

public class Exercicio1 {
    
    public static void main(String[] args) {
        float[] notas = new float[10];
        processaNotas(notas);
    }
    
    /**
     * Le as notas de prova, determina a media e quantidade de 
     * notas acima ou abaixo da media
     * @param notas float[]
     */
    
    public static void processaNotas(float[] notas) {
        Scanner teclado = new Scanner(System.in);
        
        float soma=0;
        
        //Entrada de notas e calculo da media        
        for(int i=0; i<notas.length; i++) {
            System.out.print("Nota " +(i+1)+ ": ");
            notas[i] = teclado.nextFloat();
            soma = soma + notas[i];
        }
        soma = soma / notas.length;
        System.out.println("Media: " + soma);
        
        /*Determinar a quantidade de alunos 
        acima e abaixo da media*/
        
        int maior=0, menor=0; 
        for(int i=0; i<notas.length; i++) {
            if(notas[i] >= soma){
                maior++;
            }else{
                menor++;
            }
        }
        System.out.println("Maiores ou igual: "+ maior);
        System.out.println("Menores: "+ menor);
        
        teclado.close();

    }    
}