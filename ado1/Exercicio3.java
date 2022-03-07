/*
* 3 - Escreva um algoritmo que implemente um array de objetos do tipo
* Produto e tamanho igual a 10. Onde Produto é uma classe que têm os
* atributos: nome (String), categoria (String), código (int) e preco (float).
* Na classe principal, simule uma lista de compras de produtos, como
* saída exiba todos os produtos e soma total dos produtos.
*/

package ado1;

 import java.util.Scanner;

public class Exercicio3 {
       
    public static void main(String[] args) {
        MetodoEx3.ProdutoEx3();
        System.out.println("Seu carrinho é:");
        System.out.println("===============");
        MetodoEx3.Compra("Lanterna");
        MetodoEx3.Compra("Alicate");
        MetodoEx3.Compra("Chave Inglesa");
        MetodoEx3.Compra("Martelo");
        MetodoEx3.Compra("Furadeira");
        MetodoEx3.Compra("Calça");
        MetodoEx3.Compra("Sueter");
        MetodoEx3.Compra("Meia");
        MetodoEx3.Compra("Camiseta");
        MetodoEx3.Compra("Moletom");
        System.out.println("===============");
    }
    
}
