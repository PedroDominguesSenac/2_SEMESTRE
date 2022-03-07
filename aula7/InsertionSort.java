package aula7;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    
    public static void main(String[] args) {
        
        int v[] = new int[1000];
        
        popularArray(v);
        
        long t1 = System.currentTimeMillis();      
        insertionSort(v);
        long t2 = System.currentTimeMillis();
        long tf = t2 - t1;
        System.out.println(Arrays.toString(v));
        
        System.out.println("Tempo: " + tf);
    }
    
    /**
    * Ordena um array pelo método de inserção.
    * @param v int[]
    */

    public static void insertionSort(int v[]) {
        
        for(int i = 1; i < v.length; i++) {
                
        int temp = v[i], j = i;
        
        while(j>0 && v[j-1]>temp) {
            v[j] = v[j-1];
            j--; //j=j-1;
        }
        
        v[j] = temp;
       
        }
    }
    
    public static void popularArray(int v[]) {
        
        Random rd = new Random();
        
        for(int i=0; i < v.length; i++) {
            v[i] = 1 + rd.nextInt(5000);
        }
        
    }
    
}