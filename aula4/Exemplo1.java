package aula4;

//import java.util.Arrays;

public class Exemplo1 {
    
    public static void main(String[] args) {
        String[][] cadastro = {{"Nome", " Telefone", " Email", " Endereço"},
                               {"Sandra", " 1234-3332", " sandra@gmail.com", " Rua Xpto"},
                               {"Gerson", " 3214-2222", " gerson@gmail.com", " Rua Xpto"}};
        // Saida
        /*
        for(int i=0; i<cadastro.length; i++) {
           for(int j=0; j<cadastro.length; j++) {
               System.out.print(cadastro[i][j] + "      ");
           }
            System.out.println("");
        }
        */
        
        //System.out.println(Arrays.deepToString(cadastro));
        
        for(String[] linha:cadastro) {
            for(String coluna:linha) {
                System.out.print(coluna + "  ");
            }
            System.out.println("");  
        }
    }
}