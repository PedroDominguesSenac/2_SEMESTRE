/*
 * 4)	Dado o array com bases nitrogenadas que estruturam o DNA.
 *
 *
 * 0	1	2	3	4	5	6	7	8	9	10	11	12
 * T	G	C	C	G	G	C	C	A	T	A	C	G
 *
 * Elabore um projeto Java com duas classes, a classe principal que contém o array e as 
 * invocações aos métodos definidos na outra classe. Na classe dos métodos, utilize os recursos
 * necessários para determinar a quantidade de cada base nitrogenada armazenada no array. A saída
 * exemplo deve ser nessa ordem e formato:
 *
 * A - 2 vezes C - 5 vezes G - 4 vezes T - 2 vezes 
 * Atenção!
 * O array com as bases nitrogenadas são um exemplo para testar a sua solução. 
 * Mas, ela deve contemplar uma situação geral e não específica.
 * Pontuação: 2,0
 */

package trabalho1;

public class Exercicio4 {
    
    public static void main(String[] args) {
        char bases[] = {'T','G','C','C','G','G','C','C','A','T','A','C','G'};
        MetodoEx4.Exibir(MetodoEx4.selectionSort(bases));

    }

}