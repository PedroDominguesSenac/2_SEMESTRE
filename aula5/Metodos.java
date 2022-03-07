package aula5;

public class Metodos {
    static Pessoa[] lista = new Pessoa[2];
    static int i=0;
    
    public static void inserir(String nome, int idade){
        int id = i+1;
        
        if(i == lista.length){
            lista = alocarNovoArray();
        }
        
      lista[i] = new Pessoa();
      lista[i].id = id;
      lista[i].nome = nome;
      lista[i].idade = idade;
      i++;
    }
    
    private static Pessoa[] alocarNovoArray() {
      Pessoa[] novaLista = new Pessoa[i + 2];
      
        // copiar para novo array
        // System.arraycopy(lista, 0, novaLista, 0, i);
        for(int k = 0; k < i; k++) {
           novaLista[k] = lista[k]; 
        }
        return novaLista;
    }
    
    public static void exibir() {
        for(int k = 0; k < i; k++) {
            System.out.println(lista[k]);
            
        }
    }
    
    private static int pesquisar(int id) {
        for(int k = 0; k < i; k++) {
            if(id == lista[k].id) {
              return k;
            }
        }
            return -1;
    }
    
    public static void remover(int id) {
        int indice = pesquisar(id);
        
        if(indice >= 0) {
            for(int k = indice; k < i; k++) {
                lista[k] = lista[k+1];
            }
            i--;
        }else{
            System.out.println("ID = " + id + " nao existe");
        }  
    }
}
