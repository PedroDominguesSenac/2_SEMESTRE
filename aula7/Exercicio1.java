/*
* 1 - Elabore um projeto Java que gere números reais (float) aleatórios, 
* armazene-os em um array e ordene-o pelo insertion sort.
*/

package aula7;

import java.util.Arrays;
import java.util.Random;

public class Exercicio1 {
    
    public static void main(String[] args) {
        
        float v[] = new float[10];
        
        popularArray(v);
        insertionSort(v);
        System.out.println(Arrays.toString(v));
        
    }
    
    /**
    * Ordena um array pelo método de inserção.
    * @param v float[]
    */

    public static void insertionSort(float v[]) {
        
        for(int i = 1; i < v.length; i++) {
                
        float temp = v[i];
        int j = i;
        
        while(j>0 && v[j-1]>temp) {
            v[j] = v[j-1];
            j--; //j=j-1;
        }
        
        v[j] = temp;
       
        }
    }
    
    public static void popularArray(float v[]) {
        
        Random rd = new Random();
        
        for(int i=0; i < v.length; i++) {
            v[i] = 1 + rd.nextFloat() * 5000;
        }
        
    }
    
}