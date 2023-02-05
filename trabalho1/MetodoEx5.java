package trabalho1;

import java.util.Random;
import java.text.DecimalFormat;

public class MetodoEx5 {

    public static Random rd = new Random();
    static DecimalFormat df = new DecimalFormat("#.0");

    public static double[][] Ler(double array[][]){
        for (double[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                array1[j] = 1+rd.nextInt(9);
            }
        }
        return array;
    }
    public static void Exibir(double array[][]){
        for (double[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(df.format(array1[j]) + " ");
            }
            System.out.println("");
        }
    }
    public static void ExibirAbaixoMedia(double array[][]){
        double soma = 0; 
        double result;
        double p = 0;
        for (double[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                p++;
                soma += array1[j];
            }
        }
        result = soma / p;
        System.out.printf("Média Aritmética: %.2f\n", result);
        System.out.print("Valores abaixo da média: ");
        for (double[] array1 : array) {
            for (int j = 0; j < array[0].length; j++) {
                if (array1[j] <= result) {
                    System.out.print(df.format(array1[j]) + " ");
                }
            }
        }

    }
}