package aula_13.recursivos;

import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int a, b, c, d, e;
        
        System.out.println("Digite um numero inteiro: ");
            a = scan.nextInt();
            
        System.out.println("Digite outro numero inteiro: ");
            b = scan.nextInt();
            
            c = a / b;            
            d = c * b;
            e = a - d;
            
        System.out.println(a + " divido por " + b + " = " + c + "\nO resto da divisao = " + e);       
    
    
        if(e==0) {
            System.out.println("Divisao exata");
        }else{
            System.out.println("Divisao nao exata");
        }
    }
}
