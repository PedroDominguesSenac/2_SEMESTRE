package aula6.selectionsort;

public class SelectionSort {
    
    public static void selectionSort(char v[]) {
    
        char temp;
        
        for(int j=0; j<v.length-1; j++) { //Varreduras
           
            int menor = j; //indice 
            
            for(int i=j+1; i<v.length; i++) { //Comparacoes
               if(v[menor] > v[i]) {
                  menor = i;
               }
            }
           // Troca
           temp = v[menor];
           v[menor] = v[j];
           v[j] = temp;
           
        }
}
    public static void exibir(char v[]) {
        
        for(int i=0; i<v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("");
    }
}
