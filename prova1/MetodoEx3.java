package prova1;

import java.util.Random;

class MetodoEx3 {
    
    
    public static Random rd = new Random();
    
    public static int[] inserir(int array[]) {
        
        for(int i=0; i<array.length; i++) {
            array[i] = 1 + rd.nextInt(10);
        }
        return array;
    }
    
    public static void exibir(int array[]) {
        
        System.out.println("NUMEROS SORTEADOS: ");
        
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("\n\nNUMEROS MULTIPLOS DE 3: ");
        
        for(int i=0; i<array.length; i++) {
            int limit = array[i] % 3;
            if(limit == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}