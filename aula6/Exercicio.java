
package aula6;

import java.util.Scanner;

public class Exercicio {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Trabalhador[] lista = new Trabalhador[3];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Nome:");
            String nome = teclado.nextLine();
            System.out.println("Salário:");
            double salario = teclado.nextDouble();
            System.out.println("ID:");
            int id = teclado.nextInt();
            lista[i] = new Trabalhador(nome, salario, id);
            teclado.nextLine();//Capturar o enter
        }

        Metodo.selectionSort(lista);
        Metodo.exibir(lista);
        
        
        
        teclado.close();
    }

}

