package aula6;

public class Metodo {
    

    public static void selectionSort(Trabalhador[] v) {
        Trabalhador temp;
        for (int j = 0; j < v.length - 1; j++) { //Varreduras
           int menor=j;//índice
           for(int i=j+1;i<v.length;i++){//Comparações
              if(v[menor].id>v[i].id){
                menor=i;
              }
           }
           //Troca
           temp=v[menor];
           v[menor]=v[j];
           v[j]=temp;
        }
    }
    
    public static void exibir(Trabalhador[] v){
      for(int i=0;i<v.length;i++){
          System.out.println(v[i]+" ");
      }
      System.out.println("");
    }
}
