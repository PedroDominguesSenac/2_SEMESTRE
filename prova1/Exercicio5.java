/*
 * 5)	Elabore um projeto em Java que defina duas classes, uma classe principal
 * (com o método main) onde estará o array instanciado e as chamadas para os métodos.
 * A segunda classe terá três métodos: um para ler um array bidimensional, outro método
 * para exibir o array bidimensional no formato de uma matriz e o terceiro método para 
 * exibir todos os valores menores ou igual à média aritmética dos valores armazenados 
 * na matriz. A saída deve apresentar os valores no formato de matriz, o valor da média 
 * aritmética e todos os valores menores ou iguais à média calculada. 
 * Pontuação: 2,0
 */

package prova1;

public class Exercicio5 {
    
     public static void main(String[] args) {
        double[][] array = new double[3][3];
        array = MetodoEx5.Ler(array);
        MetodoEx5.Exibir(array);
        MetodoEx5.ExibirAbaixoMedia(array);
    
    }
}
