package aula6.selectionsort;

//import java.util.Arrays;

public class UsaSelectionSort {

    public static void main(String[] args) {
        
        //int v[] = {12,3,4,5,56,7};
        
        char v[] = {'r', 'a', 'z', 't'};
        
        //String v[] = {"mel", "Gerson", "sandra", "Gaia", "Tonica", "Mustafa"};
        SelectionSort.selectionSort(v);
        SelectionSort.exibir(v);
        
       System.out.println(Arrays.toString(v));
       
       
    }
    
}
