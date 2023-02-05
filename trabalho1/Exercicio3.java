/*
 * 3)	Elabore um projeto em Java que defina duas classes, uma classe principal
 * (com o método main), onde estará o array instanciado e as chamadas para os métodos.
 * Na outra classe estarão dois métodos, um método para inserir valores aleatórios do tipo
 * inteiro em um array unidimensional (gere os valores na faixa de 1 até o comprimento do array).
 * E outro método deverá exibir somente os valores múltiplos de três, armazenados no array.
 * Pontuação: 2,0
 */

package trabalho1;

public class Exercicio3 {

    public static void main(String[] args) {
        
        int array[] = new int[10];
        
        MetodoEx3.inserir(array);
        MetodoEx3.exibir(array);
        System.out.println("\n");          
    } 
}
