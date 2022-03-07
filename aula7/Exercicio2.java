/*
* 2 - Ordene um array de String pelo método insertion sort.
*/
package aula7;

import java.util.Arrays;
import java.util.Random;

public class Exercicio2 {
    
    public static void main(String[] args) {
        
        String v[] = {"Pedro", "Gerson", "Beatriz", "Camila"};
        
        popularArray(v);
        insertionSort(v);  
        System.out.println(Arrays.toString(v));
    }
    
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
