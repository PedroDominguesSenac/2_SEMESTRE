
package prova1;

class MetodoEx2 {
    
    public static void selectionSort(String array[]) {

        String name;
        
        for (int j = 0; j < array.length - 1; j++) {
            
        int less = j;
        
        for(int i = j+1; i < array.length; i++){
            
            if(array[less].compareTo(array[i]) < 0){
            less = i;
            }
        }
        
        name = array[less];
        array[less] = array[j];
        array[j] = name;
        }

    }

    public static void Exibir(String array[]) {
        for (String v1 : array) {
            System.out.println(v1 + " ");
        }    
        System.out.println("");
    }
}
