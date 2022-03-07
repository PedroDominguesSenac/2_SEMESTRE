package ado1;

public class MetodoEx2 {
    
    static String x = "5, 10, 40, 35, 31";
    static int y = 5 + 10 + 40 + 35 + 31;
    static double z = (5.0 + 10.0 + 40.0 + 35.0 + 31.0)/5.0;
    
    public static void mostrar() {
     
    System.out.println("VALORES: " + x);
    System.out.println("\nSOMA DOS VALORES: " + y);
    System.out.println("\nMEDIA DOS VALORES: " + z);
    }
     
    public static int[] medAritm(int[] array){ 

            
            int[] valoresMaior = new int[5];
            int j = 0;
            int num1 = 0;

            for(int i=0; i<array.length; i++) {
                num1 += array[i];
            }
            
            int media = num1/array.length;

            for(int i = 0; i < array.length; i++) {
                if(array[i] > media) {
                    valoresMaior[j] = array[i];
                    j++;
                }
            }
            return valoresMaior;
    }
}
