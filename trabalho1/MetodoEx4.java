package trabalho1;

public class MetodoEx4 {
    
    public static void Exibir(char bases[]) {
        int p = 0;
        int menor = 0;
        char aux = ' ';
        for(int j=0; j<bases.length-1; j++) {


            if(aux == bases[j]){
                for(int l = 0;aux == bases[j - 1]; l++){
                    j++;
                }
            }


            for(int i=0; i<bases.length; i++) {
               if(bases[j] == bases[i]) {
                   p++;
                   aux = bases[j];
               }
            }

            System.out.println(aux + " - " + p);
            p = 0;

        }
}

    public static char[] selectionSort(char bases[]) {
        char a;
        for(int j=0; j<bases.length-1; j++) {
            int menor = j;
            for(int i=j+1; i<bases.length; i++) {
               if(bases[menor] > bases[i]) {
                  menor = i;
               }
            }
           a = bases[menor];
           bases[menor] = bases[j];
           bases[j] = a;

        }
        return bases;
    }
}