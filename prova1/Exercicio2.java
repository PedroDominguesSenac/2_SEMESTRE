/*
 * 2)	Elabore um projeto Java que dado um array composto pela lista de dez nomes
 * de cidades, utilize o método selection sort para classificar o array de forma decrescente.
 * Exiba a lista usando um for aprimorado.
 * Pontuação: 2,0
 */

package prova1;

public class Exercicio2 {

    public static void main(String[] args) {

        String city[] = {"Hortolandia", "Campinas", "Rio de Janeiro", "São Paulo", "Registro","Niteroi", "Londres", "Paris", "Miami", "Vitoria"};
        MetodoEx2.selectionSort(city);
        MetodoEx2.Exibir(city);
    
    }
}
