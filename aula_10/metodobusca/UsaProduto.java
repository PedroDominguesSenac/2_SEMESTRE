package aula_10.metodobusca;

public class UsaProduto {
    
    private static Produto[] listaProdutos = new Produto[10];
    private static int i = 0;
    
    public static void main(String[] args) {
        inserir("Sabão", "limpeza", 1234);
        inserir("macarrao", "alimento", 1235);
        inserir("carne", "alimento", 1236);
        exibir();
        
    }
    
    public static void inserir(String nome, String categoria, int id){
        listaProdutos[i] = new Produto();
        listaProdutos[i].setNome(nome);
        listaProdutos[i].setCategoria(categoria);
        listaProdutos[i].setId(id);
        i++;
    }
    
    /**
     * Realiza a busca linear na estrutura  de dados.
     * @param id int
     * @return boolean
     */
    public static boolean buscar(int id) {
        for(int k=0; k<i; k++) {
            if(id == listaProdutos[k].getId()) {
                return true;
            }
        }
        return false;
    }
    
    public static void exibir() {
        for(int k=0; k<i; k++) {
            System.out.println(listaProdutos[k].toString().replace("Produto", "")); //para alterar o override do Produto.java
        }
    }
    
}
